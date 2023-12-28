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
public class AoB extends JFrame {

    private JPanel panel;
    private JTextField visual_field;
    private JTextField real_field;
    private JLabel real_length;
    private JLabel visual_legth;
    private JButton calculateButton;
    private JButton goBackButton;

    /**
     * Constructor
     */
    AoB() {
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
                dispatchEvent(new WindowEvent(AoB.this, WindowEvent.WINDOW_CLOSING));
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
                dispatchEvent(new WindowEvent(AoB.this, WindowEvent.WINDOW_CLOSING));
                new Answer(Calculations.AoB(visual_field.getText(), real_field.getText()));
            }
        });
    }
}
