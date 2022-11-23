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
import java.util.Map;
import java.util.TreeMap;

public class Model {
    public static Model getInst() {
        return inst;
    }
    protected static Model inst=new Model();
    protected ArrayList<Character> items = new ArrayList<Character>();
    protected Stats stat;
    protected Map<String, Integer> stats;
    protected CareTaker caretaker = new CareTaker();
    protected Character cha = null;
    protected ElementVisitor visitor = new ElementVisitor();
    protected JSONObject jsonObject = new JSONObject();
    protected JSONArray jarray = new JSONArray();

    public List<Character> getItems() {
        return items;
    }
    public JSONArray getJarray() {
        return jarray;
    }

    public void addToJarray(JSONObject job) {
        this.jarray.add(job);
    }


    public  Stats getStat() {
        return stat;
    }

    public  void setStat(Stats stat) {
        this.stat = stat;
    }

    public void setStats(Map<String, Integer> stats) {
        this.stats = stats;
    }

    public  CareTaker getCaretaker() {
        return caretaker;
    }

    public  Character getCha() {
        return cha;
    }

    public ElementVisitor getVisitor() {
        return visitor;
    }


    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(TreeMap tm) {
        this.jsonObject.putAll(tm);

    }

    void setCha(String name, String race, String cla) {
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
