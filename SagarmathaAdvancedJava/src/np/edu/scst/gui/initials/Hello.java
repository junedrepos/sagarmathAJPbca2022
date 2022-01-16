package np.edu.scst.gui.initials;

import java.awt.FlowLayout;
import javax.swing.*;


public class Hello extends JFrame{
    
    Hello(){
        String[] header = {"Name","Class","Age"};
        String[][] body = {{"Ram","6","11"},
                                        {"Shyam","7","11"}};
        
        JTable jTable = new JTable(body,header);
        JScrollPane scrollPane = new JScrollPane(jTable);
        add(scrollPane);
        
//        String[] countries = {"Nepal", "India", "China"}; 
//        JList jList = new JList(countries);
//        add(jList);
        
//        JComboBox jComboBox = new JComboBox(countries);
////        jComboBox.setModel(new DefaultComboBoxModel(countries));
//        add(jComboBox);
        
        
        
//        JRadioButton male = new JRadioButton("Male");
//        male.setText("Male ");
//        add(male);
//         male.setText("Female ");
//         add(male);
//        
//        JRadioButton female = new JRadioButton("Female");
//        ButtonGroup btn = new ButtonGroup();
//        btn.add(male);
//        btn.add(female);
//        
//        add(male);
//        add(female);
        
        
//        JPasswordField jPasswordField = new JPasswordField(20);
//        
//        add(jPasswordField);
        
//         JTextArea jTextArea = new JTextArea(5,20);
//        
//         add(jTextArea);
        
//        JLabel jLabel = new JLabel("Hello World");
//        JLabel jLabel2 = new JLabel("Hello World 2");
//        
//        //JFrame has CardLayout by Default
//        add(jLabel);
//        add(jLabel2);
        
//        JTextField jTextField = new JTextField("Hello world",20);
//                add(jTextField);
        
        //alt enter suggestion
        //ctrl space suggestion + autocomplete
        setLayout(new FlowLayout());//flow layout occupies central position
        setVisible(true);
        setSize(450,450);
        setTitle("Hello Frame");
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        Hello h = new Hello();
//        JFrame j = new JFrame();
//        j.setVisible(true);
//        j. setTitle("Hello Frame");
    }
}
