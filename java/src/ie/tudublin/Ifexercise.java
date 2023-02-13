package ie.tudublin;

import processing.core.PApplet;

public class Ifexercise extends PApplet
{
    public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB);
		background(0);
		
	}

    public void draw()
	{
		//background(0);
        noStroke();
        rect(155,190,200,100);
        //rect(mouseX-100,mouseY-50,200,100);//This recangle is being followed by the cursor.
		if(mouseX > 155 && mouseX < 355 && mouseY > 190 && mouseY < 290  )
        {
            fill(255,0,0);
             
        }
        else
        {
            fill(0,0,255);
        }
        
    }
}
