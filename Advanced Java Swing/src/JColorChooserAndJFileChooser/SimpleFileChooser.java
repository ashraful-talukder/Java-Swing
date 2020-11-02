package JColorChooserAndJFileChooser;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleFileChooser extends JFrame{
    
    SimpleFileChooser() {
        super("File Chooser Test Frame");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");
        JButton dirButton = new JButton("Pick Directory");
        
        final JLabel statusbar = new JLabel("Output of your selection will go here");
        openButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setMultiSelectionEnabled(true);
                int option = chooser.showOpenDialog(SimpleFileChooser.this);
                System.out.println(option);
                if(option == JFileChooser.APPROVE_OPTION){
                    File [] sf = chooser.getSelectedFiles();
                    String filelist = "nothing";
                    if (sf.length > 0) filelist = sf[0].getName();
                    for (int i =1 ; i < sf.length ; i++){
                        filelist += "," + sf[i].getName();
                    }
                    statusbar.setText("You choose" + filelist);
                }
                else {
                    statusbar.setText("You cancelled!");
                }
            }
        });
        
        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int option = chooser.showSaveDialog(SimpleFileChooser.this);
                if (option == JFileChooser.APPROVE_OPTION){
                    statusbar.setText("You saved " + "Nothing");
                }
            }
        });
        
        dirButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = chooser.showOpenDialog(SimpleFileChooser.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    statusbar.setText("You opened ");
                }
            }
        });
        
        c.add(openButton);
        c.add(saveButton);
        c.add(dirButton);
        add(c);
    }
    
    public static void main(String[] args) {
        new SimpleFileChooser().setVisible(true);
    }
}
