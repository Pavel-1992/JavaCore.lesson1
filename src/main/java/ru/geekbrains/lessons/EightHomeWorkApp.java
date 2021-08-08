package ru.geekbrains.lessons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EightHomeWorkApp extends JFrame {
    private int counter;

    public EightHomeWorkApp(int initialValue) {
        setBounds(700, 700, 600, 400);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 50);

        JTextField counterValueView = new JTextField();

        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        counter = initialValue;
        counterValueView.setText(String.valueOf(counter));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        counterValueView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter++;
                counterValueView.setText(String.valueOf(counter));
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter--;
                counterValueView.setText(String.valueOf(counter));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter++;
                counterValueView.setText(String.valueOf(counter));
            }
        });



        setVisible(true);
    }

    public static void main(String[] args) {
        new EightHomeWorkApp(0);
    }
}

