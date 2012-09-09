/** A Card class that creates cards with both a specific suit and a value */
public class Card {
    private int _value;
    private String _suit;
    public Card(int startValue, String startSuit) {
        if (Arrays.binarySearch(allSuits, startSuit) < 0) {
            throw new IllegalArgumentException("unrecognized suit");
        }
        if (startValue < 1 || startValue > 13) {
            throw new IllegalArgumentException("unrecognized card value");
        }
        _value = startValue;
        _suit = startSuit;
    }
    public static String[] allSuits =
        { "Clubs", "Diamonds", "Hearts", "Spades" };
    public int value() {
        return _value;
    }
    public String suit() {
        return _suit;
    }
    public String valueToString() {
        if (_value >= 2 && _value <= 10) {
            return Integer.toString(_value);
        } else if (_value == 1) {
            return "A";
        } else if (_value == 11) {
            return "J";
        } else if (_value == 12) {
            return "Q";
        } else {
            return "K";
        }
    }
}