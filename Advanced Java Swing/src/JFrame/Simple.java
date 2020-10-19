package JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Simple {
 JFrame f;
 JLabel lbl;
 JButton b;
 
 Simple(){
     f = new JFrame(); //create JFrame Object
     lbl = new JLabel("Hello"); //create JLabel object
     b = new JButton("click"); //create JButton object
     lbl.setBounds(10, 10, 50, 30); //possition and size
     b.setBounds(130, 100, 100, 40); //position and size
     f.add(b); //add button to frame
     f.add(lbl); //add label to frame
     f.setSize(400, 500); //set frame size
     f.setTitle("First Demo Form"); //set frame title
     f.setLayout(null); //set frame layout
     f.setVisible(true); //display the frame
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 public static void main(String[] args){
     new Simple();
 }
}
