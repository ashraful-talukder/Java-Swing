package WorkingWithMenu;

import RadioButtonAndComboBox.NewJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JMenuEx extends JFrame implements ActionListener {

    JMenuBar bar;
    JMenu menu1, menu2, menu3, menu4;
    JMenuItem item1, item2, item3, item4;

    JMenuEx() {
        bar = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("Entry");
        menu3 = new JMenu("Help");
        menu4 = new JMenu("Quit");
        item1 = new JMenuItem("Exit");
        item2 = new JMenuItem("New");
        item3 = new JMenuItem("Open");
        item4 = new JMenuItem("About");
        item1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        item1.setIcon(new javax.swing.ImageIcon(getClass().getResource("images.png")));

        menu1.add(item3);
        menu1.add(item1);
        menu2.add(item2);
        menu3.add(item4);
        menu2.add(menu3);
        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu4);
        setJMenuBar(bar);
        item1.addActionListener(this);
        item2.addActionListener(this);
        menu4.addActionListener(this);

        menu4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int x = JOptionPane.showConfirmDialog(rootPane, "Are you sure?");
            }
        });
        
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JMenuEx();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == item1){
            int x = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
            if(x == 0){
                System.out.println(x);
                System.exit(0);
            } else {
                
            }
        }
        
        if (e.getSource() == item2){
            NewJFrame jf = new NewJFrame();
            jf.setVisible(true);
        }
    }
}
