package Bridge;

abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    abstract void pressPowerButton();
}
