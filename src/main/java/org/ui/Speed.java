package org.ui;

import calculations.Calculations;

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
public class Speed extends JFrame {

    private JPanel panel;
    private JTextField length_field;
    private JTextField time_field;
    private JButton calculateButton;
    private JButton goBackButton;
    private JLabel length;
    private JLabel time;

    /**
     * Constructor
     */
    Speed() {
        setContentPane(panel);
        setTitle("TDC calculator");
        setSize(530, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        goBackButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Opens main menu and closes this window
                dispatchEvent(new WindowEvent(Speed.this, WindowEvent.WINDOW_CLOSING));
                new Main();
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Opens dialog with answer and closes this window
                new Answer(Calculations.Speed(length_field.getText(), time_field.getText()), "s");
                dispatchEvent(new WindowEvent(Speed.this, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}
