
public class OptimalGuesser {
	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int maxG = 0;
		NumberToGuess n;
		for (int i = 0; i < 10000; i++) {
			n = new NumberToGuess(min, max);
			int g = nbrGuesses(n);
			if (maxG < g)
				maxG = g;
		}
		System.out.println(maxG);
	}

	public static int nbrGuesses(NumberToGuess n) {
		int min = n.getMin();
		int max = n.getMax();
		int guess = (max + min) / 2;
		int i = 1;
		for (; !n.isEqual(guess); i++) {
			if (n.isBiggerThan(guess))
				min = guess + 1;
			else
				max = guess - 1;
			guess = (max + min) / 2;

		}
		return i;
	}
}
