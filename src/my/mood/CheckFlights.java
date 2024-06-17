package my.mood;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class CheckFlights extends JFrame {

    public CheckFlights(){

        setBounds(150, 150, 1200, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JTable table = new JTable();
        table.setFont(new Font("Raleway", Font.PLAIN, 16));
        table.setForeground(Color.BLACK);

        try {
            DBConnection c = new DBConnection();
            String query = "select * from Flight";
            ResultSet rs = c.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e){
            System.out.println(e);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0,0, 1200, 600);
        add(scrollPane);

        setVisible(true);

    }

    public static void main(String[] args) {

        new CheckFlights();

    }
}
