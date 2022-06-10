public interface Observable {

    void subscribe(Observer observer);
    void notifyObservers();
    String getUpdate();
}