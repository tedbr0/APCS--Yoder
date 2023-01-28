import java.awt.Color;
import edu.gatech.mediaprogramming.*;
public class TreeTurtle extends Turtle
{
	/**
	 * Assumption: Turtle always returns to its initial state
	 * at the base of the tree or subtree it has just drawn.
	 * @param depth: depth of the recursion; 0 is base case
	 * @param distance: length of the trunk at this stage
	 */
	public void drawTree(int depth, double distance)
	{
		//Base case
		if(depth == 1)
		{
			forward(distance);
			backward(distance); //return to base
		}
		else
		{
			forward(distance); //draw trunk
			//draw right subtree
			turn(45); 
			drawTree(depth - 1, distance * 0.50);
			//draw left subtree
			turn(-90);
			drawTree(depth - 1, distance * 0.50);
			turn(45);
			backward(distance);
		}
	}
	
	public void drawFern(int depth, double distance)
	{
		if(depth == 1)
		{
			forward(distance);
			backward(distance);
		}
		else
		{
			forward(distance); //draw trunk
			turn(45);
			drawFern(depth -1, distance * 0.75);
			turn(-90);
			drawFern(depth -1, distance * 0.75);
			turn(45);
			forward(distance); //draw trunk2
			turn(45);
			drawFern(depth -1, distance * 0.75);
			turn(-90);
			drawFern(depth -1, distance * 0.75);
			turn(45);
			backward(distance * 2);
//			forward(distance * 0.5);
//			turn(-90);
//			forward(distance * 0.5);
//			turn(-30);
//			drawTPole(depth -1, distance * 0.25);
//			turn(30);
//			backward(distance);
//			turn(120);
//			drawTPole(depth -1, distance * 0.25);
//			turn(-120);
//			forward(distance /2);
//			turn(90);
//			backward(distance);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Fractalions!");
		TreeTurtle t = new TreeTurtle();
		t.penUp();
		t.moveTo(100, 350);
		t.setColor(Color.BLACK);
		t.penDown();
		t.turn(90);
		t.drawTree(14, 100);
		t.penUp();
		t.moveTo(200, 150);
		t.penDown();
		t.drawFern(4, 100);
	}
}
