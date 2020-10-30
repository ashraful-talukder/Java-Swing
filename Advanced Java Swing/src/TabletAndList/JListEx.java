package TabletAndList;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListEx extends JFrame {
    
    JList list;
    
    String[] listColorName = {"black", "white", "blue", "green", "red"};
    Color[] listColorValues = {Color.BLACK, Color.WHITE, Color.BLUE, Color.GREEN, Color.RED};
    Container contentpane;
    
    JListEx() {
        super("List Source Demo");
        contentpane = getContentPane();
        contentpane.setLayout(new FlowLayout());
        list = new JList(listColorName);
        list.setSelectedIndex(1);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        contentpane.add(new JScrollPane(list));
        list.addListSelectionListener(new ListSelectionListener() {
            
            @Override
            public void valueChanged(ListSelectionEvent e) {
                contentpane.setBackground(listColorValues[list.getSelectedIndex()]);
            }
        });
        
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new JListEx();
    }
}
