package oophomework2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Oophomework2 extends JFrame implements ActionListener {
     side_pane.add(btn_2);
        btn_2.setBounds(0, 150, 120, 40);
          btn_2.setBackground(new java.awt.Color(23, 35, 51));
         jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setText("New Employ");
            jLabel2.setBounds(38, 12, 33, 26);
        btn_2.add(jLabel2);
          btn_2.addMouseListener(this);
               
           jPanel1.add(NewEmploys);
        NewEmploys.setBounds(120, 0, 950, 600);
        NewEmploys.setBackground(Color.WHITE);
        NewEmploys.hide();
        
               newem.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        newem.setText("Rigester new employ");
      NewEmploys.add(newem);
      NewEmploys.setLayout(null);
       newem.setBounds(250, 20, 360, 70);
           email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
       email.setText("Email");
       NewEmploys.add(email);
        email.setBounds(60, 330, 380, 30);

        firstname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        firstname.setText("firstname");
     NewEmploys.add(firstname);
      firstname.setBounds(60, 130, 150, 30);

        lastname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    lastname.setText("lastname");
        NewEmploys.add(lastname);
        lastname.setBounds(60, 180, 150, 30);

       place.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
   place.setText("place");
     NewEmploys.add(place);
       place.setBounds(60, 280, 150, 30);
    NewEmploys.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton1.setText("female");
       jRadioButton1.setBackground(Color.WHITE);
           jRadioButton1.setBounds(140, 220, 100, 30);
           NewEmploys.add(jRadioButton2);
           jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton2.setText("male");
          jRadioButton2.setBounds(60, 220, 70, 30);
          jRadioButton2.setBackground(Color.WHITE);
          
          bg.add(jRadioButton1);
          bg.add(jRadioButton2);
         image.setIcon(new javax.swing.ImageIcon("icon\\images.png")); // NOI18N
        NewEmploys.add(image);
        image.setBounds(630, 120, 210, 140);
upload.setIcon(new javax.swing.ImageIcon("icon\\icons8-upload-26.png")); // NOI18N
      
      NewEmploys.add(upload);
       upload.setBounds(710, 290, 60, 36);
          upload.setBackground(Color.WHITE);
          
        sumbit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
     sumbit.setText("Sumbit");
      NewEmploys.add(sumbit);
        sumbit.setBounds(670, 500, 100, 30);
          sumbit.setBackground(Color.BLACK);
          sumbit.setForeground(Color.WHITE);
         day.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        day.setText("born date:");
        NewEmploys.add(day);
       day.setBounds(70, 390, 110, 20);
         NewEmploys.add(yyyy);
        yyyy.setBounds(360, 390, 100, 24);
yyyy.setBackground(Color.WHITE);
NewEmploys.add(dd);
       dd.setBounds(280, 390, 60, 24);
dd.setBackground(Color.WHITE);
 NewEmploys.add(mm);
        mm.setBounds(200, 390, 50, 24);
mm.setBackground(Color.white);



        // Rigester...........
        
            side_pane.add(btn_3);
        btn_3.setBounds(0, 200, 120, 40);
          btn_3.setBackground(new java.awt.Color(23, 35, 51));
         jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setText("Rigester");
            jLabel3.setBounds(38, 12, 33, 26);
        btn_3.add(jLabel3);
          btn_3.addMouseListener(this);
          //log out...
          
              side_pane.add(btn_5);
        btn_5.setBounds(0, 250, 120, 40);
          btn_5.setBackground(new java.awt.Color(23, 35, 51));
         jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(Color.WHITE);
        jLabel5.setText("log out");
            jLabel5.setBounds(38, 12, 33, 26);
        btn_5.add(jLabel5);
       btn_5.addMouseListener(this);
        //close.............. 
        
              side_pane.add(btn_4);
        btn_4.setBounds(0, 300, 120, 40);
          btn_4.setBackground(new java.awt.Color(23, 35, 51));
         jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setText("close");
            jLabel4.setBounds(38, 12, 33, 26);
        btn_4.add(jLabel4);
       btn_4.addMouseListener(this);
      
        
        
        
          setLocationRelativeTo(null);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    

}