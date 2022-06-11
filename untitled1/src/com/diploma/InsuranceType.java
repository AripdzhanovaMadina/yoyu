package com.diploma;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class InsuranceType {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    JFrame frame = new JFrame();
    private JTable resultTable;

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



    public InsuranceType() throws IOException{
        initialize();
    }

    private void initialize() throws IOException {
        conn = Database.ConnecrDB();
        frame.setBounds(300, 300, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new java.awt.Color(247, 251, 252));


        JLabel insuranceType = new JLabel("Вид страхования");
        insuranceType.setFont(new Font(null,Font.PLAIN,20));
        insuranceType.setBounds(200, 20, 200, 30);
        frame.getContentPane().add(insuranceType);

        JLabel codeLabel = new JLabel("Код");
        codeLabel.setFont(new Font(null,Font.PLAIN,14));
        codeLabel.setBounds(50, 60, 120, 30);
        frame.getContentPane().add(codeLabel);

        JLabel nameLabel = new JLabel("Вид страхования");
        nameLabel.setFont(new Font(null,Font.PLAIN,14));
        nameLabel.setBounds(50, 100, 120, 30);
        frame.getContentPane().add(nameLabel);

        JLabel percentLabel = new JLabel("Процент");
        percentLabel.setFont(new Font(null,Font.PLAIN,14));
        percentLabel.setBounds(50, 140, 120, 30);
        frame.getContentPane().add(percentLabel);

        JTextField codeTextField = new JTextField();
        codeTextField.setBounds(170, 65, 300, 20);
        frame.getContentPane().add(codeTextField);
        codeTextField.setColumns(10);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(170, 105, 300, 20);
        frame.getContentPane().add(nameTextField);
        nameTextField.setColumns(10);

        JTextField percentageTextField = new JTextField();
        percentageTextField.setBounds(170, 145, 300, 20);
        frame.getContentPane().add(percentageTextField);
        percentageTextField.setColumns(10);



        Icon icon1 = new ImageIcon(getClass().getResource("/resources/button_obnovit.png"));
        JButton button3 = new JButton(icon1);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try{
                String sql = "UPDATE Insurance_type SET "

                        +  " Code = " + codeTextField.getText()+","
                            +  " Name = '" + nameTextField.getText()+"',"
                            +  " Percent = " + percentageTextField.getText()+ " WHERE Code = " +codeTextField.getText();


                        pst = conn.prepareStatement(sql);
                        pst.execute();

                    JOptionPane.showMessageDialog(null, "Изменено успешно");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });
        button3.setBounds(100, 210, 150, 25);
        frame.getContentPane().add(button3);
        button3.setBorder(BorderFactory.createEmptyBorder());
        button3.setContentAreaFilled(false);

        Icon icon4 = new ImageIcon(getClass().getResource("/resources/button_udalit.png"));
        JButton button4 = new JButton(icon4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try{
                    String sqlPrefix = "DELETE FROM Insurance_type WHERE Code = ";
                    StringBuilder sql = new StringBuilder(sqlPrefix).append(codeTextField.getText());
                    pst = conn.prepareStatement(sql.toString());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Удалено успешно");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });
        button4.setBounds(300, 210, 150, 25);
        frame.getContentPane().add(button4);
        button4.setBorder(BorderFactory.createEmptyBorder());
        button4.setContentAreaFilled(false);


        Icon icon2 = new ImageIcon(getClass().getResource("/resources/button_otkryt-tablicu.png"));
        JButton button1 = new JButton(icon2);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {JFrame1.main(new String[0]);}
        });
        button1.setBounds(100, 180, 150, 25);
        frame.getContentPane().add(button1);
        button1.setBorder(BorderFactory.createEmptyBorder());
        button1.setContentAreaFilled(false);


        Icon icon3 = new ImageIcon(getClass().getResource("/resources/button_dobavit.png"));
        JButton button = new JButton(icon3);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String sql = "INSERT INTO Insurance_type(Code, Name, Percent) VALUES (?, ?, ?)";
                try{
                    pst = conn.prepareStatement(sql);
                    pst.setInt(1, Integer.valueOf(codeTextField.getText()));
                    pst.setString(2, nameTextField.getText());
                    pst.setInt(3, Integer.valueOf(percentageTextField.getText()));
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
