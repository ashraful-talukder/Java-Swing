package CardAndGridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GridBagLayoutEx {
    
    public static void addComponentsToPane(Container pane){
        JButton jb;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gBC = new GridBagConstraints();
        /*
        fill determines how the size of the component is adjusted in relation to
        the array of cells it occupies.
        */
        gBC.fill = GridBagConstraints.HORIZONTAL;
        
        jb = new JButton("Button 1");
        
        /*
        wieghtx and weighty
        determines how free space is distributed between components in the container
        max value = 1 and min value = 0 and it's a floating values
        */
        gBC.weightx = 0.5;
        
        /*
        gridx and gridy
        determines the position of the component in the container as coordinate
        positions of cells in the grid, where (0, 0) is the top-left position in the grid
        */
        gBC.gridx = 0;
        gBC.gridy = 0;
        pane.add(jb, gBC);
        
        JTextField jtf = new JFormattedTextField("TextField 1");
        gBC.gridx = 2;
        gBC.gridy = 0;
        jtf.setEditable(false);
        pane.add(jtf, gBC);
        
        jb  = new JButton("Button 3");
        gBC.gridx = 2;
        gBC.gridy = 0;
        //pane.add(jb, jBC);
        
        /*
        ipadx and ipady
        determines by how much the component size is to be increased above its minimum size
        */
        jb = new JButton("Button 4");
        gBC.ipady = 40;
        gBC.weightx = 0.0;
        gBC.gridwidth = 3;
        gBC.gridx = 0;
        gBC.gridy = 1;
        pane.add(jb, gBC);
        
        JComboBox jcmb = new JComboBox(new String[]{"ComboBox 1", "ComboBox 2", "Ashraful", "Chaitee"});
        gBC.ipady = 0;
        gBC.weighty = 1.0;
        
        /*
        anchor
        determines where a compnent is positioned within the area allocated to
        it in the container.
        */
        gBC.anchor = GridBagConstraints.PAGE_END;
        
        /*
        insets
        specifies the free space that is to be provided around the component with
        the space allocated to it in the container.
        */
        gBC.insets = new Insets(10, 0, 0, 0); // padding (anti-clockwise)
        gBC.gridx = 1;
        gBC.gridwidth = 2;
        gBC.gridy = 2;
        pane.add(jcmb, gBC);
    }
    
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("GridBagLayout Source Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            
            @Override
            public void run(){
                createAndShowGUI();
            }
        });
    }
}
