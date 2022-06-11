package com.diploma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Request4 {
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

                    Request4 window = new Request4();

                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Request4() throws IOException {
        initialize();
    }

    private void initialize() throws IOException {
        conn = Database.ConnecrDB();
        frame.setBounds(300, 300, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new java.awt.Color(247, 251, 252));


        JLabel insuranceType = new JLabel("Запрос 4 - Филиал");
        insuranceType.setFont(new Font(null, Font.PLAIN, 20));
        insuranceType.setBounds(50, 20, 280, 30);
        frame.getContentPane().add(insuranceType);

        JLabel codeLabel = new JLabel("Филиал");
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

        JTextArea textFieldFactorial = new JTextArea();
        textFieldFactorial.setEditable(false);
        textFieldFactorial.setBounds(170, 120, 500, 200);
        frame.getContentPane().add(textFieldFactorial);
        textFieldFactorial.setColumns(10);

        Icon icon1 = new ImageIcon(getClass().getResource("/resources/button_vypolnit.png"));
        JButton button = new JButton(icon1);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    String sqlPrefix  = "SELECT * FROM Branch WHERE Name IN (\'" ;
                    StringBuilder sql = new StringBuilder(sqlPrefix).append(codeTextField.getText()).append("\')");
                    pst = conn.prepareStatement(sql.toString());
                    ResultSet contractResultSet = pst.executeQuery();
                    StringBuilder contractsResult = new StringBuilder();
                    while (contractResultSet.next()){
                        contractsResult.append(contractResultSet.getString(2))
                                .append(" ")
                                .append(contractResultSet.getString(3))
                                .append(" ")
                                .append(contractResultSet.getString(4))
                                .append("\n");
                    }
                    textFieldFactorial.setText(contractsResult.toString());
                    JOptionPane.showMessageDialog(null, "Выполенено успешно");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        });
        button.setBounds(200, 350, 150, 25);
        frame.getContentPane().add(button);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);

        Icon icon2 = new ImageIcon(getClass().getResource("/resources/button_otkryt-tablicu.png"));
        JButton button1 = new JButton(icon2);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {JFrame1.main(new String[0]);}
        });
        button1.setBounds(360, 350, 150, 25);
        frame.getContentPane().add(button1);
        button1.setBorder(BorderFactory.createEmptyBorder());
        button1.setContentAreaFilled(false);

        Icon icon5 = new ImageIcon(getClass().getResource("/resources/button_nazad.png"));
        JButton button5 = new JButton(icon5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Requests.main(new String[0]);
            }
        });
        button5.setBounds(200, 400, 150, 25);
        frame.getContentPane().add(button5);
        button5.setBorder(BorderFactory.createEmptyBorder());
        button5.setContentAreaFilled(false);


    }
}
