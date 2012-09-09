/** A Deck class that is used to deal out cards to players and the flop. */
public class Deck {

    private Card[] cardsInDeck;
    private int deckIndex;

    /** A default, shuffled deck with 52 cards. */
    public Deck() {
        int i = 0;
        for (String suit : Card.allSuits) {
            for (int value = 0; value <= 13; value++) {
                cardsInDeck[i++] = new Card(value, suit);
            }
        }
        this.shuffle();
    }

    public Card deal() {
        return cardsInDeck[deckIndex++];
    }

    public void shuffle() {
        Card tmp;
        int i1, i2;
        for (int j = 0; j < 52; j++) {
            i1 = (int) (Math.random() * 52);
            i2 = (int) (Math.random() * 52);
            tmp = cardsInDeck[i1];
            cardsinDeck[i1] = cardsInDeck[i2];
            cardsInDeck[i2] = tmp;
        }
        deckIndex = 0;
    }

}