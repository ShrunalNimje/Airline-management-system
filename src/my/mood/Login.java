package my.mood;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton back, login;
    JTextField usernameTF;
    JPasswordField passwordPF;

    public Login(){

        setSize(700, 400);
        setLocation(420, 250);
        setLayout(null);

        JLabel text = new JLabel("Welcome to Air India");
        text.setFont(new Font("Arial", Font.BOLD, 24));
        text.setBounds(180, 30, 500, 25);
        add(text);

        JLabel usernameL = new JLabel("Staff Number :");
        usernameL.setFont(new Font("Arial", Font.BOLD, 16));
        usernameL.setBounds(80, 100, 120, 25);
        add(usernameL);

        JLabel passwordL = new JLabel("Password :");
        passwordL.setFont(new Font("Arial", Font.BOLD, 16));
        passwordL.setBounds(80, 150, 120, 25);
        add(passwordL);

        usernameTF = new JTextField();
        usernameTF.setFont(new Font("Arial", Font.PLAIN, 16));
        usernameTF.setBounds(250, 100, 250, 25);
        usernameTF.setBorder(new LineBorder(Color.BLACK));
        add(usernameTF);

        passwordPF = new JPasswordField();
        passwordPF.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordPF.setBounds(250, 150, 250, 25);
        passwordPF.setBorder(new LineBorder(Color.BLACK));
        add(passwordPF);

        login = new JButton("Login");
        login.setFont(new Font("Arial", Font.BOLD, 18));
        login.setBounds(400, 220, 100, 30);
        login.setBackground(Color.orange);
        login.setForeground(Color.BLACK);
        login.setBorder(new LineBorder(Color.BLACK));
        login.addActionListener(this);
        add(login);

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.BOLD, 18));
        back.setBounds(250, 220, 100, 30);
        back.setBackground(Color.orange);
        back.setForeground(Color.BLACK);
        back.setBorder(new LineBorder(Color.BLACK));
        back.addActionListener(this);
        add(back);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        String usernameS = usernameTF.getText();
        String passwordS = passwordPF.getText();

        if (ae.getSource() == back){
            setVisible(false);
        }
        else if (ae.getSource() == login){
            if (usernameS.isEmpty() || passwordS.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter a valid Staff Number or Password");
            }
            else {
                try {
                    DBConnection c = new DBConnection();
                    String query = "select * from login where username = '"+usernameS+"' and password = '"+passwordS+"'";
                    ResultSet rs = c.s.executeQuery(query);

                    if (rs.next()){
                        setVisible(false);
                        new Dashboard().setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid Staff Number or Password");
                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {

        new Login();

    }
}