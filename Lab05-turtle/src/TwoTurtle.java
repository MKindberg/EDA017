import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class TwoTurtle {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "Two turtles");
		Turtle t1 = new Turtle(w, 250, 250);
		Turtle t2 = new Turtle(w, 350, 350);
		Random r = new Random();
		t1.penDown();
		t2.penDown();
		double xDist = t1.getX() - t2.getX();
		double yDist = t1.getY() - t2.getY();
		while (Math.sqrt(xDist * xDist + yDist * yDist) >= 50) {
			t1.forward(r.nextInt(10) + 1);
			t1.left(r.nextInt(360) - 179);
			t2.forward(r.nextInt(10) + 1);
			t2.left(r.nextInt(360) - 179);
			SimpleWindow.delay(10);
			xDist = t1.getX() - t2.getX();
			yDist = t1.getY() - t2.getY();
		}
	}
}
