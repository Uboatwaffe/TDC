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
public class WrongFormat extends JFrame {

    private JPanel panel;
    private JButton closeButton;
    private JLabel info;
    private JLabel info2;
    private JLabel info3;
    private JLabel info4;
    private JLabel reasons;

    /**
     * Constructor
     */
    WrongFormat() {
        setContentPane(panel);
        setTitle("TDC calculator");
        setSize(400, 230);
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
                // Opens main menu and closes this window
                dispatchEvent(new WindowEvent(WrongFormat.this, WindowEvent.WINDOW_CLOSING));
                new Main();
            }
        });
    }
}
