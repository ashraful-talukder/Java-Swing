package AddingComponent;

import java.awt.Color;
import static java.awt.Color.BLUE;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelFontForeground {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JLabel Tesframet");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("First Name");
        
        label.setFont(new Font("Courier New", Font.ITALIC + 1, 14));
        label.setForeground(Color.BLUE);
        
        /* since the default of the opaque is false for JLabel
         * If true the component paints every pixel within its bound.
         * Otherwise, the component may not paint some or all of its pixels,
         * allowing the underlying pixels to show through
         * We nee to make this opaque true for only JLabel
         * Others components get opaque true by default
         */
        label.setOpaque(true);
        label.setBackground(Color.RED);
        
        frame.add(label);
        
        String htmlText = "<html><p><font color=\"#800080\" "
                + "size=\"5\" face=\"Verdana\">HTML in JLabel</font></p>"
                + "<font size=\"2\"><u>"
                + "underline is possible</u><br><b> and bold too</b></font>"
                + "</html>";
        JLabel lbl = new JLabel(htmlText);
        frame.add(lbl);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}
