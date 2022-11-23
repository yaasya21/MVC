package Memento;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Object> mementoList = new ArrayList<Object>();
    static int Id = -1;

    public int getId() {
        return (Id);
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void add(Object obj) {
        Id++;
        mementoList.add(Id, obj);
        System.out.println("State " + (Id) + " saved");
    }

    public Object removeLast() {
        Id--;
        System.out.println("State " + Id + " removed");
        return mementoList.get(Id);
    }

    public Object get(int getId) {
        System.out.println("State " + getId + " loaded:");
        return mementoList.get(getId);
    }

    public Object getLast() {
        System.out.println("State " + (Id + " loaded:"));
        return mementoList.get(Id);
    }
}