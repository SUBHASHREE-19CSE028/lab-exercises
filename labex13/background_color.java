/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author SUBHAHARINI
 */
public class background_color implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7;
    public background_color()
    {
        f=new JFrame();
        b1=new JButton("red");
        b1.setBounds(100,300,100,50);
        b1.setBackground(Color.red);
        
        b2=new JButton("green");
        b2.setBounds(200,300,100,50);
        b2.setBackground(Color.green);
        
        b3=new JButton("blue");
        b3.setBounds(300,300,100,50);
        b3.setBackground(Color.blue);
        
        b4=new JButton("yellow");
        b4.setBounds(400,300,100,50);
        b4.setBackground(Color.yellow);
        
        b5=new JButton("pink");
        b5.setBounds(500,300,100,50);
        b5.setBackground(Color.pink);
        
        b6=new JButton("white");
        b6.setBounds(600,300,100,50);
        b6.setBackground(Color.white);
       
        b7=new JButton("black");
        b7.setBounds(700,300,100,50);
        b7.setBackground(Color.black);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
     public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource().equals(b1))
        {
          f.getContentPane().setBackground(Color.red);  
        }
        if(e.getSource().equals(b2))
        {
          f.getContentPane().setBackground(Color.green);  
        }
        if(e.getSource().equals(b3))
        {
          f.getContentPane().setBackground(Color.blue);
        }
        if(e.getSource().equals(b4))
        {
          f.getContentPane().setBackground(Color.yellow);  
        }
        if(e.getSource().equals(b5))
        {
          f.getContentPane().setBackground(Color.pink);  
        }
        if(e.getSource().equals(b6))
        {
          f.getContentPane().setBackground(Color.white);
        }
        if(e.getSource().equals(b7))
        {
          f.getContentPane().setBackground(Color.black);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new background_color();
    }
    
}
