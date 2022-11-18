package GUI;

import Visitor.DataElement;
import Visitor.ElementVisitor;
import character.Character;
import classdnd.Druid;
import classdnd.Fighter;
import org.json.simple.JSONObject;
import race.Dragonborn;
import race.Human;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        /*ElementVisitor visitor = new ElementVisitor();
        JSONObject jsonObject = new JSONObject();
        FileWriter file = new FileWriter("output.json");

        Character user1 = new Character("Druid Druidich", new Dragonborn(), new Druid());

        List<DataElement> list = new ArrayList<>();
        list.add(user1);
        list.add(user1.getClas());
        list.add(user1.getRace());
        list.add(user1.getAttributes());
        for(DataElement elem:list) {
            jsonObject.putAll(elem.accept((visitor)));
        }
        file.write("[");
        file.write(jsonObject.toJSONString());
        list.clear();

        Character user2 = new Character("Fighter for fridom", new Human(), new Fighter());
        list.add(user2);
        list.add(user2.getClas());
        list.add(user2.getRace());
        list.add(user2.getAttributes());
        for(DataElement elem:list) {
            jsonObject.putAll(elem.accept((visitor)));
        }
        file.write(",");
        file.write(jsonObject.toJSONString());
        file.write("]");
        file.close();*/
    }
}

