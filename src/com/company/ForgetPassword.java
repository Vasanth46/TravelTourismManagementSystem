package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {

    JTextField txtusername,txtname,txtquestion,txtanswer,txtrtpwd;
    JButton search,retrieve,back;
    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);


        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);

        JLabel username=new JLabel("Username");
        username.setBounds(40,20,100,25);
        username.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(username);

        txtusername =new JTextField();
        txtusername.setBounds(220,20,150,25);
        txtusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtusername);


        search=new JButton("Search");
        search.setBackground(Color.gray);
        search.setForeground(Color.white);
        search.setBounds(380,20,100,25);
        search.addActionListener(this);
        p1.add(search);

        JLabel name=new JLabel("Name");
        name.setBounds(40,60,100,25);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(name);

        txtname =new JTextField();
        txtname.setBounds(220,60,150,25);
        txtname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtname);


        JLabel question=new JLabel("Security Question");
        question.setBounds(40,100,150,25);
        question.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(question);

        txtquestion =new JTextField();
        txtquestion.setBounds(220,100,150,25);
        txtquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtquestion);


        JLabel answer=new JLabel("Answer");
        answer.setBounds(40,140,150,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(answer);

        txtanswer =new JTextField();
        txtanswer.setBounds(220,140,150,25);
        txtanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtanswer);

        retrieve=new JButton("Retrieve");
        retrieve.setBackground(Color.gray);
        retrieve.setForeground(Color.white);
        retrieve.setBounds(380,140,100,25);
        retrieve.addActionListener(this);
        p1.add(retrieve);

        JLabel rtpwd=new JLabel("Password");
        rtpwd.setBounds(40,180,150,25);
        rtpwd.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(rtpwd);

        txtrtpwd =new JTextField();
        txtrtpwd.setBounds(220,180,150,25);
        txtrtpwd.setBorder(BorderFactory.createEmptyBorder());
        p1.add(txtrtpwd);


        back=new JButton("Back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(150,230,100,25);
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search)
        {
            try {
                String query="select * from account where username='"+txtusername.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);

                while(rs.next()){
                    txtname.setText(rs.getString("name"));
                    txtquestion.setText(rs.getString("security"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        else if(ae.getSource()==retrieve){
            try {
                String query="select * from account where answer='"+txtanswer.getText()+"' AND username='"+txtusername.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);

                while(rs.next()){
                    txtrtpwd.setText(rs.getString("password"));

                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new ForgetPassword();
    }
}
