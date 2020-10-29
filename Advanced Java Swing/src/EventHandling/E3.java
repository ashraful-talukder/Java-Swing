package EventHandling;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class E3 extends JFrame {
    JButton btn1, btn2;
    
    public E3(){
        setSize(400, 400);
        btn1 = new JButton("OK");
        btn2 = new JButton("Cancel");
        setLayout(new FlowLayout());
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btn1.addActionListener(new E3Listener());
        btn2.addActionListener(new E3Listener());
    }
    
    public static void main(String[] args) {
        new E3();
    }
}
