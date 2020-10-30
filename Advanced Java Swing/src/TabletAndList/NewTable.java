package TabletAndList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class NewTable {
    JFrame f;
    
    NewTable(){
        f = new JFrame();
        String data[][] = {{"101", "A", "670000"}, {"102", "B", "780000"}, {"103", "C", "700000"}};
        String column[] = {"ID", "Name", "Salary"};
        JTable jt = new JTable(data, column);
        jt.getColumnModel().getColumn(0).setResizable(false);
        jt.setEnabled(false);
        jt.setBounds(30, 40, 200, 300);
        
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        
        f.setSize(300, 400);
        //f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new NewTable();
    }
}
