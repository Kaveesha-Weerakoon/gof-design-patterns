package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    public void notifySubscribers(String videoTitle) {
        for (Observer o : subscribers) {
            o.update("New Video Uploaded: " + videoTitle);
        }
    }
}
