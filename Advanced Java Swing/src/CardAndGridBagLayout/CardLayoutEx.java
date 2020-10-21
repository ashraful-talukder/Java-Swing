package CardAndGridBagLayout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


/* The card layout manager generates a stack of componenets,
 * one of top of the other. The first component that you add to the
 * container will be at the top of the stack, and therefore visible,
 * and the last one will be at the bottom.
 */

public class CardLayoutEx extends JFrame implements ActionListener {
    CardLayout card;
    JButton b1, b2, b3;
    Container c;
    
    CardLayoutEx(){
        c = getContentPane();
        card = new CardLayout(40,30);
        c.setLayout(card);
        
        b1 = new JButton("A");
        b2 = new JButton("B");
        b3 = new JButton("C");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
    }
    
    public static void main(String[] args) {
        CardLayoutEx cl = new CardLayoutEx();
        cl.setSize(400, 400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        card.next(c);
    }
}
