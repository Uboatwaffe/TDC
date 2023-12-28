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
public class Distance extends JFrame {

    private JTextField textField1;
    private JLabel height;
    private JTextField textField2;
    private JSlider zoom_slider;
    private JLabel zoom;
    private JLabel miliradians;
    private JPanel panel;
    private JButton calculateButton;
    private JButton goBackButton;

    /**
     * Constructor
     */
    Distance() {
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
                dispatchEvent(new WindowEvent(Distance.this, WindowEvent.WINDOW_CLOSING));
                new Main();
            }
        });
    }
}
