package GUI;

import Factory.ClassFactory;
import Factory.RaceFactory;
import Memento.CareTaker;
import Visitor.ElementVisitor;
import character.Character;
import character.Stats;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Model {
    public static Model getInst() {
        return inst;
    }
    protected static Model inst=new Model();
    protected ArrayList<Character> items=new ArrayList<Character>();
    protected Stats stat;
    protected CareTaker caretaker;
    protected Character cha = null;
    protected ElementVisitor visitor=new ElementVisitor();
    protected JSONObject jsonObject = new JSONObject();
    protected JSONArray jarray=new JSONArray();

    public List<Character> getItems() {
        return items;
    }
    public JSONArray getJarray() {
        return jarray;
    }

    public void add2Jarray(JSONObject job) {
        this.jarray.add(job);
    }


    public  Stats getStat() {
        return stat;
    }

    public  void setStat(Stats stat) {
        this.stat = stat;
    }

    public  CareTaker getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(CareTaker caretaker) {
        this.caretaker = caretaker;
    }

    public  Character getCha() {
        return cha;
    }

    public ElementVisitor getVisitor() {
        return visitor;
    }

    public  void setVisitor(ElementVisitor visitor) {
        this.visitor = visitor;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(TreeMap tm) {
        this.jsonObject.putAll(tm);

    }

    void setCha(String name, String cla, String race) {
        this.cha = new Character(name, RaceFactory.getRace(race), ClassFactory.getClass(cla));
    }

    public Character getItem(int i) {
        return items.get(i);
    }

    public void addItem(Character it) {
        this.items.add(it);
    }
    public void deleteItem(int it) {
        this.items.remove(it);
    }
}
