package com.company.deputy.firstimpl.imageproxy.exercise;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by oleg on 23.07.15.
 */
public class MainImage implements Icon {
    Icon loading;
    Icon loaded;
    Icon current;
    ImageIcon imageIcon;
    URL imageURL;


    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public URL getImageURL() {
        return imageURL;
    }

    public void setImageURL(URL imageURL) {
        this.imageURL = imageURL;
    }

    public MainImage(Icon loading, Icon loaded) {
        this.loading = loading;
        this.loaded = loaded;
        this.current = loading;
    }

    public Icon getLoading() {
        return loading;
    }

    public void setLoading(Icon loading) {
        this.loading = loading;
    }

    public Icon getLoaded() {
        return loaded;
    }

    public void setLoaded(Icon loaded) {
        this.loaded = loaded;
    }

    public Icon getCurrent() {
        return current;
    }

    public void setCurrent(Icon current) {
        this.current = current;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int i, int i1) {
        current.paintIcon(component, graphics, i, i1);
    }

    @Override
    public int getIconWidth() {
        return current.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return current.getIconHeight();
    }
}
