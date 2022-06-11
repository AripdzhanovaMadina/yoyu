package com.diploma;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    Connection conn = null;
    Connection connect = null;
    public static Connection ConnecrDB(){

        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Diploma/insurancecompany.db");
            Statement statement = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Connection");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }


    }

