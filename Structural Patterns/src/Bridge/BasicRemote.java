package Bridge;

class BasicRemote extends RemoteControl {

    private boolean isOn = false;

    public BasicRemote(TV tv) {
        super(tv);
    }

    @Override
    public void pressPowerButton() {
        if (isOn) {
            tv.turnOff();
            isOn = false;
        } else {
            tv.turnOn();
            isOn = true;
        }
    }
}

