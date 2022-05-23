package com.diploma;
// Импорт нужных классов
import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// Импортируются классы JButton и JLabel

// класс приложения
public class Okno2 {
    // Окно приложения
    public JFrame frame;

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
                    Okno2 window = new Okno2();
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

    /**
     * 
     */
   public static final Color white     = new Color(247, 251, 252);
// Конструктор класса нашего приложения
    /**
     * Create the application.
     */
    public Okno2() throws IOException {
        initialize();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() throws IOException {



// Создается окно нашего приложения
        frame = new JFrame();
// Задаются границы окна
        frame.setBounds(300, 300, 800, 600);
// Задается операция в случае закрытия окна
// EXIT_ON_CLOSE – при закрытии окна – выход из программы
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Добавлен Absolute Layout
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new java.awt.Color(247, 251, 252));


        Icon icon1 = new ImageIcon("src/resources/button_vid-straxovaniya.PNG");
        // Создается локальная переменная button
        JButton button1
// создается кнопка с надписью
                = new JButton(icon1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
// Задаем размещение и размеры кнопки
        button1.setBounds(70, 140, 150, 25);
// Добавляем кнопку на frame - окно приложения
        frame.getContentPane().add(button1);
        button1.setBorder(BorderFactory.createEmptyBorder());
        button1.setContentAreaFilled(false);

        Icon icon2 = new ImageIcon("src/resources/button_dogovor.PNG");
        JButton button2 = new JButton(icon2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button2.setBounds(70, 185, 150, 25);
        frame.getContentPane().add(button2);
        button2.setBorder(BorderFactory.createEmptyBorder());
        button2.setContentAreaFilled(false);

         Icon icon3 = new ImageIcon("src/resources/button_sotrudniki.PNG");
        JButton button3 = new JButton(icon3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button3.setBounds(70, 230, 150, 25);
        frame.getContentPane().add(button3);
        button3.setBorder(BorderFactory.createEmptyBorder());
        button3.setContentAreaFilled(false);

        Icon icon4 = new ImageIcon("src/resources/button_filialy.PNG");
        JButton button4 = new JButton(icon4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button4.setBounds(70, 275, 150, 25);
        frame.getContentPane().add(button4);
        button4.setBorder(BorderFactory.createEmptyBorder());
        button4.setContentAreaFilled(false);

        Icon icon5 = new ImageIcon("src/resources/button_zaprosy.PNG");
        JButton button5 = new JButton(icon5);
        button5.setBounds(70, 320, 150, 25);
        frame.getContentPane().add(button5);
        button5.setBorder(BorderFactory.createEmptyBorder());
        button5.setContentAreaFilled(false);

        ImageIcon icon6 =  new ImageIcon("src/resources/Venera.PNG");
        JLabel Venera = new JLabel(icon6);
        Venera.setBounds(250, 40, 500, 500);
        frame.getContentPane().add(Venera);

    }
}
