package GUI;

import Memento.CareTaker;
import character.Stats;

import static GUI.Model.getInst;

public class Controller {

    private static Model mode = getInst();
    private int it=0;
    private String[] listData=new String[5];//only 5 characters alowed

    public static void generateStats(){
        mode.setStat(Stats.generate(mode.getCha().getRace()));
        DnDFrame.a0TextField.setText(mode.getStat().getStats().get("Strength").toString());
        DnDFrame.a0TextField1.setText(mode.getStat().getStats().get("Dexterity").toString());
        DnDFrame.a0TextField2.setText(mode.getStat().getStats().get("Constitution").toString());
        DnDFrame.a0TextField3.setText(mode.getStat().getStats().get("Intelligence").toString());
        DnDFrame.a0TextField4.setText(mode.getStat().getStats().get("Wisdom").toString());
        DnDFrame.a0TextField5.setText(mode.getStat().getStats().get("Charisma").toString());
    }

    public void runMemento(){
        if(!mode.getStat().equals(null)){
            mode.setCaretaker(new CareTaker());
            mode.getCaretaker().add(mode.getStat().saveStateToMemento());
            DnDFrame.textArea2.setText("Attributes saved");
        }
    }

    public void returnMemento(){
        try{
            mode.setStat(Stats.generate(mode.getCha().getRace()));
            DnDFrame.a0TextField.setText(mode.getStat().getStats().get("Strength").toString());
            DnDFrame.a0TextField1.setText(mode.getStat().getStats().get("Dexterity").toString());
            DnDFrame.a0TextField2.setText(mode.getStat().getStats().get("Constitution").toString());
            DnDFrame.a0TextField3.setText(mode.getStat().getStats().get("Intelligence").toString());
            DnDFrame.a0TextField4.setText(mode.getStat().getStats().get("Wisdom").toString());
            DnDFrame.a0TextField5.setText(mode.getStat().getStats().get("Charisma").toString());
        }
        catch(NullPointerException ex){
            DnDFrame.textArea2.setText("No saved attributes found");
        }
    }

}
