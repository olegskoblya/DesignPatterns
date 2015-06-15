package com.company.exercises.observer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by oskoblya on 09.06.2015.
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event-> {
            System.out.println("Don't do it, you might regret it!");
        });
        button.addActionListener(event-> {
            System.out.println("Come on, do it!");
        });
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setVisible(true);
    }
}
