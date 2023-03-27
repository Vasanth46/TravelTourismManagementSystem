package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    JButton back;
    About(){
        setBounds(350,100,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBackground(Color.WHITE);

        JLabel l1=new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(l1);

        String s="A Travel Management System for hotels is a specialized software platform designed to help hotels manage and streamline their operations related to guest bookings, reservations, and services.\n" +
                "\n" +
                "With a hotel-specific Travel Management System, hotels can easily manage their room inventory, rates, and availability across multiple channels, including online travel agencies (OTAs), their own website, and other distribution channels. The system integrates with various payment gateways, enabling hotels to securely accept payments and manage billing for guests.\n" +
                "\n" +
                "In addition to managing room bookings and reservations, a Travel Management System for hotels also offers features for managing guest services and experiences. This includes tools for tracking guest preferences, managing special requests, and automating guest communication and feedback.\n" +
                "\n" +
                "A hotel-specific Travel Management System can also help hotels optimize their revenue management strategies by providing real-time data on occupancy rates, pricing trends, and demand patterns. This data can be used to make informed pricing and inventory decisions, maximizing revenue and profitability for the hotel.\n" +
                "\n" +
                "By using a Travel Management System for hotels, hoteliers can improve their operational efficiency, increase revenue, and provide a better guest experience.";

        TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);

         back=new JButton("BACK");
        back.setBounds(200,420,100,25);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
new About();
    }
}
