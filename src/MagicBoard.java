import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {
    private boolean WeNeedBike;
    private boolean WeNeedDoll;

    public void MakeABike(){
        System.out.println("Santa: We need to make a bike");
        this.WeNeedBike = true;
    }

    public void MakeADoll(){
        System.out.println("Santa: We need to make a doll");
        this.WeNeedDoll = true;
    }


    private List<Observer> observers;

    private String toy;

    public MagicBoard() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setToy(this);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
        this.notifyObservers();
    }
}
