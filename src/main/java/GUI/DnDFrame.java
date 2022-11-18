package GUI;

import Memento.CareTaker;
import Visitor.DataElement;
import character.Character;
import character.Stats;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static GUI.Model.getInst;

public class DnDFrame extends JFrame{
    protected JTextField textField1;
    protected JComboBox comboBox1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("DnDFrame");
        frame.setContentPane(new DnDFrame().dnd);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    protected JComboBox comboBox2;
    protected JButton generateButton;
    protected JTextField a0TextField;
    protected JTextField a0TextField1;
    protected JTextField a0TextField2;
    protected JTextField a0TextField3;
    protected JTextField a0TextField4;
    protected JTextField a0TextField5;
    protected JButton createCharacterButton;
    protected JButton saveJSONButton;
    protected JTextArea textArea2;
    protected JList list1;
    protected JTextPane textPane1;
    private JPanel dnd;

    public DnDFrame() {

        generateButton.addActionListener(e -> {
            Controller.generateStats();
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
