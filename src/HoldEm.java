import java.util.Arrays;

/** Texas Hold'Em Game */
public class HoldEm {

    private Player[] players = new Player[9];
    private Deck d = new Deck();
    private bigBlindSize;

    public static void main(String[] args) {
        initialize(args);
        while (true) {
            System.out.println("Cool bet logic happening");
        }
    }

    private void initialize(String[] args) {
        if (args.length < 1) {
            int stackSize = 100;
        } else {
            int stackSize = args[0];
        }
        if (args.length < 2) {
            bigBlindSize = 4;
        } else {
            bigBlindSize = args[1];
        }
        for (int i = 0; i < 9; i++) {
            players[i] = new Player("Player" + Integer.toString(i),
                                    i, stackSize);
        }
    }

}