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
public class Main extends JFrame {

    private JPanel panel;
    private JButton speedButton;
    private JButton aoBButton;
    private JButton distanceButton;
    private JButton closeButton;
    private JLabel welcome;
    private JLabel what_to_do;
    private JButton visualLengthButton;

    /**
     * Constructor
     */
    Main() {
        setContentPane(panel);
        setTitle("TDC calculator");
        setSize(530, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
                dispatchEvent(new WindowEvent(Main.this, WindowEvent.WINDOW_CLOSING));
            }
        });
        speedButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                hideMain();
                new Speed();
            }
        });
        distanceButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                hideMain();
                new Distance();
            }
        });
        aoBButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                hideMain();
                new AoB();
            }
        });
        visualLengthButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                hideMain();
                new Length();
            }
        });
    }

    /**
     * Main function
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    /**
     * Function that hides main menu
     */
    void hideMain(){
        setVisible(false);
    }
}
