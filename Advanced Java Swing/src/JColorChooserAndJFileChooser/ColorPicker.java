package JColorChooserAndJFileChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorPicker extends JFrame {

    public ColorPicker() {
        super("JColorChooser Test Frame");
        setSize(400,300);
        final Container contentPane = getContentPane();
        final JButton go = new JButton("Show JColorChooser");
        go.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Color c;
                c = JColorChooser.showDialog(getContentPane(), "Demo", Color.BLUE);
                contentPane.setBackground(c);
            }
        });
        contentPane.add(go, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   
    
    public static void main(String[] args) {
        new ColorPicker().setVisible(true);
    }
}
