/** A Deck class that is used to deal out cards to players and the flop. */
public class Deck {

    private Card cardsInDeck;

    /** A default, shuffled deck with 52 cards. */
    public Deck() {
        for (String suit : Card.allSuits) {
            for (int value = 0; value <= 13; value++) {
                cardsInDeck.offer(new Card(value, suit));
            }
        }
    }

    public Card deal() {
        
    }

}