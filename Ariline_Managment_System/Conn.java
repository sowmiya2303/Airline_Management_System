package Ariline_Managment_System;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "Sowmiya@29");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

