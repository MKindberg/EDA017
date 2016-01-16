public class NumberToGuess {

	/** Skapar ett objekt med ett slumpmässigt valt heltal i 
	    intervallet [min, max]. */
	public NumberToGuess(int min, int max) {
	}

	/** Tag reda på minsta möjliga värde talet kan ha. */
	public int getMin() {
		return 0;
	}

	/** Tag reda på största möjliga värde talet kan ha. */
	public int getMax() {
		return 0;
	}

	/** Tar reda på om talet är lika med guess. */
	public boolean isEqual(int guess) {
		return false;
	}

	/** Tar reda på om talet är större än guess. */
	public boolean isBiggerThan(int guess) {
		return false;
	}
}
