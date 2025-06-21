package Memento;

public class MemntoPattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        caretaker.saveMemento(originator.saveState()); // Save snapshot

        originator.setState("State #2"); // Make change

        System.out.println("Current State: " + originator.getState());

        originator.restoreState(caretaker.getMemento()); // Undo
        System.out.println("Restored State: " + originator.getState());
    }
}
