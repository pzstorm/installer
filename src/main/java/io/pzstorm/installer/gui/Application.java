package io.pzstorm.installer.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Application extends JFrame {

    public static void main(String args[]) {

        Application instance = new Application();

        MainPanel d = new MainPanel();

        instance.setTitle("Storm Installer");
        instance.setLayout(new FlowLayout());
        instance.setSize(600, 500);
        instance.setPreferredSize(new Dimension(600, 500));
        instance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instance.setContentPane(d.$$$getRootComponent$$$());
        instance.setVisible(true);

        for (Component component: d.$$$getRootComponent$$$().getComponents()) {
            component.setFont(GUIFonts.LABEL_FONT);
        }

        System.out.println(instance.getBounds()+", "+instance.getLayout()+", "+ Arrays.toString(instance.getComponents()));

    }

}
