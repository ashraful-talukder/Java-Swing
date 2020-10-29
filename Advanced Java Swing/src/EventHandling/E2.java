package EventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * getSource() returns the button has been pressed 
 */

public class E2 extends JFrame implements ActionListener{
    JButton btn1, btn2;
    
    public E2(){
        setSize(400, 300);
        btn1 = new JButton("OK");
        btn2 = new JButton("Cancel");
        setLayout(new FlowLayout());
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new E2();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            JOptionPane.showMessageDialog(rootPane, "Thank You!");
        }
        
        if(e.getSource()==btn2){
            JOptionPane.showMessageDialog(rootPane, "Please send us your feedback!", "Feedback", JOptionPane.WARNING_MESSAGE);
        }
    }
}
