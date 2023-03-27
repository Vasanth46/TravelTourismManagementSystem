package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Paytm extends JFrame implements ActionListener {
    Paytm(){
        setBounds(350,100,800,600);

        JEditorPane pane=new JEditorPane();
        pane.setEditable(false);

        try{
            pane.setPage("https://paytm.com/rent-payment");
        }catch(Exception e){
                pane.setContentType("text/html");
                pane.setText("<html> Could not load ,Error 404 </html>");
        }
        JScrollPane sp=new JScrollPane(pane);
        getContentPane().add(sp);

        JButton back=new JButton("BACK");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        setVisible(false);
        new Payment();
    }
    public static void main(String[] args) {
        new Paytm();
    }



}
