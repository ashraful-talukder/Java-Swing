package SizingAndPositioning;

import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Toolkit;

public class TryWindow2 {
    static JFrame aWindow = new JFrame("Hello");
    
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit(); //get the window toolkit
        Dimension wndSize = theKit.getScreenSize();  //get the current screen size
        
        //setting the window in the center of the window
        aWindow.setBounds(wndSize.width/4, wndSize.height/4, wndSize.width/2, wndSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
