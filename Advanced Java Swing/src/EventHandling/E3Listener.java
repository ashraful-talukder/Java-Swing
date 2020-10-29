package EventHandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/* 
 * getActionCommand() returns the text inside that controlers
*/

public class E3Listener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("OK")){
            JOptionPane.showMessageDialog(null, "OKAY");
        }
        
        if(e.getActionCommand().equals("Cancel")){
            JOptionPane.showMessageDialog(null, "Cancel", "Waring", JOptionPane.WARNING_MESSAGE);
        }
    }
}
