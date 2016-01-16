import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class Step1000 {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "1000 steps");
		Turtle t = new Turtle(w, 250, 250);
		Random r = new Random();
		t.penDown();
		for (int i = 0; i < 1000; i++) {
			t.forward(r.nextInt(10) + 1);
			t.left(r.nextInt(360) - 179);
		}
	}
}
