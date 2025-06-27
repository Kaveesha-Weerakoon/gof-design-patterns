package State;

public class Context {
private State currentState;

public void setState(State state) {
    this.currentState = state;
}

public void applyState() {
    currentState.handle();
}
}
