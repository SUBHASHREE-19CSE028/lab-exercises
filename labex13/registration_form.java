/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex13;

/**
 *
 * @author SUBHAHARINI
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class registration_form implements ActionListener{  
    JLabel l1,l2,l3,l4,l5,lab1,lab2;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JCheckBox cb;
    JButton b1; 
  
    
    registration_form(){  
        JFrame f= new JFrame(); 
        lab1=new JLabel("-----------------------------------REGISTER----------------------------------");
        lab1.setBounds(70,50,350,50);
        lab2=new JLabel("Create your account.It's free and only takes a minute.");
        lab2.setBounds(70,100,350,50);
        l1=new JLabel(" First Name:");
        l1.setBounds(70,150,150,20);  
        l2=new JLabel(" Second Name:");
        l2.setBounds(250,150,170,20);  
        l3=new JLabel(" Email:");
        l3.setBounds(70,200,350,20); 
        l4=new JLabel(" Password:");
        l4.setBounds(70,250,350,20); 
        l5=new JLabel(" Confirm Password:");
        l5.setBounds(70,300,350,20); 
        tf1=new JTextField();  
        tf1.setBounds(70,150,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(250,150,170,20);  
        tf3=new JTextField();  
        tf3.setBounds(70,200,350,20);  
        tf4=new JTextField();  
        tf4.setBounds(70,250,350,20);  
        tf5=new JTextField();  
        tf5.setBounds(70,300,350,20);  
        cb=new JCheckBox("I accept the Terms of Use & Privacy Policy");
        cb.setBounds(70,350, 300, 20);
        f.add(cb);
        b1=new JButton("REGISTER NOW");  
        b1.setBounds(70,400,350,50);
        b1.setBackground(Color.green);
        b1.addActionListener(this);          
        f.add(l1);
        f.add(l2); 
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(b1);
        f.add(lab1);
        f.add(lab2);
        f.add(cb);
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }         
    @Override
     public void actionPerformed(ActionEvent e) {  
       
        if(e.getSource()==b1){  
            JOptionPane.showMessageDialog(null,"Name:"+tf1.getText()+" "+tf2.getText()+"\nEmail:"+tf3.getText()+"\nRegistered Successfully!");
        }
    }  
public static void main(String[] args) {  
    new registration_form();  
} 

}
