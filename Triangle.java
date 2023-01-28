import java.awt.Color;
import edu.gatech.mediaprogramming.*;
public class Triangle extends Turtle
{
	public void drawTriangle(int depth, double distance)
	{
		if(depth == 0)
		{
			forward(distance);
			turn(-120);
			forward(distance);
			turn(-120);
			forward(distance);
			turn(-120);
		}
		else
		{
			drawTriangle(depth-1, distance / 2);
			this.penUp();
			forward(distance / 2);
			this.penDown();
			drawTriangle(depth -1, distance / 2);
			turn(-120);
			this.penUp();
			forward(distance / 2);
			this.penDown();
			turn(120);
			drawTriangle(depth -1, distance / 2);
			turn(120);
			this.penUp();
			forward(distance/2);
			this.penDown();
			turn(-120);
		}
	}
	public void drawSquare(int depth, double distance)
	{
		if(depth == 0)
		{
			turn(-90);
			forward(distance);
			turn(90);
			forward(distance);
			turn(90);
			forward(distance);
			turn(90);
			forward(distance);
			turn(180);
//			forward(distance);
//			turn(-90);
//			forward(distance);
//			turn(-90);
//			forward(distance);
//			turn(-90);
//			forward(distance);
//			turn(-90);
		}
		else
		{
			drawSquare(depth-1, distance/2);
			forward(distance/2);
			drawSquare(depth-1, distance/2);
			turn(-90);
			forward(distance/2);
			turn(90);
			drawSquare(depth -1, distance /2);
			backward(distance/2);
			drawSquare(depth-1, distance/2);  
			turn(90);
			forward(distance / 2);
			turn(-90);
		}
	}
	//https://larryriddle.agnesscott.org/ifs/pentagon/pentagon.htm
	public void drawPentagon(int depth, double distance)
	{
		if(depth == 0)
		{
			forward(distance);
			turn(-72);
			forward(distance);
			turn(-72);
			forward(distance);
			turn(-72);
			forward(distance);
			turn(-72);
			forward(distance);
			turn(-72);
		}
		else
		{
//			drawPentagon(depth -1, (distance * 0.381966));
//			forward(distance * 0.763932);
//			drawPentagon(depth -1, (distance * 0.381966));
//			backward(distance * 0.763932);
//			turn(-108);
//			forward(distance * 0.763932);
//			turn(108);
//			drawPentagon(depth -1, (distance * 0.381966));
//			forward(distance * 0.381966);
//			turn(-72);
//			forward(distance * 0.381966);
//			turn(72);
//			drawPentagon(depth -1, (distance * 0.381966));
//			drawPentagon(depth -1, (distance * 0.381966));
			drawPentagon(depth -1, (distance * 0.381966));
			forward(distance * 0.381966);
			turn(72);
			drawPentagon(depth -1, (distance * 0.381966));
			forward(distance * 0.381966);
			turn(72);
			drawPentagon(depth -1, (distance * 0.381966));
			forward(distance * 0.381966);
			turn(72);
			drawPentagon(depth -1, (distance * 0.381966));
			forward(distance * 0.381966);
			turn(72);
			drawPentagon(depth -1, (distance * 0.381966));
			forward(distance * 0.381966);
			turn(72);
		}
	}
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.penUp();
		t.moveTo(200, 350);
		t.setColor(Color.BLACK);
		t.penDown();
		t.turn(90);
		t.drawTriangle(6,  300);
		t.drawSquare(5, 400);
		t.drawPentagon(5, 400);
	}
}
