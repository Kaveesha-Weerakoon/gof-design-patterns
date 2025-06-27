package State;

public class StartState implements State {
    public void handle() {
        System.out.println("Player is in START state.");
    }
}