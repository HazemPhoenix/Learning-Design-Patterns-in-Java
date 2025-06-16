package WeatherORama;

import java.util.*;

public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;

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
            o.update(this.temp, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
