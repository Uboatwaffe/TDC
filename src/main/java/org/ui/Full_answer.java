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
public class Full_answer extends JFrame {

    private JPanel panel;
    private JButton closeButton;
    private JLabel distance;
    private JLabel aob;
    private JLabel speed;

    /**
     * Constructor
     */
    Full_answer(String distance, String speed, String aob) {
        setContentPane(panel);
        setTitle("TDC calculator");
        setSize(530, 150);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        this.distance.setText("Distance is equal to: " + distance + " m");
        this.aob.setText("AoB is equal to: " + aob + " °");
        this.speed.setText("Speed is equal to: " + speed + " kn");
        closeButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Full_answer.this, WindowEvent.WINDOW_CLOSING));
                new Main();
            }
        });
    }
}
