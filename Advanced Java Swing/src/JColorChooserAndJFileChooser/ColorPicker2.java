package JColorChooserAndJFileChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class ColorPicker2 extends JFrame {
    Color c;

    public ColorPicker2() {
        super("JColorChooser Test Frame");
        setSize(400, 300);
        final Container contentPane = getContentPane();
        final JButton go = new JButton("Show JColorChooser");
        go.addActionListener(new ActionListener() {
            final JColorChooser chooser = new JColorChooser();
            boolean first = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if(first){
                    first = false;
                }
                JDialog dialog = JColorChooser.createDialog(ColorPicker2.this, "Demo 2", true, chooser, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c = chooser.getColor();
                    }
                }, null);
                dialog.setVisible(true);
                contentPane.setBackground(c);
            }
        });
        contentPane.add(go, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new ColorPicker2().setVisible(true);
    }
}
