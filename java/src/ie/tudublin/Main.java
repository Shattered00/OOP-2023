package ie.tudublin;

public class Main
{

	public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

	public static void forexercise()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new forexersice());
    }
	
	public static void main(String[] args)
	{
		forexercise();
	}
	
}