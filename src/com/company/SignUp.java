package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignUp extends JFrame implements ActionListener {
 JButton create,back;
 JTextField usrname,txtname,txtpwd,txtans;
 Choice s;
    SignUp(){
       setBounds(350,200,900,360);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);

       JPanel p1=new JPanel();
       p1.setBackground(new Color(133,193,233));
       p1.setBounds(0,0,500,400);
       p1.setLayout(null);
       add(p1);

        JLabel username=new JLabel("Username");
        username.setBounds(50,20,125,25);
        username.setFont(new Font("SAN SERIF",Font.BOLD,16));
        p1.add(username);

         usrname=new JTextField();
        usrname.setBounds(190,20,180,25);
        usrname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(usrname);

        JLabel name=new JLabel("Name");
        name.setBounds(50,60,125,25);
        name.setFont(new Font("SAN SERIF",Font.BOLD,16));
        p1.add(name);

      txtname=new JTextField();
        txtname.setBounds(190,60,180,25);
        txtname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtname);

        JLabel pwd=new JLabel("Password");
        pwd.setBounds(50,100,125,25);
        pwd.setFont(new Font("SAN SERIF",Font.BOLD,16));
        p1.add(pwd);

        txtpwd=new JTextField();
        txtpwd.setBounds(190,100,180,25);
        txtpwd.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtpwd);

        JLabel sc=new JLabel("Security Questions");
        sc.setBounds(50,140,130,25);
        sc.setFont(new Font("SAN SERIF",Font.BOLD,14));
        p1.add(sc);

        s=new Choice();
        s.add("Favourite Teacher in school?");
        s.add("Your Favourite Anime Character?");
        s.add("Your pet name?");
        s.add("Your bestfriend?");
        s.setBounds(190,140,180,25);
        p1.add(s);

        JLabel ans=new JLabel("Answer");
        ans.setBounds(50,180,125,25);
        ans.setFont(new Font("SAN SERIF",Font.BOLD,16));
        p1.add(ans);

         txtans=new JTextField();
        txtans.setBounds(190,180,180,25);
        txtans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtans);

       create =new JButton("Create");
        create.setBackground(new Color(0,82,255));
        create.setForeground(Color.WHITE);
        create.setBorder(BorderFactory.createEmptyBorder());
        create.setBounds(80,250,100,30);
        create.setFont(new Font("Tahoma",Font.BOLD,16));
        create.addActionListener(this);
        p1.add(create);

        back =new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(250,250,100,30);
        back.setFont(new Font("Tahoma",Font.BOLD,16));
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);



        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==back){
        setVisible(false);
        new Login();
       }
       else if(ae.getSource()==create){
             String username=usrname.getText();
             String name=txtname.getText();
             String password=txtpwd.getText();
             String question=s.getSelectedItem();
             String answer=txtans.getText();

             String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
                    try{
                     Conn c=new Conn();
                     c.s.executeUpdate(query);

                     JOptionPane.showMessageDialog(null,"Account Created Successfully");
                     setVisible(false);
                    }catch (Exception e){
                     e.printStackTrace();
                    }
       }
    }
    public static void main(String[] args) {
        new SignUp();
    }
}
