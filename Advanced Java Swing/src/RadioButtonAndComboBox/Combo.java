package RadioButtonAndComboBox;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Combo {
    JFrame f;
    
    Combo(){
        f = new JFrame();
        JButton b = new JButton("click");
        String [] country = {"Bangladesh", "China", "India", "Nepal", "Bhutan"};
        JComboBox jb = new JComboBox(country);
        jb.setBounds(130, 100, 100, 30);
        f.add(jb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Combo();
    }
}
