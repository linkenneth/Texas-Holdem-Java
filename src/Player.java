/** Players of the game Texas Hold'Em */
public class Player {
    private _name;
    private _position;
    private _stackSize;
    public Player(string startName, int startPosition, int startStackSize) {
        _name = startName;
        _position = startPosition;
        _stackSize = startStackSize;
    }
    public void raise(int amount) {
        if (amount < _stackSize) {
            throw new IllegalArgumentException("not enough gold");
    }
    public void call(int amount) {
    }
    public void fold() {
    }
    public void reveal() {
    }
    

    public String name() {
        return _name;
    }
    public int position() {
        return _position;
    }
    public int stackSize() {
        return _stackSize;
    }
}