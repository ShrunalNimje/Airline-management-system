package my.mood;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CheckReservation extends JFrame implements ActionListener {

    JTextField pnrTF;
    JButton check, back;
    JTable table;

    public CheckReservation(){

        setBounds(150, 150, 1200, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Check Reservation");
        text.setFont(new Font("Arial", Font.BOLD, 24));
        text.setBounds(450, 20, 400, 30);
        add(text);

        JLabel pnrL = new JLabel("PNR Number :");
        pnrL.setFont(new Font("Arial", Font.BOLD, 16));
        pnrL.setBounds(200, 100, 150, 20);
        add(pnrL);

        pnrTF = new JTextField();
        pnrTF.setFont(new Font("Arial", Font.PLAIN, 16));
        pnrTF.setBounds(380, 100, 200, 25);
        pnrTF.setBorder(new LineBorder(Color.black));
        add(pnrTF);

        check = new JButton("Check");
        check.setFont(new Font("Arial", Font.BOLD, 18));
        check.setBounds(630, 100, 120, 25);
        check.setBackground(Color.black);
        check.setForeground(Color.white);
        check.setBorder(new LineBorder(Color.white));
        check.addActionListener(this);
        add(check);

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.BOLD, 18));
        back.setBounds(1000, 500, 120, 25);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBorder(new LineBorder(Color.white));
        back.addActionListener(this);
        add(back);

        table = new JTable();

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == back){
            setVisible(false);
        }
        else {
            String pnrS = pnrTF.getText();

            try {
                DBConnection c = new DBConnection();
                String query = "select * from Reservation where pnrNumber = '"+pnrS+"'";
                ResultSet rs = c.s.executeQuery(query);

                JScrollPane scrollPane = new JScrollPane(table);
                scrollPane.setBounds(10, 150, 1170, 300);
                add(scrollPane);

                if (!rs.isBeforeFirst()){
                    JOptionPane.showMessageDialog(null, "Invalid PNR Number!");
                }
                else {
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        new CheckReservation();

    }
}
