package ie.tudublin;


import processing.core.PApplet;
public class forexersice extends PApplet {
    public void settings()
	{
		size(500,500);
	}

	public void setup() {
		//colorMode(HSB);
		background(0);
		
	}
	
    public void draw()
	{
		//int numCircles = 10;
		int numCircles = (int) max(1,mouseX / 10.0f);
		float d = width / (float) numCircles;
		noStroke();
		for(int i = 0; i < numCircles; i++)
		{
			for(int j = 0; j < numCircles; j++)
			{
				float x = (d * 0.5f) + (d*j);
				float y = (d * 0.5f) + (d*i);
				float c = ((i + j)/((numCircles - 1)* 2.0f))* 175.0f;
				fill (c,255,255);
				circle(x,y,d);
			}
		}
		//for(int i = 0; i < numCircles; i++)
		//{
		//
		//	for(int j =0; j < numCircles; j++)
		//	{
		//		fill(i*18, 255,255);
		//		ellipse(i*50 + 25, j* 50 + 25, 50, 50);
		//		fill(i*18, 255,255);
		//		ellipse(j*50 + 25, i* 50 + 25, 50, 50);
		//		
		//		
		//	}
		}
		//Rainbow thing
		//int A= 0;
		//int C = 0;
		//fill(C, 255,255);
		//for(int i = 0; i < 10; i++)
		//{
		//	fill(i*25 , 255,255);
		//	rect(A, 0, 50, 500);
		//	A = A + 50;
		//	
		//}
        
    }

