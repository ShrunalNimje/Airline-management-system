package my.mood;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class Reservation extends JFrame implements ActionListener {

    JButton fetchUser, fetchFlight, confirm;
    JLabel nameL1, genderL1, phoneL1, passportNumL1,
            nationalityL1, flightNumL1, flightCodeL1,
            priceL1, durationL1, pnrL1, ticketNumberL1;
    Choice sourceCB, destinationCB;
    JTextField idTF;
    JDateChooser travelDateLDC;

    public Reservation(){

        setBounds(150, 150, 1200, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("Reservation");
        text.setFont(new Font("Arial", Font.BOLD, 24));
        text.setForeground(Color.BLACK);
        text.setBounds(450, 20, 400, 30);
        add(text);

        JLabel idL = new JLabel("Customer ID :");
        idL.setFont(new Font("Raleway", Font.BOLD, 16));
        idL.setBounds(100, 80, 150, 20);
        add(idL);

        idTF = new JTextField();
        idTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        idTF.setBounds(280, 80, 200, 25);
        idTF.setBorder(new LineBorder(Color.black));
        add(idTF);

        fetchUser = new JButton("Fetch User");
        fetchUser.setFont(new Font("Raleway", Font.BOLD, 16));
        fetchUser.setBounds(500, 80, 120, 25);
        fetchUser.setBackground(Color.black);
        fetchUser.setForeground(Color.white);
        fetchUser.addActionListener(this);
        add(fetchUser);

        JLabel nameL = new JLabel("Name :");
        nameL.setFont(new Font("Raleway", Font.BOLD, 16));
        nameL.setBounds(100, 120, 150, 20);
        add(nameL);

        nameL1 = new JLabel();
        nameL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        nameL1.setBounds(280, 120, 200, 20);
        add(nameL1);

        JLabel genderL = new JLabel("Gender :");
        genderL.setFont(new Font("Raleway", Font.BOLD, 16));
        genderL.setBounds(100, 160, 150, 20);
        add(genderL);

        genderL1 = new JLabel();
        genderL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        genderL1.setBounds(280, 160, 200, 20);
        add(genderL1);

        JLabel nationalityL = new JLabel("Nationality :");
        nationalityL.setFont(new Font("Raleway", Font.BOLD, 16));
        nationalityL.setBounds(100, 200, 150, 20);
        add(nationalityL);

        nationalityL1 = new JLabel();
        nationalityL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        nationalityL1.setBounds(280, 200, 200, 20);
        add(nationalityL1);

        JLabel phoneL = new JLabel("Phone Number :");
        phoneL.setFont(new Font("Raleway", Font.BOLD, 16));
        phoneL.setBounds(100, 240, 150, 20);
        add(phoneL);

        phoneL1 = new JLabel();
        phoneL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        phoneL1.setBounds(280, 240, 200, 20);
        add(phoneL1);

        JLabel passportNumL = new JLabel("Passport Number :");
        passportNumL.setFont(new Font("Raleway", Font.BOLD, 16));
        passportNumL.setBounds(100, 280, 150, 20);
        add(passportNumL);

         passportNumL1 = new JLabel();
        passportNumL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        passportNumL1.setBounds(280, 280, 200, 20);
        add(passportNumL1);

        JLabel sourceL = new JLabel("Source :");
        sourceL.setFont(new Font("Raleway", Font.BOLD, 16));
        sourceL.setBounds(100, 320, 150, 20);
        add(sourceL);

        sourceCB = new Choice();
        sourceCB.setFont(new Font("Raleway", Font.PLAIN, 16));
        sourceCB.setBounds(280, 320, 200, 25);
        add(sourceCB);

        JLabel destinationL = new JLabel("Destination :");
        destinationL.setFont(new Font("Raleway", Font.BOLD, 16));
        destinationL.setBounds(100, 360, 150, 20);
        add(destinationL);

         destinationCB = new Choice();
        destinationCB.setFont(new Font("Raleway", Font.PLAIN, 16));
        destinationCB.setBounds(280, 360, 200, 25);
        add(destinationCB);

        fetchFlight = new JButton("Fetch User");
        fetchFlight.setFont(new Font("Raleway", Font.BOLD, 16));
        fetchFlight.setBounds(500, 360, 120, 25);
        fetchFlight.setBackground(Color.black);
        fetchFlight.setForeground(Color.white);
        fetchFlight.addActionListener(this);
        add(fetchFlight);

        try {
            DBConnection c = new DBConnection();
            String query = "select * from Flight";

            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()){
                sourceCB.add(rs.getString("source"));
                destinationCB.add(rs.getString("destination"));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        JLabel flightNumL = new JLabel("Fight Number :");
        flightNumL.setFont(new Font("Raleway", Font.BOLD, 16));
        flightNumL.setBounds(100, 400, 150, 20);
        add(flightNumL);

        flightNumL1 = new JLabel();
        flightNumL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        flightNumL1.setBounds(280, 400, 200, 20);
        add(flightNumL1);

        JLabel flightCodeL = new JLabel("Flight Code :");
        flightCodeL.setFont(new Font("Raleway", Font.BOLD, 16));
        flightCodeL.setBounds(100, 440, 150, 20);
        add(flightCodeL);

        flightCodeL1 = new JLabel();
        flightCodeL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        flightCodeL1.setBounds(280, 440, 200, 20);
        add(flightCodeL1);

        JLabel durationL = new JLabel("Duration :");
        durationL.setFont(new Font("Raleway", Font.BOLD, 16));
        durationL.setBounds(680, 80, 150, 20);
        add(durationL);

        durationL1 = new JLabel();
        durationL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        durationL1.setBounds(800, 80, 200, 20);
        add(durationL1);

        JLabel priceL = new JLabel("Cost :");
        priceL.setFont(new Font("Raleway", Font.BOLD, 16));
        priceL.setBounds(680, 120, 150, 20);
        add(priceL);

        priceL1 = new JLabel();
        priceL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        priceL1.setBounds(800, 120, 200, 20);
        add(priceL1);

        JLabel travelDateL = new JLabel("Date of travel :");
        travelDateL.setFont(new Font("Raleway", Font.BOLD, 16));
        travelDateL.setBounds(680, 160, 150, 20);
        add(travelDateL);

        travelDateLDC = new JDateChooser();
        travelDateLDC.setBounds(820, 160, 180, 20);
        travelDateLDC.setBorder(new LineBorder(Color.black));
        add(travelDateLDC);

        confirm = new JButton("Conform");
        confirm.setFont(new Font("Raleway", Font.BOLD, 16));
        confirm.setBounds(880, 300, 120, 25);
        confirm.setBackground(Color.black);
        confirm.setForeground(Color.white);
        confirm.addActionListener(this);
        add(confirm);

        JLabel pnrL = new JLabel("PNR Number :");
        pnrL.setFont(new Font("Raleway", Font.BOLD, 16));
        pnrL.setBounds(680, 200, 150, 20);
        add(pnrL);

        pnrL1 = new JLabel();
        pnrL1.setBounds(820, 200, 180, 20);
        pnrL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(pnrL1);

        JLabel ticketNumberL = new JLabel("Ticket Number :");
        ticketNumberL.setFont(new Font("Raleway", Font.BOLD, 16));
        ticketNumberL.setBounds(680, 240, 150, 20);
        add(ticketNumberL);

        ticketNumberL1 = new JLabel();
        ticketNumberL1.setBounds(820, 240, 180, 20);
        ticketNumberL1.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(ticketNumberL1);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == fetchUser){
            String idS = idTF.getText();

            try {
                DBConnection c = new DBConnection();
                String query = "select * from Customer where customerId = '"+idS+"'";
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()){
                    nameL1.setText(rs.getString("name"));
                    genderL1.setText(rs.getString("gender"));
                    phoneL1.setText(rs.getString("phone"));
                    passportNumL1.setText(rs.getString("passportNumber"));
                    nationalityL1.setText(rs.getString("nationality"));
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Customer Id!");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        else if (ae.getSource() == fetchFlight){

            String sourceS = sourceCB.getSelectedItem();
            String destinationS = destinationCB.getSelectedItem();

            try {
                DBConnection c = new DBConnection();
                String query = "select * from Flight where source = '"+sourceS+"' and destination = '"+destinationS+"'";

                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()){
                    flightCodeL1.setText(rs.getString("flightCode"));
                    flightNumL1.setText(rs.getString("flightNumber"));
                    durationL1.setText(rs.getString("duration"));
                    priceL1.setText(rs.getString("price"));

                    Random random = new Random();
                    pnrL1.setText( "PNR - " + random.nextInt(100000));
                    ticketNumberL1.setText( "TKT - " + random.nextInt(1000));
                }
                else {
                    JOptionPane.showMessageDialog(null, "No flights available for this route!");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        else if (ae.getSource() == confirm){
            String nameS = nameL1.getText();
            String genderS = genderL1.getText();
            String phoneS = phoneL1.getText();
            String passportS = passportNumL1.getText();
            String nationalityS = nationalityL1.getText();
            String flightNumS = flightNumL1.getText();
            String flightCodeS = flightCodeL1.getText();
            String priceS = priceL1.getText();
            String durationS = durationL1.getText();
            String sourceS = sourceCB.getSelectedItem();
            String destinationS = destinationCB.getSelectedItem();
            String idS = idTF.getText();
            String travelDateS = ((JTextField) travelDateLDC.getDateEditor().getUiComponent()).getText();
            String pnrS = pnrL1.getText();
            String ticketS = ticketNumberL1.getText();

            if (idS.isEmpty() || flightCodeS.isEmpty() || travelDateS.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill the required field!");
            }
            else {
                try {
                    DBConnection c = new DBConnection();
                    String query1 = "select * from Customer where customerId = '"+idS+"'";
                    ResultSet rs = c.s.executeQuery(query1);
                    if (rs.next()){
                        String query = "insert into Reservation values('"+idS+"', '"+nameS+"', '"+genderS+"', '"+nationalityS+"', '"+phoneS+"', '"+passportS+"', '"+sourceS+"', '"+destinationS+"', '"+flightNumS+"', '"+flightCodeS+"', '"+durationS+"', '"+priceS+"', '"+travelDateS+"', '"+pnrS+"', '"+ticketS+"')";
                        c.s.executeUpdate(query);

                        JOptionPane.showMessageDialog(null, "Ticket booked successfully!");
                        setVisible(false);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid Customer ID!");
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        }

    }

    public static void main(String[] args) {

        new Reservation();

    }
}
