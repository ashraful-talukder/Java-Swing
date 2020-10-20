package LayoutManagement;

import javax.swing.*;
import java.awt.*;
/* The flow layout manager places components in a row, and when the row is full
 * it automatically spills components onto the next row.
 * The default positioning of the row of componenets is centered in the content.
 */

public class MyFlowLayout {
    
    JFrame f;

    public MyFlowLayout() {
        f = new JFrame();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        f.setSize(300,300);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyFlowLayout();
    }
    
    
}
