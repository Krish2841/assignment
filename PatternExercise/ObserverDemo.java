package PatternExercise;
import java.util.*;

interface Observer {
    void update(int temperature);
}

class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    void addObserver(Observer o) { observers.add(o); }
    void setTemperature(int temp) {
        this.temperature = temp;
        notifyAllObservers();
    }

    void notifyAllObservers() {
        for (Observer o : observers)
            o.update(temperature);
    }
}

class DisplayScreen implements Observer {
    String name;
    DisplayScreen(String name) { this.name = name; }
    
    public void update(int temperature) {
        System.out.println(name + " Display: Temperature is " + temperature + "°C");
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.addObserver(new DisplayScreen("Screen 1"));
        station.addObserver(new DisplayScreen("Screen 2"));

        station.setTemperature(25);
        station.setTemperature(30);
    }
}

