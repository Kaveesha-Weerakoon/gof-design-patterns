package State;

public class StopState implements State {
    public void handle() {
        System.out.println("Player is in STOP state.");
    }
}
