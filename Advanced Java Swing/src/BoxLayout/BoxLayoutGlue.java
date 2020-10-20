package BoxLayout;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* Glue is an invisible component that has the sole function of taking up 
 * surplus space in a Box container.
 */

public class BoxLayoutGlue extends JFrame {
    
    BoxLayoutGlue(){
        JPanel basic = new JPanel();
        basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
        add(basic);
        
        basic.add(Box.createVerticalGlue());
        
        JPanel bottom = new JPanel();
        bottom.setAlignmentX(1f);
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
        
        JButton ok = new JButton("OK");
        JButton close = new JButton("Close");
        
       bottom.add(ok);
       bottom.add(Box.createRigidArea(new Dimension(5, 0)));
       bottom.add(close);
       bottom.add(Box.createRigidArea(new Dimension(15, 0)));
       
       basic.add(bottom);
       basic.add(Box.createRigidArea(new Dimension(0, 15)));
       
        setTitle("Two Buttons");
        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new BoxLayoutGlue().setVisible(true);
    }
}
