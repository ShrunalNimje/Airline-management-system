package my.mood;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Cancellation extends JFrame implements ActionListener {

    JLabel nameL1, nationalityL1, sourceL1, destinationL1,
            flightCodeL1, travelDateL1, cancelNumL1;
    JTextField pnrTF;
    JButton enter, generate, confirm;
    Random random;

    public Cancellation(){

        setSize(1200, 600);
        setLocation(150, 150);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text = new JLabel("Ticket Cancellation");
        text.setBounds(450, 20, 400, 30);
        text.setFont(new Font("Arial", Font.BOLD, 24));
        add(text);

        JLabel pnrL = new JLabel("PNR Number :");
        pnrL.setBounds(200, 80, 150, 20);
        pnrL.setFont(new Font("Arial", Font.BOLD, 16));
        add(pnrL);

        pnrTF = new JTextField();
        pnrTF.setBounds(380, 80, 200, 25);
        pnrTF.setFont(new Font("Arial", Font.PLAIN, 16));
        pnrTF.setBorder(new LineBorder(Color.black));
        add(pnrTF);

        enter = new JButton("Enter");
        enter.setBounds(610, 80, 120, 25);
        enter.setFont(new Font("Arial", Font.BOLD, 16));
        enter.setBackground(Color.black);
        enter.setForeground(Color.white);
        enter.addActionListener(this);
        add(enter);

        JLabel nameL = new JLabel("Name :");
        nameL.setBounds(100, 120, 150, 20);
        nameL.setFont(new Font("Arial", Font.BOLD, 16));
        add(nameL);

        nameL1 = new JLabel();
        nameL1.setBounds(280, 120, 200, 20);
        nameL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(nameL1);

        JLabel nationalityL = new JLabel("Nationality :");
        nationalityL.setBounds(100, 160, 150, 20);
        nationalityL.setFont(new Font("Arial", Font.BOLD, 16));
        add(nationalityL);

        nationalityL1 = new JLabel();
        nationalityL1.setBounds(280, 160, 200, 20);
        nationalityL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(nationalityL1);

        JLabel sourceL = new JLabel("From :");
        sourceL.setBounds(100, 200, 150, 20);
        sourceL.setFont(new Font("Arial", Font.BOLD, 16));
        add(sourceL);

        sourceL1 = new JLabel();
        sourceL1.setBounds(280, 200, 200, 20);
        sourceL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(sourceL1);

        JLabel destinationL = new JLabel("Destination :");
        destinationL.setBounds(100, 240, 150, 20);
        destinationL.setFont(new Font("Arial", Font.BOLD, 16));
        add(destinationL);

        destinationL1 = new JLabel();
        destinationL1.setBounds(280, 240, 200, 20);
        destinationL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(destinationL1);

        JLabel flightCodeL = new JLabel("Flight Code :");
        flightCodeL.setBounds(100, 280, 150, 20);
        flightCodeL.setFont(new Font("Arial", Font.BOLD, 16));
        add(flightCodeL);

        flightCodeL1 = new JLabel();
        flightCodeL1.setBounds(280, 280, 200, 20);
        flightCodeL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(flightCodeL1);

        JLabel travelDateL = new JLabel("Travel date :");
        travelDateL.setBounds(100, 320, 150, 20);
        travelDateL.setFont(new Font("Arial", Font.BOLD, 16));
        add(travelDateL);

        travelDateL1 = new JLabel();
        travelDateL1.setBounds(280, 320, 200, 20);
        travelDateL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(travelDateL1);

        JLabel cancelNumL = new JLabel("Cancel Number :");
        cancelNumL.setBounds(100, 360, 150, 20);
        cancelNumL.setFont(new Font("Arial", Font.BOLD, 16));
        add(cancelNumL);

        cancelNumL1 = new JLabel();
        cancelNumL1.setBounds(280, 360, 120, 20);
        cancelNumL1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(cancelNumL1);

        generate = new JButton("Generate");
        generate.setBounds(450, 360, 120, 25);
        generate.setFont(new Font("Arial", Font.BOLD, 16));
        generate.setBackground(Color.black);
        generate.setForeground(Color.white);
        generate.addActionListener(this);
        add(generate);

        random = new Random();
        confirm = new JButton("Conform");
        confirm.setBounds(280, 410, 120, 25);
        confirm.setFont(new Font("Arial", Font.BOLD, 18));
        confirm.setBackground(Color.black);
        confirm.setForeground(Color.white);
        confirm.addActionListener(this);
        add(confirm);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String pnrS = pnrTF.getText();
        String nameS = nameL1.getText();
        String nationalityS = nationalityL1.getText();
        String sourceS = sourceL1.getText();
        String destinationS = destinationL1.getText();
        String flightCodeS = flightCodeL1.getText();
        String travelDateS = travelDateL1.getText();
        String cancelNumS = cancelNumL1.getText();

        if (ae.getSource() == enter){
            try {
                DBConnection c = new DBConnection();
                String query = "select * from Reservation where pnrNumber = '"+pnrS+"'";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()){
                    nameL1.setText(rs.getString("name"));
                    nationalityL1.setText(rs.getString("nationality"));
                    sourceL1.setText(rs.getString("source"));
                    destinationL1.setText(rs.getString("destination"));
                    flightCodeL1.setText(rs.getString("flightCode"));
                    travelDateL1.setText(rs.getString("travelDate"));
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid PNR Number!");
                }
            }
            catch (Exception e){
                System.out.println(e);;
            }
        }
        else if(ae.getSource() == generate){
            cancelNumL1.setText("CNL - " + random.nextInt(10000));
        }
        else if (ae.getSource() == confirm){
            if (pnrS.isEmpty() || cancelNumS.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all required field!");
            }
            else {
                try {
                    DBConnection c = new DBConnection();
                    String query = "insert into Cancellation values('"+pnrS+"', '"+nameS+"', '"+nationalityS+"', '"+sourceS+"', '"+destinationS+"', '"+flightCodeS+"', '"+travelDateS+"', '"+cancelNumS+"' )";
                    c.s.executeUpdate(query);

                    String query1 = "delete from Reservation where pnrNumber ='"+pnrS+"' ";
                    c.s.executeUpdate(query1);

                    JOptionPane.showMessageDialog(null, "Ticket cancelled Successfully!");
                    setVisible(false);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {

        new Cancellation();

    }
}
