package BoxLayout;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/* The Box class contains static methods to create an invisible component
 * called a strut. A vertical strut has a given height in pixels and zero width.
 * A horizontal strut has a given width in pixels and zero height
 * The purpose of these struts is to enable you to insert space between your
 * components, either vertically or horizontally.
 */

public class BoxLayoutEx extends JFrame {
    
    public BoxLayoutEx(){
        setTitle("Box Layout");
        setSize(300, 300);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        getContentPane().add(btn1);
        add(Box.createRigidArea(new Dimension(0, 5))); // add some rigid space between buttons
        add(btn2);
        add(btn3);
        add(Box.createVerticalStrut(10)); // space between
        add(btn4);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        BoxLayoutEx bl = new BoxLayoutEx();
        bl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
