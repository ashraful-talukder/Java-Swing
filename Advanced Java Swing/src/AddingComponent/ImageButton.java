package AddingComponent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton {

    ImageButton() {
        JFrame f = new JFrame();
        //System.out.println(getClass().getResource(""));
        ImageIcon ic = new ImageIcon(getClass().getResource("window_close.png"));
        JButton b = new JButton("Close", ic);
        b.setBounds(130, 100, 256, 256);
        f.add(b);
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new ImageButton();
    }
    
    
}
