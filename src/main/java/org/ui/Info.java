package org.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created on 01.01.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class Info extends JFrame {

    private JPanel panel;
    private JLabel welcome;
    private JLabel one;
    private JLabel two;
    private JLabel three;
    private JLabel four;
    private JLabel five;
    private JButton closeButton;

    /**
     * Constructor
     */
    Info() {
        setContentPane(panel);
        setTitle("TDC calculator");
        setSize(650, 250);
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
                dispatchEvent(new WindowEvent(Info.this, WindowEvent.WINDOW_CLOSING));
                new Main();
            }
        });
    }
}
