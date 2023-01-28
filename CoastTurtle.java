import java.awt.Color;
import edu.gatech.mediaprogramming.*;
public class CoastTurtle extends Turtle
{
	public void drawKochCurve(int depth, double length)
	{
		if(depth == 0)
		{
			forward(length);
		}
		else
		{
			drawKochCurve(depth-1, length /3);
			turn(-60);
			drawKochCurve(depth-1, length /3);
			turn(120);
			drawKochCurve(depth-1, length /3);
			turn(-60);
			drawKochCurve(depth-1, length /3);
		}
	}
	public void drawRecCurve(int depth, double length)
	{
		if(depth == 0)
		{
			forward(length);
		}
		else
		{
			drawRecCurve(depth -1, length /3);
			turn(90);
			drawRecCurve(depth-1, length/3);
			turn(-90);
			drawRecCurve(depth-1, length/3);
			turn(90);
			drawRecCurve(depth-1, length/3);
			turn(-90);
			drawRecCurve(depth-1, length/3);
		}
	}
	public void drawTrapCurve(int depth, double length)
	{
		if(depth == 0)
		{
			forward(length);
		}
		else
		{
			drawTrapCurve(depth -1, length/3);
			turn(-60);
			drawTrapCurve(depth -1, length /3);
			turn(60);
			drawTrapCurve(depth -1, length /3);
			turn(60);
			drawTrapCurve(depth -1, length /3);
			turn(-60);
			drawTrapCurve(depth -1, length /3);
		}
	}
	public static void main(String[] args)
	{
		CoastTurtle c = new CoastTurtle();
		c.penUp();
		c.moveTo(100, 350);
		c.setColor(Color.BLACK);
		c.penDown();
		c.turn(90);
		c.drawKochCurve(4,  300);
		c.drawRecCurve(4, 200);
		c.penUp();
		c.moveTo(100, 200);
		c.penDown();
		c.drawTrapCurve(4, 200);
	}
}
