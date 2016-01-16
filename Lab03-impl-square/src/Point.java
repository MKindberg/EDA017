public class Point {
	private int x;	// punktens x-koordinat
	private int y;  // punktens y-koordinat

	/** Skapar en punkt med koordinaterna x,y. */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;	
	}

	/** Tar reda på X-koordinaten. */
	public int getX() {
		return x;
	}

	/** Tar reda på Y-koordinaten. */
	public int getY() {
		return y;
	}
	
	/** Flyttar punkten avståndet dx i x-led, dy i y-led. */
	public void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	/** Returnerar avståndet mellan denna punkt och punkten p. */
	public double distanceTo(Point p) {
		return Math.hypot(x - p.x, y -p.y);
	}
	
	/** Returnerar en teckensträng som representerar punkten. Strängen
	    innehåller punktens koordinater. Ex: 150 200 */
	public String toString() {
		return x + " " + y;
	}
}
