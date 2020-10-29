package AddingComponent;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TArea {
    JTextArea area;
    JLabel lbl;
    JFrame f;
    
    TArea(){
        f = new JFrame();
        area =new JTextArea(300, 300);
        lbl = new JLabel("Enter Text");
        area.setBounds(10, 30, 300, 300);
        lbl.setBounds(10, 10, 100, 20);
        
        area.setBackground(Color.DARK_GRAY);
        area.setForeground(Color.white);
        lbl.setForeground(Color.RED);
        
        f.add(area);
        f.add(lbl);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TArea();
    }
    
}
