package GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

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
    private JButton saveButton;
    private JButton previousButton;
    private JButton clearButton;

    public DnDFrame() {

        generateButton.addActionListener(e -> {
            Controller.generateStats(this);
        });
        saveButton.addActionListener(e -> {
            Controller.runMemento(this);
        });
        previousButton.addActionListener(e -> {
            Controller.returnMemento(this);
        });
        createCharacterButton.addActionListener(e -> {
            Controller.createCharacter(this);
        });
        saveJSONButton.addActionListener(e -> {
            try {
                Controller.saveJSON(this);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        list1.addListSelectionListener(e -> {
          Controller.printSelected(this);
          //System.out.println(list1.getSelectedIndex());
        });
        clearButton.addActionListener(e -> {
            Controller.clear(this);
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
