import java.util.Random;

public class CardDeck {

	private Card[] cards;
	private int current; // index för "nästa" kort
	private static Random rand = new Random();

	/** Skapar en kortlek. */
	public CardDeck() {
		cards = new Card[52];
		current = 0;
		for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++)
			for (int rank = 1; rank < 14; rank++) {
				cards[current] = new Card(suit, rank);
				current++;
			}
		current = 0;
	}

	/** Blandar kortleken. */
	public void shuffle() {
		for (int i = 51; i > 0; i--) {
			int nbr = rand.nextInt(i + 1);
			Card temp = cards[i];
			cards[i] = cards[nbr];
			cards[nbr] = temp;
		}
		current = 0;
	}

	/** Tar reda på om det finns fler kort i kortleken. */
	public boolean moreCards() {
		return current != 52;
	}

	/**
	 * Drar det översta kortet i leken.
	 * 
	 * @return Returnerar kortet om det går att dra fler kort, annars null.
	 */
	public Card getCard() {
		if (moreCards()) {
			current++;
			return cards[current - 1];
		}
		return null;
	}

}
