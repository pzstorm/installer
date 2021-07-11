package io.pzstorm.installer.gui;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public static Application INSTANCE;
    private CardLayout layout;

    public Application() {
        //basic metadata
        setTitle("Storm Installer");
        setSize(600, 500);
        setPreferredSize(new Dimension(600, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add the views
        layout = new CardLayout();
        setLayout(layout);
        add("MainPanel", new MainPanel().$$$getRootComponent$$$());
        add("DirPanel", new DirectoriesPanel().$$$getRootComponent$$$());

        //set custom fonts
        GUIFonts.applyCustomFont(GUIFonts.LABEL_FONT, getContentPane());

        //show
        switchTo("MainPanel");
        setVisible(true);
    }

    public void switchTo(String viewName) {
        layout.show(getContentPane(), viewName);
    }

    public static void main(String[] args) {
        INSTANCE = new Application();
    }

}
