
public class TestSquareContain {
	public static void main(String[] args) {
		boolean[] test = new boolean[7];
		Square sq = new Square(100, 100, 100);
		test[0] = sq.contains(120, 120);
		test[1] = sq.contains(110, 99);
		test[2] = sq.contains(new Point(120, 120));
		test[3] = sq.contains(new Point(201, 100));
		test[4] = sq.contains(new Square(101, 101, 98));
		test[5] = sq.contains(new Square(100, 101, 99));
		test[6] = sq.contains(new Square(90, 10, 10));
		for (boolean b : test) {
			System.out.println(b);
		}
	}
}
