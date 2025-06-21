package Observer;

public class Main {
    public static void main(String[] args) {
        Channel myChannel = new Channel();

        Observer user1 = new Subscriber("Alice");
        Observer user2 = new Subscriber("Bob");

        myChannel.subscribe(user1);
        myChannel.subscribe(user2);

        myChannel.notifySubscribers("Observer Pattern Tutorial");
    }
}