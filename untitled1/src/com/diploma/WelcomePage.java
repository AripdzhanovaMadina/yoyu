package com.diploma;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class WelcomePage {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();


    WelcomePage(String userID) {
        conn = Database.ConnecrDB();
        welcomeLabel.setBounds(360, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 15));
        welcomeLabel.setText(userID);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(null);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new java.awt.Color(247, 251, 252));
        frame.setVisible(true);

        Icon icon1 = new ImageIcon(getClass().getResource("/resources/button_vid-straxovaniya.png"));
        // Создается локальная переменная button
        JButton button1
// создается кнопка с надписью
                = new JButton(icon1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InsuranceType.main(new String[0]);
            }
        });
// Задаем размещение и размеры кнопки
        button1.setBounds(70, 100, 150, 25);
// Добавляем кнопку на frame - окно приложения
        frame.getContentPane().add(button1);
        button1.setBorder(BorderFactory.createEmptyBorder());
        button1.setContentAreaFilled(false);

        Icon icon2 = new ImageIcon(getClass().getResource("/resources/button_dogovor.png"));
        JButton button2 = new JButton(icon2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Contract.main(new String[0]);
            }
        });
        button2.setBounds(70, 145, 150, 25);
        frame.getContentPane().add(button2);
        button2.setBorder(BorderFactory.createEmptyBorder());
        button2.setContentAreaFilled(false);

        Icon icon3 = new ImageIcon(getClass().getResource("/resources/button_sotrudniki.png"));
        JButton button3 = new JButton(icon3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Employees.main(new String[0]);
            }
        });
        button3.setBounds(70, 190, 150, 25);
        frame.getContentPane().add(button3);
        button3.setBorder(BorderFactory.createEmptyBorder());
        button3.setContentAreaFilled(false);

        Icon icon4 = new ImageIcon(getClass().getResource("/resources/button_filialy.png"));
        JButton button4 = new JButton(icon4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Branch.main(new String[0]);
            }
        });
        button4.setBounds(70, 235, 150, 25);
        frame.getContentPane().add(button4);
        button4.setBorder(BorderFactory.createEmptyBorder());
        button4.setContentAreaFilled(false);

        Icon icon5 = new ImageIcon(getClass().getResource("/resources/button_klienty.png"));
        JButton button5 = new JButton(icon5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Clients.main(new String[0]);
            }
        });
        button5.setBounds(70, 280, 150, 25);
        frame.getContentPane().add(button5);
        button5.setBorder(BorderFactory.createEmptyBorder());
        button5.setContentAreaFilled(false);

        Icon icon6 = new ImageIcon(getClass().getResource("/resources/button_zaprosy.png"));
        JButton button6 = new JButton(icon6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Requests.main(new String[0]);
            }
        });
        button6.setBounds(70, 325, 150, 25);
        frame.getContentPane().add(button6);
        button6.setBorder(BorderFactory.createEmptyBorder());
        button6.setContentAreaFilled(false);


        ImageIcon icon7 = new ImageIcon(getClass().getResource("/resources/Venera.png"));
        JLabel Venera = new JLabel(icon7);
        Venera.setBounds(250, 40, 500, 500);
        frame.getContentPane().add(Venera);
    }


}
