package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border {
    JFrame f;
    
    Border(){
        f = new JFrame();
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");
        JButton b6 = new JButton("EXTRA");
        
        JPanel npanel = new JPanel();
        npanel.setLayout(new FlowLayout());
        npanel.add(b1);
        npanel.add(b6);
        
        f.setLayout(new BorderLayout(10, 10));
        f.add(npanel, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);
        
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Border();
    }
}
