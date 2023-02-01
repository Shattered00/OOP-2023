package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);

		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{
		noStroke();
		fill(0);
		circle(250,mouseY,mouseY);

		//All seeing eye drawing
		//fill(255,255,0);
		//circle(250,310,400);
		//fill(0,255,255);
		//triangle(250,0,30,450,470,450);
		//fill(255,255,255);
		//ellipse(250, 200, 170, 100);
		//fill(0);
		//circle(250,200,50);
		//noStroke();

		
		
		//stroke(225);
		//line(10,10,100,100);//x1 y1, x2 ,y2
		//circle(300,250,70);//circle ccx,cy,d
		//fill(0,255,0);
		//rect(10,300,10,100);// tlx, tly,
		//stroke(127);
		//fill(0,0,255);
		//noStroke();
		//noFill();
		//strokeWeight(1);
		//triangle(300,20,40,80,60,20);
		//fill(0, 0, 255);
	
	}
}
