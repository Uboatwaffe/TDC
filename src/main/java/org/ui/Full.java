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
public class Full extends JFrame {

    public String speed;
    public String distance;
    public String aob;
    private JPanel panel;
    private JLabel height;
    private JTextField height_meters;
    private JLabel zoom;
    private JSlider zoom_slider;
    private JLabel milliradians;
    private JTextField height_milliradians;
    private JLabel length;
    private JTextField length_field;
    private JLabel time;
    private JTextField time_field;
    private JTextField length_degrees_field;
    private JLabel length_degrees;
    private JCheckBox goingAwayCheckBox;
    private JButton calculateButton;
    private JButton goBackButton;
    private String visual_length;

    /**
     * Constructor
     */
    Full() {
        setContentPane(panel);
        setTitle("TDC calculator");
        setSize(530, 500);
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
                dispatchEvent(new WindowEvent(Full.this, WindowEvent.WINDOW_CLOSING));
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
                distance = Calculations.distance(height_meters.getText(), height_milliradians.getText(), zoom_slider.getValue());
                speed = Calculations.Speed(length_field.getText(), time_field.getText());
                visual_length = Calculations.Length(String.valueOf(distance), length_degrees_field.getText(), zoom_slider.getValue());
                aob = Calculations.AoB(visual_length, length_field.getText(), goingAwayCheckBox.isSelected());

                dispatchEvent(new WindowEvent(Full.this, WindowEvent.WINDOW_CLOSING));

                new Full_answer(distance, speed, aob);
            }
        });
    }
}
