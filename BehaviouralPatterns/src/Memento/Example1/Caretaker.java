package Memento.Example1;

public class Caretaker {
    private Memento memento;

    public void saveMemento(Memento m) {
        memento = m;
    }

    public Memento getMemento() {
        return memento;
    }
}

