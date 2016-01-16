import java.util.Scanner;

import se.lth.cs.pt.window.SimpleWindow;

public class SquareDrawer {
	private Scanner scan;
	private SimpleWindow w;

	public SquareDrawer() {
		scan = new Scanner(System.in);
		w = new SimpleWindow(600, 200, "Kvadratritarfönster");
	}

	public void runApplication() {
		System.out.println("*** Välkommen till ett textbaserat ritprogram ***");

		while (true) {
			System.out.println("Skriv in kvadratens sidlängd: ");
			int side = scan.nextInt();
			System.out.println("Skriv in kvadratens x-position: ");
			int x = scan.nextInt();
			System.out.println("Skriv in kvadratens y-position: ");
			int y = scan.nextInt();

			// Kolla om hela kvadraten ligger innanför fönstret
			if (x + side < w.getHeight() && y + side < w.getWidth()) {
				Square sq = new Square(side, x, y);
				sq.draw(w);
				System.out.println("Kvadraten är nu uppritad.");
			} else {
				System.out.println("Kvadraten får inte plats i fönstret. Försök rita upp en ny.");
			}
		}
	}

	public static void main(String[] args) {
		SquareDrawer sq = new SquareDrawer();
		sq.runApplication();
	}
}
