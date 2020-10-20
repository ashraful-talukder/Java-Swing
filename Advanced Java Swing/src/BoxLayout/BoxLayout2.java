package BoxLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/* The box layout is of two types: Horizontal and Vertical
 * Horizontal layout place the components from left to right in a container
 * and Vertical layout places the components from top to bottom
*/

public class BoxLayout2 extends JFrame {
    
    JButton buttons[];
    
    public BoxLayout2(){
        buttons = new JButton[5];
        
        for (int i = 0; i < 5 ; i++){
            buttons[i] = new JButton("Button" + (i+1));
            add(buttons[i]);
        }
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        setSize(400, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new BoxLayout2();
    }
}
