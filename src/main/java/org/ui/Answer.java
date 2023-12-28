package org.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created on 28.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class Answer extends JFrame {

    private JPanel panel;
    private JLabel welcome;
    private JLabel answer;
    private JButton closeButton;

    /**
     * Constructor
     */
    Answer(String answer, String type) {
        setContentPane(panel);
        setTitle("TDC calculator");
        setSize(250, 170);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        switch (type) {
            case "s" -> this.answer.setText(answer + " kn");
            case "d" -> this.answer.setText(answer + " m");
            case "a" -> this.answer.setText(answer + " °");
        }


        closeButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Answer.this, WindowEvent.WINDOW_CLOSING));
                new Main();
            }
        });
    }
}
