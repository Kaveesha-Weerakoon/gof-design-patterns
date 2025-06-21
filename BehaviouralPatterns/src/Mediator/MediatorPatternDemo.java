package Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User john = new User("John", chatRoom);
        User jane = new User("Jane", chatRoom);

        john.send("Hello Jane!");
        jane.send("Hi John! How are you?");
    }
}

