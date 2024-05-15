package BEHAVIOURAL_DESIGN_PATTERN.Observer_design_pattern;

public class WeatherStation {
    public static void main(String[] args) {
        //Publisher created
        WeatherData weatherData = new WeatherData();

        // Creating Subscriber
        Observer currDisplay = new CurrDisplay(weatherData);
        Observer forcastDisplay = new ForcastDisplay(weatherData);

        // update
        weatherData.update(80.0f,65.1f,35.4f);
        weatherData.update(67.0f,45.1f,32.4f);

        // unregistering
        currDisplay.Unregister();

        weatherData.update(68.0f,46.1f,82.4f);

        currDisplay.register();
        weatherData.update(67.0f,45.1f,32.4f);
    }
}
