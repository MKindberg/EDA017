package uppg2;

public class Main {

	public static void main(String[] args) {
		int[] nbr = nbrDigits(101, 125, 2);
		for (int i = 0; i < nbr.length; i++) {
			System.out.println(i + ": " + nbr[i]);
		}
	}

	public static int[] nbrDigits(int start, int stop, int interval) {
		int[] res = new int[10];
		for (int i = start; i <= stop; i += interval) {
			int n = i;
			while (n != 0) {
				res[n % 10]++;
				n /= 10;
			}
		}
		return res;
	}
}
