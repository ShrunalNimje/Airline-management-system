package my.mood;

import java.sql.*;

public class DBConnection {

    Connection c;
    Statement s;

    public DBConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "Shrunal#2383");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

    }
}