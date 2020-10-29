package EventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class E1 extends JFrame {
    JButton btn1, btn2;
    
    public E1(){
        btn1 = new JButton("OK");
        btn2 = new JButton("Cancel");
        setSize(300, 200);
        setLayout(new FlowLayout());
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Thanks for being with us");
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(rootPane, "Are you sure?", "New Title", JOptionPane.WARNING_MESSAGE);
            }
        });
    }
    
    public static void main(String[] args) {
        new E1();
    }
}
