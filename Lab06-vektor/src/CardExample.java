public class CardExample {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		while (deck.moreCards()) {
			Card c = deck.getCard();
			System.out.println(c);
		}
	}
}
