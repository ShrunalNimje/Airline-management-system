package my.mood;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BoardingPass extends JFrame implements ActionListener {

    JTextField pnrTF;
    JButton enter, back;
    JLabel nameL1, nationalityL1, passportNumL1, phoneL1, fromL1,
            destinationL1, flightCodeL1, flightNumL1, priceL1,
            ticketNumL1, customerIdL1, travelDateL1;

    public BoardingPass(){

        setBounds(150, 150, 1200, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Boarding Pass");
        text.setFont(new Font("Arial", Font.BOLD, 24));
        text.setBounds(500, 20, 400, 30);
        add(text);

        JLabel pnrL = new JLabel("PNR Number :");
        pnrL.setBounds(300, 80, 150, 20);
        pnrL.setFont(new Font("Arial", Font.BOLD, 16));
        add(pnrL);

        pnrTF = new JTextField();
        pnrTF.setBounds(480, 80, 200, 25);
        pnrTF.setFont(new Font("Arial", Font.PLAIN, 16));
        pnrTF.setBorder(new LineBorder(Color.black));
        add(pnrTF);

        enter = new JButton("Enter");
        enter.setBounds(710, 80, 120, 25);
        enter.setFont(new Font("Arial", Font.BOLD, 16));
        enter.setBackground(Color.black);
        enter.setForeground(Color.white);
        enter.addActionListener(this);
        add(enter);

        JLabel nameL = new JLabel("Name :");
        nameL.setBounds(100, 140, 150, 20);
        nameL.setFont(new Font("Arial", Font.BOLD, 16));
        add(nameL);

        nameL1 = new JLabel();
        nameL1.setBounds(280, 140, 200, 20);
        nameL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(nameL1);

        JLabel nationalityL = new JLabel("Nationality :");
        nationalityL.setBounds(500, 140, 150, 20);
        nationalityL.setFont(new Font("Arial", Font.BOLD, 16));
        add(nationalityL);

        nationalityL1 = new JLabel();
        nationalityL1.setBounds(780, 140, 200, 20);
        nationalityL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(nationalityL1);

        JLabel phoneL = new JLabel("Phone :");
        phoneL.setBounds(100, 180, 150, 20);
        phoneL.setFont(new Font("Arial", Font.BOLD, 16));
        add(phoneL);

        phoneL1 = new JLabel();
        phoneL1.setBounds(280, 180, 200, 20);
        phoneL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(phoneL1);

        JLabel passportNumL = new JLabel("Passport Number :");
        passportNumL.setBounds(500, 180, 150, 20);
        passportNumL.setFont(new Font("Arial", Font.BOLD, 16));
        add(passportNumL);

        passportNumL1 = new JLabel();
        passportNumL1.setBounds(780, 180, 200, 20);
        passportNumL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(passportNumL1);

        JLabel fromL = new JLabel("From :");
        fromL.setBounds(100, 220, 150, 20);
        fromL.setFont(new Font("Arial", Font.BOLD, 16));
        add(fromL);

        fromL1 = new JLabel();
        fromL1.setBounds(280, 220, 200, 20);
        fromL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(fromL1);

        JLabel destinationL = new JLabel("Destination :");
        destinationL.setBounds(500, 220, 150, 20);
        destinationL.setFont(new Font("Arial", Font.BOLD, 16));
        add(destinationL);

        destinationL1 = new JLabel();
        destinationL1.setBounds(780, 220, 200, 20);
        destinationL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(destinationL1);

        JLabel flightNumL = new JLabel("Flight Number :");
        flightNumL.setBounds(100, 260, 150, 20);
        flightNumL.setFont(new Font("Arial", Font.BOLD, 16));
        add(flightNumL);

        flightNumL1 = new JLabel();
        flightNumL1.setBounds(280, 260, 200, 20);
        flightNumL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(flightNumL1);

        JLabel flightCodeL = new JLabel("Flight Code :");
        flightCodeL.setBounds(500, 260, 150, 20);
        flightCodeL.setFont(new Font("Arial", Font.BOLD, 16));
        add(flightCodeL);

        flightCodeL1 = new JLabel();
        flightCodeL1.setBounds(780, 260, 200, 20);
        flightCodeL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(flightCodeL1);

        JLabel priceL = new JLabel("Cost :");
        priceL.setBounds(100, 300, 150, 20);
        priceL.setFont(new Font("Arial", Font.BOLD, 16));
        add(priceL);

        priceL1 = new JLabel();
        priceL1.setBounds(280, 300, 200, 20);
        priceL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(priceL1);

        JLabel travelDateL = new JLabel("Travel date :");
        travelDateL.setBounds(500, 300, 150, 20);
        travelDateL.setFont(new Font("Arial", Font.BOLD, 16));
        add(travelDateL);

        travelDateL1 = new JLabel();
        travelDateL1.setBounds(780, 300, 200, 20);
        travelDateL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(travelDateL1);

        JLabel ticketNumL = new JLabel("Ticket Number :");
        ticketNumL.setBounds(100, 340, 150, 20);
        ticketNumL.setFont(new Font("Arial", Font.BOLD, 16));
        add(ticketNumL);

        ticketNumL1 = new JLabel();
        ticketNumL1.setBounds(280, 340, 200, 20);
        ticketNumL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(ticketNumL1);

        JLabel customerIdL = new JLabel("Customer Id :");
        customerIdL.setBounds(500, 340, 150, 20);
        customerIdL.setFont(new Font("Arial", Font.BOLD, 16));
        add(customerIdL);

        customerIdL1 = new JLabel();
        customerIdL1.setBounds(780, 340, 200, 20);
        customerIdL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(customerIdL1);

        back = new JButton("Back");
        back.setBounds(1000, 500, 120, 25);
        back.setFont(new Font("Arial", Font.BOLD, 16));
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        String pnrS = pnrTF.getText();

        if (ae.getSource() == back){
            setVisible(false);
        }
        else {
            try{
                DBConnection c = new DBConnection();
                String query = "select * from Reservation where pnrNumber ='"+pnrS+"'";
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()){
                    nameL1.setText(rs.getString("name"));
                    nationalityL1.setText(rs.getString("nationality"));
                    passportNumL1.setText(rs.getString("passportNumber"));
                    phoneL1.setText(rs.getString("phone"));
                    fromL1.setText(rs.getString("source"));
                    destinationL1.setText(rs.getString("destination"));
                    flightCodeL1.setText(rs.getString("flightCode"));
                    flightNumL1.setText(rs.getString("flightNumber"));
                    priceL1.setText(rs.getString("price"));
                    ticketNumL1.setText(rs.getString("ticketNumber"));
                    customerIdL1.setText(rs.getString("customerId"));
                    travelDateL1.setText(rs.getString("travelDate"));;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid PNR Number!");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        new BoardingPass();

    }
}
