package oophomework2;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Oophomework2 extends JFrame implements ActionListener {

    JButton a = new JButton("wight");
    JButton a1 = new JButton("speed");
    JButton a2 = new JButton("currancy");
    JButton a3 = new JButton("temp");
    Label b = new Label("this is a OOP homework");

    JRadioButton rb1, rb2;
    JButton e;

    public Oophomework2() {
        JFrame f;
        f = new JFrame();

        f.add(a, BorderLayout.NORTH);
        f.add(a1, BorderLayout.SOUTH);
        f.add(a2, BorderLayout.WEST);
        f.add(b, BorderLayout.CENTER);
        f.add(a3, BorderLayout.EAST);
        f.setSize(400, 400);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(100, 50, 100, 30);
        rb2 = new JRadioButton("Female");
        rb2.setBounds(100, 100, 100, 30);
        
        f.add(rb1);
        f.add(rb2);
        e = new JButton("click");
        e.setBounds(100, 150, 80, 30);
        e.addActionListener(this);
        f.add(rb1,BorderLayout.CENTER);
        f.add(rb2,BorderLayout.CENTER);
f.add(e,BorderLayout.CENTER);
//       
        f.setVisible(true);
   
    }
    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are Male.");
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are Female.");
        }

    }

    public static void main(String[] args) {

        new Oophomework2();
        

  }

    }

   


