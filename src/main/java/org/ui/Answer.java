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
    Answer() {
        setContentPane(panel);
        setTitle("TDC calculator");
        setSize(250, 125);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        closeButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Answer.this, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}
