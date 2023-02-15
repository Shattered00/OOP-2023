package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		
		smooth();
		loadStars();

		
		PrintStars();

	}

	public void PrintStars()
	{
		for(Star s:stars)//for s in stars
		{
			System.out.println(s);
		} 
		
	}

	public void drawGrid()
	{
		stroke(69,255,255);
		float border = 50.0f;
		
		int count = 10;
		float gap = (width - (border * 2.0f)) / (float) count;
		for(int i = -5 ; i <= 5 ; i ++)
		{
			float x = border + (gap * (i + 5));
			line(x, border, x, height - border);
			line(border, x, width - border, x);
			fill(69,255,255);
			text(i , x - 5, border -10  );
			text(i , border-17 , x + 5 );
		}
		
	}

	
		
	

	ArrayList<Star> stars = new ArrayList<Star>();// Array List basically malloc and realloc(loadStars)
	void loadStars()
	{
		Table table = loadTable("HabHYG15ly.csv", "header");
		for(TableRow r:table.rows())
		{
			Star s = new Star(r);
			stars.add(s);
		}
	}
	public void drawStars()
	{
		for(Star s:stars)
		{
			float x = map(s.xG, -5, 5, 50, width -50);
			float y = map(s.yG, -5, 5, 50, width -50);
			stroke(255,255,255);
			noFill();
			circle(x, y, s.absMag);

		}
	}
	public void draw()
	{	
		strokeWeight(2);		

		drawGrid();
		drawStars();
		
	}
}
