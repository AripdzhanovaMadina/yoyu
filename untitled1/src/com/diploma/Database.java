package com.diploma;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Database {
    Connection conn = null;
    Connection connect = null;
    public static Connection ConnecrDB(){

        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:src/resources/Insurance Company.db");
            JOptionPane.showMessageDialog(null, "Connection");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }


    }

