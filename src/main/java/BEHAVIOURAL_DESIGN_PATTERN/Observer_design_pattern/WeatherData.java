package BEHAVIOURAL_DESIGN_PATTERN.Observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher{
    private List<Observer> list;
    private float temperature;
    private float humidity;
    private float pressure;
    WeatherData(){
        list = new ArrayList<>();
    }
    @Override
    public void regsiterSubscriber(Observer observer) {
        list.add(observer);
        System.out.println(observer.getClass()+" registerd !! ");
    }

    @Override
    public void unregisterSubscriber(Observer observer) {
        list.remove(observer);
        System.out.println(observer.getClass()+" Unregisterd !! ");
    }

    @Override
    public void notifyAllSubscriber() {
        System.out.println("----------- NOTIFYING ALL ------------");
        for(Observer curr : list){
            curr.update(temperature,humidity,pressure);
        }
        System.out.println("---------------------------------------");
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllSubscriber();
    }
}
