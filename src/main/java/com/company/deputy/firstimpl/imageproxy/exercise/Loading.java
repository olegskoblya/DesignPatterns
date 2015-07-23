package com.company.deputy.firstimpl.imageproxy.exercise;

import javax.swing.*;
import java.awt.*;

/**
 * Created by oleg on 23.07.15.
 */
public class Loading implements Icon {
    MainImage mainImage;
    Thread retrievalThread;

    public Loading(MainImage mainImage) {
        this.mainImage = mainImage;
    }

    public Loading() {
    }

    public MainImage getMainImage() {
        return mainImage;
    }

    public void setMainImage(MainImage mainImage) {
        this.mainImage = mainImage;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int i, int i1) {
        graphics.drawString("Loading CD cover, please wait...", i+300, i1+190);
            retrievalThread = new Thread(()->{
                try {
                    mainImage.setImageIcon(new ImageIcon(mainImage.getImageURL(), "CD Cover"));
                    mainImage.setCurrent(mainImage.getLoaded());
                    component.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            retrievalThread.start();
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
