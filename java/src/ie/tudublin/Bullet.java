package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Bullet {
    PVector pos;
    float rot;
    float speed;
    PVector foward;
    PApplet p;
    
    public Bullet(float x, float y,float rot ,PApplet p)
    {
        pos = new PVector(x,y);
        foward = new PVector(0,-1);
        speed = 5;
        this.p = p;
        this.rot = rot;
        /*
        PVector a = new PVector(10,10);
        PVector b = new PVector(20,20);

        b = a;

        b.x = 30;
        b.y = 30;

        p.println(a); 
        */
    }

    void render()
    {
        p.pushMatrix();
        p.translate(pos.x,pos.y);
        p.rotate(rot);
        p.line(0,-5,0,5);

        p.popMatrix();
    }
    
    void move()
    {
        foward.x = PApplet.sin(rot);
        foward.y = - PApplet.cos(rot);

        pos.add(PVector.mult(foward,speed));
    }
}
