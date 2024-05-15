package BEHAVIOURAL_DESIGN_PATTERN.Observer_design_pattern;

public class CurrDisplay implements Observer,Display{
    private Publisher publisher;
    private float temperature;
    private float humidity;
    private float pressure;
    CurrDisplay(Publisher publisher){
        this.publisher = publisher;
        publisher.regsiterSubscriber(this);
    }
    @Override
    public void display(float temperature, float humidity, float pressure) {
        System.out.println("Current Display :- ");
        System.out.println("temperature :- "+temperature+" , humidity :- "+humidity+" , pressure :- "+pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display(temperature, humidity, pressure);
    }

    @Override
    public void register() {
        publisher.regsiterSubscriber(this);
    }

    @Override
    public void Unregister() {
        publisher.unregisterSubscriber(this);
    }
    
    public void updatePublisher(Publisher publisher){
        this.publisher = publisher;
    }
}
