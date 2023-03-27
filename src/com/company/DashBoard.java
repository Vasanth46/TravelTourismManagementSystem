package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkPackages,bookPackages,viewPackages
            ,viewHotels,destinations,bookHotels,viewBookedHotels,payments,about,deletePersonalDetails;
    DashBoard(String username){
        //setBounds(0,0,1600,1000);
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading =new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);


        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);

         addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);


     updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

    viewPersonalDetails=new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,50));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.addActionListener(this);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetails);


        checkPackages=new JButton("Check Packages");
        checkPackages.setBounds(0,200,300,50);
        checkPackages.setBackground(new Color(0,0,102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,100));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);

        bookPackages=new JButton("Book Packages");
        bookPackages.setBounds(0,250,300,50);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.addActionListener(this);
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackages.setMargin(new Insets(0,0,0,110));
        p2.add(bookPackages);

       viewPackages=new JButton("View Packages");
        viewPackages.setBounds(0,300,300,50);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackages.addActionListener(this);
        viewPackages.setMargin(new Insets(0,0,0,110));
        p2.add(viewPackages);

         viewHotels=new JButton("View Hotels");
        viewHotels.setBounds(0,350,300,50);
        viewHotels.setBackground(new Color(0,0,102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewHotels.setMargin(new Insets(0,0,0,135));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);

        bookHotels=new JButton("Book Hotels");
        bookHotels.addActionListener(this);
        bookHotels.setBounds(0,400,300,50);
        bookHotels.setBackground(new Color(0,0,102));
        bookHotels.setForeground(Color.WHITE);
        bookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookHotels.setMargin(new Insets(0,0,0,135));
        p2.add(bookHotels);

        viewBookedHotels=new JButton("View Booked Hotel");
        viewBookedHotels.setBounds(0,450,300,50);
        viewBookedHotels.setBackground(new Color(0,0,102));
        viewBookedHotels.setForeground(Color.WHITE);
        viewBookedHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotels.setMargin(new Insets(0,0,0,80));
        viewBookedHotels.addActionListener(this);
        p2.add(viewBookedHotels);

        destinations=new JButton("Destination");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.addActionListener(this);
        destinations.setMargin(new Insets(0,0,0,140));
        p2.add(destinations);


         payments=new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.addActionListener(this);
        payments.setMargin(new Insets(0,0,0,150));
        p2.add(payments);



         about=new JButton("About");
        about.setBounds(0,600,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.addActionListener(this);
        about.setMargin(new Insets(0,0,0,180));
        p2.add(about);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);

        JLabel text=new JLabel("Travel And Tourism Management System");
        text.setBounds(350,70,1200,100);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma",Font.PLAIN,55));
        image.add(text);




        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }
        else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }
        else if(ae.getSource()==checkPackages){
            new CheckPackage();
        }
        else if(ae.getSource()==bookPackages){
            new BookPackage(username);
        }
        else if(ae.getSource()==viewPackages){
            new ViewPackage(username);
        }
        else if(ae.getSource()==viewHotels){
            new CheckHotels();
        }
        else if(ae.getSource()==destinations){
            new Destinations();
        }
        else if(ae.getSource()==bookHotels){
            new BookHotel(username);
        }
        else if(ae.getSource()==viewBookedHotels){
            new ViewBookedHotel(username );
        }
        else if(ae.getSource()==payments){
            new Payment();
        }
        else if(ae.getSource()==about){
            new About();
        }
        else if(ae.getSource()==deletePersonalDetails){
            new DeleteDetails(username);
        }

    }
    public static void main(String[] args) {
        new DashBoard("");
    }
}
