package State;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context player = new Context();

        State start = new StartState();
        State stop = new StopState();

        player.setState(start);
        player.applyState();  // Output: Player is in START state.

        player.setState(stop);
        player.applyState();  // Output: Player is in STOP state.
    }
}