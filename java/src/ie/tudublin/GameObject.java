package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class GameObject {
    protected PVector pos;
    protected float rot;
    protected PVector forward;
    
    public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRot() {
        return rot;
    }
    public void setRot(float rot) {
        this.rot = rot;
    }
    public PVector getForward() {
        return forward;
    }
    public void setForward(PVector forward) {
        this.forward = forward;
    }
    public PApplet getP() {
        return p;
    }
    public void setP(PApplet p) {
        this.p = p;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    
    PApplet p;
    int c;
    public GameObject(float x, float y, float rot, int c, PApplet p)
    {
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.p = p;
        this.rot = rot;
        this.c = c;
    }

}

