package Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        TV samsung = new SamsungTV();
        RemoteControl remote1 = new BasicRemote(samsung);
        remote1.pressPowerButton();  // Turns on
        remote1.pressPowerButton();  // Turns off

        TV sony = new SonyTV();
        RemoteControl remote2 = new BasicRemote(sony);
        remote2.pressPowerButton();  // Turns on Sony TV
    }
}

