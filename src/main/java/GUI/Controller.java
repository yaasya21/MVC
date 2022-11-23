package GUI;

import Factory.RaceFactory;
import Memento.MementoPattern;
import Visitor.DataElement;
import character.Character;
import character.Stats;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static GUI.Model.getInst;

public class Controller {

    private static Model mode = getInst();
    private static int id=0;
    private static String[] listData=new String[5];//only 5 characters alowed

    public static void generateStats(DnDFrame df){
        String race = df.comboBox1.getSelectedItem().toString();

        mode.setStat(Stats.generate(RaceFactory.getRace(race)));
        df.a0TextField.setText(mode.getStat().getStats().get("strength").toString());
        df.a0TextField1.setText(mode.getStat().getStats().get("dexterity").toString());
        df.a0TextField2.setText(mode.getStat().getStats().get("constitution").toString());
        df.a0TextField3.setText(mode.getStat().getStats().get("intelligence").toString());
        df.a0TextField4.setText(mode.getStat().getStats().get("wisdom").toString());
        df.a0TextField5.setText(mode.getStat().getStats().get("charisma").toString());
    }

    public static void runMemento(DnDFrame df){
        if(!mode.getStat().equals(null)){
            mode.getCaretaker().add(mode.getStat().saveStateToMemento());
            df.textArea2.setText("Attributes saved");
        }
    }

    public static void returnMemento(DnDFrame df){
        try{
            if(mode.getCaretaker().getId() > 0) {
                mode.getStat().getSateFromMemento((MementoPattern) mode.getCaretaker().removeLast());
                df.a0TextField.setText(mode.getStat().getStats().get("strength").toString());
                df.a0TextField1.setText(mode.getStat().getStats().get("dexterity").toString());
                df.a0TextField2.setText(mode.getStat().getStats().get("constitution").toString());
                df.a0TextField3.setText(mode.getStat().getStats().get("intelligence").toString());
                df.a0TextField4.setText(mode.getStat().getStats().get("wisdom").toString());
                df.a0TextField5.setText(mode.getStat().getStats().get("charisma").toString());
            }
            else {
                df.textArea2.setText("No more attributes saved");
            }
        }
        catch(NullPointerException ex){
            df.textArea2.setText("No saved attributes found");
        }
        catch (IndexOutOfBoundsException ex) {
            df.textArea2.setText("No more attributes saved");
        }
    }

    public static void clear(DnDFrame df){
        try {
            if(mode.getCaretaker().getId() > 0) {
                mode.getStat().getSateFromMemento((MementoPattern) mode.getCaretaker().getLast());
                df.a0TextField.setText(mode.getStat().getStats().get("strength").toString());
                df.a0TextField1.setText(mode.getStat().getStats().get("dexterity").toString());
                df.a0TextField2.setText(mode.getStat().getStats().get("constitution").toString());
                df.a0TextField3.setText(mode.getStat().getStats().get("intelligence").toString());
                df.a0TextField4.setText(mode.getStat().getStats().get("wisdom").toString());
                df.a0TextField5.setText(mode.getStat().getStats().get("charisma").toString());
            }
            else {
                df.textArea2.setText("No more attributes saved");
            }
        }catch (IndexOutOfBoundsException ex) {
            df.textArea2.setText("No more attributes saved");
        }
    }
    public static void createCharacter(DnDFrame df){
        if(mode.getStat()!=null){
            if(id<5) {
                String name = df.textField1.getText().toString();
                String race= df.comboBox1.getSelectedItem().toString();
                String cla= df.comboBox2.getSelectedItem().toString();
                mode.setCha(name, race, cla);
                mode.getCha().setAttributes(mode.getStat());
                mode.addItem(mode.getCha());
                mode.getVisitor().visit(mode.getCha());
                df.textArea2.setText("Character " + name + " was created!");
                listData[id] = race + "-" + cla + " " + name;
                df.list1.setListData(listData);
                id++;
            }
            else {
                df.textArea2.setText("You can create only 5 characters maximum");
            }
        }
        else {
            df.textArea2.setText("Please, generate attributes before creating character");
        }
    }

    public static void saveJSON(DnDFrame df) throws IOException {
        String str="[\n";

        for(Character ch:mode.getItems()){
            mode.getJsonObject().clear();
            List<DataElement> list = new ArrayList<>();
            list.add(ch);
            list.add(ch.getClas());
            list.add(ch.getRace());
            list.add(ch.getAttributes());


            for(DataElement elem:list){
                mode.setJsonObject(elem.accept(mode.getVisitor()));
            }
            str += mode.getJsonObject().toJSONString();
            str += "\n";

            if(mode.getItems().indexOf(ch)!=mode.getItems().size()-1){str+=",";}
        }

        str+="]";
        df.textPane1.setText(str);
        FileWriter file = new FileWriter("output.json");
        file.write(str);
        file.close();
    }
    static void printSelected(DnDFrame df) {
        df.textPane1.setText("");
        df.textPane1.setText(mode.getItem(df.list1.getSelectedIndex()).toString());
    }
}
