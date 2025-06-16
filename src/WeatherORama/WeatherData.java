package WeatherORama;

import java.util.*;

public class WeatherData implements Subject {

    List<Observer> subscribers;

    public WeatherData() {
        subscribers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        subscribers.add(o);
    }
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }
    public void notifyObservers() {
        for(Observer o : subscribers) {
            o.update();
        }
    }

}
