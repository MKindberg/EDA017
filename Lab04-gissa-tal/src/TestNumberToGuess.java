
public class TestNumberToGuess {
	public static void main(String[] args) {
		NumberToGuess nbrGen = new NumberToGuess(1, 100);
		if (nbrGen.getMin() != 1) {
			System.out.println("getMin ger fel resultat");
		} else {
			System.out.println("getMin ok");
		}
		if (nbrGen.getMax() != 100) {
			System.out.println("getMax ger fel resultat");
		} else {
			System.out.println("getMax ok");
		}
		int solution = -1;
		int nbrCorrect = 0;
		for (int i = 1; i <= 100; i++)  {
			if (nbrGen.isEqual(i)) {
				solution = i;
				nbrCorrect++;
			}
		}
		if (nbrCorrect != 1) {
			System.out.println("fel i isEqual eller i konstruktor");
		} else {
			System.out.println("isEqual ok");
		}
		if (!nbrGen.isBiggerThan(solution- 1) || nbrGen.isBiggerThan(solution) || 
				nbrGen.isBiggerThan(solution + 1)) {
			System.out.println("isBiggerThan ger fel resultat");
		} else {
			System.out.println("isBiggerThan ok");
		}
		
		try {
			NumberToGuess five = new NumberToGuess(5, 5);
			if (five.getMax() == 5 && five.getMin() == 5) {
				System.out.println("intervall av längd 1 ok");
			} else {
				System.out.println("intervall av längd 1 ger fel resultat");
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println("intervall av längd 1 ger exekveringsfel (" + e + ")");
		}
	}
}
