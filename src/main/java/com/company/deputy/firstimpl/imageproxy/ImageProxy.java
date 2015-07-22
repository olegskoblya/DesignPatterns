package com.company.deputy.firstimpl.imageproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by oleg on 22.07.15.
 */
public class ImageProxy implements javax.swing.Icon {
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        this.imageURL = url;
    }


    @Override
    public void paintIcon(Component component, Graphics graphics, int i, int i1) {
        if (imageIcon != null) {
            imageIcon.paintIcon(component, graphics, i, i1);
        } else {
            graphics.drawString("Loading CD cover, please wait...", i+300, i1+190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(()->{
                    try {
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        component.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();
            }
        }

    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }



}
