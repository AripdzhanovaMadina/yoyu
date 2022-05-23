package com.diploma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsuranceType {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    JFrame frame = new JFrame();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {

                    InsuranceType window = new InsuranceType();

                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public InsuranceType() throws IOException {
        initialize();
    }

    private void initialize() throws IOException {
        conn = Database.ConnecrDB();
        frame.setBounds(300, 300, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new java.awt.Color(247, 251, 252));

        JLabel InsuranceType = new JLabel("Вид страхования");
        InsuranceType.setFont(new Font(null,Font.PLAIN,20));
        InsuranceType.setBounds(300, 20, 200, 30);
        frame.getContentPane().add(InsuranceType);

        JLabel Code = new JLabel("Код");
        Code.setFont(new Font(null,Font.PLAIN,14));
        Code.setBounds(50, 60, 120, 30);
        frame.getContentPane().add(Code);

        JLabel Name = new JLabel("Вид страхования");
        Name.setFont(new Font(null,Font.PLAIN,14));
        Name.setBounds(50, 100, 120, 30);
        frame.getContentPane().add(Name);

        JLabel Percent = new JLabel("Процент");
        Percent.setFont(new Font(null,Font.PLAIN,14));
        Percent.setBounds(50, 140, 120, 30);
        frame.getContentPane().add(Percent);

        JTextField textFieldC = new JTextField();
        textFieldC.setBounds(170, 60, 300, 20);
        frame.getContentPane().add(textFieldC);
        textFieldC.setColumns(10);

        JTextField textFieldN = new JTextField();
        textFieldN.setBounds(170, 100, 300, 20);
        frame.getContentPane().add(textFieldN);
        textFieldN.setColumns(10);

        JTextField textFieldP = new JTextField();
        textFieldP.setBounds(170, 140, 300, 20);
        frame.getContentPane().add(textFieldP);
        textFieldP.setColumns(10);

        Icon icon1 = new ImageIcon("src/resources/button_dobavit.png");

        JButton button = new JButton(icon1);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String sql = "INSERT INTO Insurance_type(Code, Name, Percent) VALUES (?, ?, ?)";
                try{
                    pst = conn.prepareStatement(sql);
                    pst.setInt(1, Integer.valueOf(Code.getText()));
                    pst.setString(2, Name.getText());
                    pst.setInt(3, Integer.valueOf(Percent.getText()));
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Добавлено успешно");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });
        button.setBounds(300, 180, 150, 25);
        frame.getContentPane().add(button);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);




    }
}
