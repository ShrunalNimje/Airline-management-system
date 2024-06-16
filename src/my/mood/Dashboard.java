package my.mood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    public Dashboard(){

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 780, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 780);
        add(image);

        JLabel text = new JLabel("Welcome to Air India");
        text.setBounds(520, 50, 800, 50);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Arial", Font.BOLD, 50));
        image.add(text);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu details = new JMenu("Details");
        details.setFont(new Font("Arial", Font.BOLD, 18));
        details.setForeground(Color.red);
        menuBar.add(details);

        JMenuItem checkFLights = new JMenuItem("Check FLights");
        checkFLights.addActionListener(this);
        details.add(checkFLights);

        JMenuItem addCustomer = new JMenuItem("Add Customer Details");
        addCustomer.addActionListener(this);
        details.add(addCustomer);

        JMenuItem reservation = new JMenuItem("Reservation");
        reservation.addActionListener(this);
        details.add(reservation);

        JMenuItem checkReservation = new JMenuItem("Check Reservation");
        checkReservation.addActionListener(this);
        details.add(checkReservation);

        JMenuItem cancellation = new JMenuItem("Cancellation");
        cancellation.addActionListener(this);
        details.add(cancellation);

        JMenu tickets = new JMenu("Tickets");
        tickets.setFont(new Font("Arial", Font.BOLD, 18));
        tickets.setForeground(Color.red);
        menuBar.add(tickets);

        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        tickets.add(boardingPass);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae){

        String text = ae.getActionCommand();

        switch (text) {
            case "Check FLights" -> new CheckFlights();
            case "Add Customer Details" -> new AddCustomer();
            case "Reservation" -> new Reservation();
            case "Check Reservation" -> new CheckReservation();
            case "Cancellation" -> new Cancellation();
            case "Boarding Pass" -> new BoardingPass();
        }
    }

    public static void main(String[] args) {

        new Dashboard();

    }
}