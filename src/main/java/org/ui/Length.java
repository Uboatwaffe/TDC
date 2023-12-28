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
public class Length extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JSlider zoom_slider;
    private JButton calculateButton;
    private JButton goBackButton;
    private JPanel panel;
    private JLabel distance;
    private JLabel length;
    private JLabel zoom;

    /**
     * Constructor
     */
    Length() {
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
                dispatchEvent(new WindowEvent(Length.this, WindowEvent.WINDOW_CLOSING));
                new Main();
            }
        });
    }
}
