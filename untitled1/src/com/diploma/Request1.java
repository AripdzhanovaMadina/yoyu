package com.diploma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Request1 {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public JTextField textFieldFactorial;
    JFrame frame = new JFrame();
    private JTable resultTable;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {

                    Request1 window = new Request1();

                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Request1() throws IOException {
        initialize();
    }

    private void initialize() throws IOException {
        conn = Database.ConnecrDB();
        frame.setBounds(300, 300, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new java.awt.Color(247, 251, 252));


        JLabel insuranceType = new JLabel("Запрос 1 - Вид страхования");
        insuranceType.setFont(new Font(null, Font.PLAIN, 20));
        insuranceType.setBounds(50, 20, 280, 30);
        frame.getContentPane().add(insuranceType);

        JLabel codeLabel = new JLabel("Вид стахования");
        codeLabel.setFont(new Font(null, Font.PLAIN, 14));
        codeLabel.setBounds(50, 60, 120, 30);
        frame.getContentPane().add(codeLabel);

        JTextField codeTextField = new JTextField();
        codeTextField.setBounds(170, 65, 300, 20);
        frame.getContentPane().add(codeTextField);
        codeTextField.setColumns(10);

        JLabel labelFactorial = new JLabel("Результат");
        labelFactorial.setFont(new Font(null, Font.PLAIN, 14));
        labelFactorial.setBounds(50, 120, 227, 14);
        frame.getContentPane().add(labelFactorial);
        codeTextField.setColumns(10);

        textFieldFactorial = new JTextField();
        textFieldFactorial.setEditable(false);
        textFieldFactorial.setBounds(170, 120, 300, 140);
        frame.getContentPane().add(textFieldFactorial);
        textFieldFactorial.setColumns(10);

        Icon icon1 = new ImageIcon("src/resources/button_vypolnit.PNG");
        JButton button = new JButton(icon1);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    String sql  = "SELECT * FROM contract\n" +
                            "WHERE name IN ('?');";
                    pst = conn.prepareStatement(sql);
                    pst.execute();

                    JOptionPane.showMessageDialog(null, "Выполенено успешно");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        });
        button.setBounds(200, 280, 150, 25);
        frame.getContentPane().add(button);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);




    }
}
