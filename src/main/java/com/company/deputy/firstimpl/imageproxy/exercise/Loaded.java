package com.company.deputy.firstimpl.imageproxy.exercise;

import javax.swing.*;
import java.awt.*;

/**
 * Created by oleg on 23.07.15.
 */
public class Loaded implements Icon {
    MainImage mainImage;

    public Loaded(MainImage mainImage) {
        this.mainImage = mainImage;
    }

    public Loaded() {
    }

    public MainImage getMainImage() {
        return mainImage;
    }

    public void setMainImage(MainImage mainImage) {
        this.mainImage = mainImage;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int i, int i1) {
        mainImage.getImageIcon().paintIcon(component, graphics, i, i1);
    }

    @Override
    public int getIconWidth() {
        return mainImage.getImageIcon().getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return mainImage.getImageIcon().getIconHeight();
    }
}
