package ie.tudublin;
import processing.core.PApplet;
import processing.core.PImage;


public class ForestCampfire extends PApplet 
{
    PImage img;
    public void setup()
    {
        size(1000, 600);
        img = loadImage("forestcampfire.jpg");
    }

    public void draw()
    {
        background(0);
        image(img, 0 , 0);
    }
}


