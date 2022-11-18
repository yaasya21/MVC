package Memento;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Object> mementoList = new ArrayList<Object>();
    static int Id = 0;

    public int getId() {
        return (Id-1);
    }

    public void add(Object obj) {
        mementoList.add(obj);
        System.out.println("State " + Id + " saved");
        Id++;
    }

    public Object get(int getId) {
        System.out.println("State " + getId + " loaded:");
        return mementoList.get((getId));
    }

    public Object getLast() {
        System.out.println("State " + Id + " loaded:");
        return mementoList.get((Id));
    }
}