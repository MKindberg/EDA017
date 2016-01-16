public class ArrayExample {
	public static void main(String[] args) {
		Card[] theCards = new Card[52];
		theCards[0] = new Card(Card.SPADES, 12);
		theCards[1] = new Card(Card.HEARTS, 13);
		System.out.println(theCards[0]);
		System.out.println(theCards[1]);
	}
}
