package io.pzstorm.installer;

import io.pzstorm.installer.gui.ChooseDirectoriesView;
import io.pzstorm.installer.gui.GUIFonts;
import io.pzstorm.installer.gui.GUIView;
import io.pzstorm.installer.gui.StartView;

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
        add(GUIView.START, new StartView().$$$getRootComponent$$$());
        add(GUIView.CHOOSE_FOLDERS, new ChooseDirectoriesView().$$$getRootComponent$$$());

        //set custom fonts
        GUIFonts.applyCustomFont(GUIFonts.LABEL_FONT, getContentPane());

        //show
        switchTo(GUIView.START);
        setVisible(true);
    }

    public void add(GUIView view, JComponent component) {
        this.add(view.name(), component);
    }

    public void switchTo(GUIView view) {
        layout.show(getContentPane(), view.name());
    }

    public static void main(String[] args) {
        INSTANCE = new Application();
    }

}
