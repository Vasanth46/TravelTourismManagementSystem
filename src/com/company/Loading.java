package com.company;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
String username;
        Loading(String username){
            this.username=username;
            t=new Thread(this);
            setBounds(500,200,650,400);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);

            JLabel text=new JLabel("Travel And Tourism Application");
            text.setBounds(50,20,600,40);
            text.setForeground(Color.blue);
            text.setFont(new Font("Tahoma",Font.BOLD,35));
            add(text);

            bar=new JProgressBar();
            bar.setBounds(150,100,300,35);
            bar.setStringPainted(true);
            add(bar);

            JLabel laoding=new JLabel("Loading...");
            laoding.setBounds(200,150,150,30);
            laoding.setForeground(Color.red);
            laoding.setFont(new Font("Tahoma",Font.BOLD,16));
            add(laoding);

            JLabel lblusername=new JLabel("Welcome "+username);
            lblusername.setBounds(20,310,400,40);
            lblusername.setForeground(Color.red);
            lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
            add(lblusername);

            t.start();
            setVisible(true);
        }
        public void run(){
            try{
                for(int i=1;i<=101;i++){
                    int max=bar.getMaximum();
                    int value=bar.getValue();
                    if(value<max){
                        bar.setValue(bar.getValue()+1);

                    }
                    else{
                        setVisible(false);
                        new DashBoard(username);
                    }
                    Thread.sleep(10);
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    public static void main(String[] args) {
            new Loading("");
    }
}
