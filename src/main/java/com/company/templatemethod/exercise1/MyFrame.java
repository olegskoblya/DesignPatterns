package com.company.templatemethod.exercise1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by oleg on 08.07.15.
 */
public class MyFrame extends JFrame {
    public MyFrame(String s) throws HeadlessException {
        super(s);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paintComponents(Graphics graphics) {
        super.paintComponents(graphics);
        String msg = "I rule!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
