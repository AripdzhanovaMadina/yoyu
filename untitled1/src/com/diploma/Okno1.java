package com.diploma;// Импорт нужных классов
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
// Импортируются классы JButton и JLabel

// класс приложения
    public class Okno1 {
        // Окно приложения
        public JFrame frame;
    public JTextField textFieldN;
    private JPanel panel1;
    public JTextField textFieldFactorial;

    /**
         * Launch the application.
         */
        public static void main(String[] args) {
// Обработка событий создаваемого анонимного класса
// new Runnable() {
            EventQueue.invokeLater(new Runnable() {
                // run() – это метод потока выполнения
// В нем выполняется наше приложение
                public void run() {
                    try {
// Создание объекта нашего класса
                        Okno1 window = new Okno1();
// Окно приложения делается видимым
// Пока его не закроют – наше приложение
// будет работать
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
// Конструктор класса нашего приложения
        /**
         * Create the application.
         */
        public Okno1() {
            initialize();
        }
        /**
         * Initialize the contents of the frame.
         */
        private void initialize() {
// Создается окно нашего приложения
            frame = new JFrame();
// Задаются границы окна
            frame.setBounds(300, 300, 500, 500);
// Задается операция в случае закрытия окна
// EXIT_ON_CLOSE – при закрытии окна – выход из программы
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Добавлен Absolute Layout
            frame.getContentPane().setLayout(null);
            frame.getContentPane().setBackground(new java.awt.Color(247, 251, 252));

            JLabel labelN = new JLabel("SQL - Запрос");
            labelN.setBounds(29, 37, 100, 14);
            frame.getContentPane().add(labelN);

            JLabel labelFactorial = new JLabel("Результат");
            labelFactorial.setBounds(29, 187, 227, 14);
            frame.getContentPane().add(labelFactorial);
            
            textFieldN = new JTextField();
            textFieldN.setBounds(125, 34, 300, 140);
            frame.getContentPane().add(textFieldN);
            textFieldN.setColumns(10);
            
            textFieldFactorial = new JTextField();
            textFieldFactorial.setEditable(false);
            textFieldFactorial.setBounds(125, 180, 300, 140);
            frame.getContentPane().add(textFieldFactorial);
            textFieldFactorial.setColumns(10);


            Icon icon1 = new ImageIcon("C:\\button_vypolnit.PNG");
// Создается локальная переменная button
            JButton button
// создается кнопка с надписью
                    = new JButton(icon1);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
// Задаем размещение и размеры кнопки
            button.setBounds(200, 340, 150, 25);
// Добавляем кнопку на frame - окно приложения
            frame.getContentPane().add(button);
// Создается локальная переменная label
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setContentAreaFilled(false);

            Icon icon2 = new ImageIcon("C:\\button_nazad.PNG");
// Создается локальная переменная button
            JButton button1
// создается кнопка с надписью
                    = new JButton(icon2);
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
// Задаем размещение и размеры кнопки
            button1.setBounds(200, 400, 150, 25);
// Добавляем кнопку на frame - окно приложения
            frame.getContentPane().add(button1);
// Создается локальная переменная label
            button1.setBorder(BorderFactory.createEmptyBorder());
            button1.setContentAreaFilled(false);

        }
    }

