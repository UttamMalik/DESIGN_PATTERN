package BEHAVIOURAL_DESIGN_PATTERN.Observer_design_pattern;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
    public void register();
    public void Unregister();
}
