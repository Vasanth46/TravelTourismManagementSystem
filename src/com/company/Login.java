package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton sp,forpass,login;
    JTextField pwd,usrname;
    Login(){
        setSize(700,350);
        setLocation(500,200);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,193,233));

        p1.setBounds(0,0,300,350);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,80,200,200);
        p1.add(image);

            JPanel p2=new JPanel();

            p2.setLayout(null);
            p2.setBounds(300,30,350,250);
            add(p2);

            JLabel username=new JLabel("Username");
            username.setBounds(40,15,150,35);
            username.setFont(new Font("SAN SERIF",Font.PLAIN,20));
            p2.add(username);

          usrname=new JTextField();
            usrname.setBounds(40,50,250,30);
            usrname.setBorder(BorderFactory.createEmptyBorder());
            p2.add(usrname);

        JLabel password=new JLabel("Password");
        password.setBounds(40,80,150,35);
        password.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(password);

        pwd=new JTextField();
        pwd.setBounds(40,110,250,30);
        pwd.setBorder(BorderFactory.createEmptyBorder());
        p2.add(pwd);

        login=new JButton("Login");
        login.setBounds(40,150,130,30);
        login.setBackground(new Color(133,193,233));
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addActionListener(this);
        login.setForeground(Color.WHITE);
        p2.add(login);

         sp=new JButton("Sign Up");
        sp.setBounds(180,150,130,30);
        sp.setBackground(new Color(133,193,233));
        sp.setBorder(BorderFactory.createEmptyBorder());
        sp.setForeground(Color.WHITE);
        sp.addActionListener(this);
        p2.add(sp);

         forpass=new JButton("Forgot Password?");
        forpass.setBounds(40,200,130,30);
        forpass.setBackground(new Color(133,193,233));
        forpass.setBorder(BorderFactory.createEmptyBorder());
        forpass.setForeground(Color.WHITE);
        forpass.addActionListener(this);
        p2.add(forpass);

        JLabel text=new JLabel("Trouble Signing?");
        text.setFont(new Font("SERIF", Font.PLAIN,12));
        text.setBounds(180,200,100,20);
        text.setForeground(Color.RED);
        p2.add(text);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==login){
                try{

                    String username=usrname.getText();
                    String password=pwd.getText();

                    String query="select * from account where username = '"+username+"'AND password = '"+password+"'";
                    Conn c=new Conn();
                    ResultSet rs=c.s.executeQuery(query);

                    if(rs.next()){
                        setVisible(false);
                        new Loading(username);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            else if(ae.getSource()==sp){
                setVisible(false);
                new SignUp();
            }
            else {
                setVisible(false);
                new ForgetPassword();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
