package BEHAVIOURAL_DESIGN_PATTERN.Observer_design_pattern;

public interface Publisher {
    public void regsiterSubscriber(Observer observer);
    public void unregisterSubscriber(Observer observer);
    public void notifyAllSubscriber();
}
