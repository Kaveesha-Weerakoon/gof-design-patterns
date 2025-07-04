package Command;
public class CommandPatternDemo {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();  // Output: The light is ON

        remote.setCommand(lightOff);
        remote.pressButton();  // Output: The light is OFF
    }
}
