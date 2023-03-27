package ie.tudublin;
import processing.core.PApplet;
import processing.core.PImage;


public class ForestCampfire extends PApplet 
{
    PImage camp;

    public void settings()
    {
        size(1300, 700);
    }

    public void setup()
    {
        camp = loadImage("mouse.jpg");
        
    }

    public void draw()
    {
        background(0);
        image(camp, 0, 0);
    }
}


