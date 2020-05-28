package ru.geekbrains.Java_lvl2_lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DefaultChat extends JFrame {


    JPanel jPanel2 = new JPanel(new GridLayout(3, 1, 2, 2));


    JButton sendMessageButton = new JButton("Send message");
    JTextArea textArea = new JTextArea();
    JTextField textField = new JTextField();
    JScrollPane scrollPane = new JScrollPane(textArea);

    DefaultChat() {

        setMinimumSize(new Dimension(480, 640));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        sendMessageButton.addActionListener(e -> {
            sendMessage();
        });
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
            }
        });
        jPanel2.add(scrollPane);
        jPanel2.add(textField);
        jPanel2.add(sendMessageButton);


        add(jPanel2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void sendMessage() {
        String message = textField.getText();
        textArea.append(message);
        textField.setText(" ");
    }

    public static void main(String[] args) {
        new DefaultChat();
    }


}
