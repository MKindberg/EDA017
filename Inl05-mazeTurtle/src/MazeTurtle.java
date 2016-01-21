import java.util.Scanner;

import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeTurtle {
	private Turtle t;
	private SimpleWindow w;

	public MazeTurtle(Turtle turtle, SimpleWindow w) {
		t = turtle;
		this.w = w;
		t.penDown();
	}

	public void walk(Maze m) {
		m.draw(w);
		t.jumpTo(m.getXEntry(), m.getYEntry());
		while (!m.atExit(t.getX(), t.getY())) {
			if (m.wallAtLeft(t.getDirection(), t.getX(), t.getY())
					&& m.wallInFront(t.getDirection(), t.getX(), t.getY()))
				t.left(-90);
			else if (m.wallAtLeft(t.getDirection(), t.getX(), t.getY()))
				t.forward(1);
			else {
				t.left(90);
				t.forward(1);
			}
			Maze.delay(20);
		}
	}

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "The aMAZEing turtle");
		Turtle t = new Turtle(w, 0, 0);
		MazeTurtle mt = new MazeTurtle(t, w);
		Scanner s = new Scanner(System.in);
		System.out.println("Vilken labyrint vill du prova?");
		int n = s.nextInt();
		mt.walk(new Maze(n));
	}

}
