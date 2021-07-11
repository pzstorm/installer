package io.pzstorm.installer.gui;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;

public class DirectoriesPanel {
    private JPanel dirPanel;
    private JTextField gameDirField;
    private JLabel gameDirFieldLabel;
    private JTextField installDirField;
    private JLabel installDirFieldLabel;
    private JButton exitButton;
    private JButton nextButton;
    private JPanel root;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        root = new JPanel();
        root.setLayout(new FormLayout("fill:d:noGrow", "center:d:noGrow"));
        dirPanel = new JPanel();
        dirPanel.setLayout(new FormLayout("fill:50px:noGrow,fill:d:grow,fill:d:grow,fill:max(d;4px):noGrow,fill:50px:noGrow", "top:30dlu:grow,center:max(d;4px):noGrow,center:30dlu:grow,center:max(d;4px):noGrow,center:40dlu:grow"));
        dirPanel.setAlignmentX(0.5f);
        dirPanel.setBackground(new Color(-14604221));
        dirPanel.setDoubleBuffered(false);
        dirPanel.setEnabled(true);
        dirPanel.setForeground(new Color(-16777216));
        dirPanel.setMinimumSize(new Dimension(1, 1));
        dirPanel.setPreferredSize(new Dimension(600, 300));
        CellConstraints cc = new CellConstraints();
        root.add(dirPanel, cc.xy(1, 1, CellConstraints.DEFAULT, CellConstraints.FILL));
        gameDirField = new JTextField();
        gameDirField.setName("");
        gameDirField.setPreferredSize(new Dimension(100, 30));
        gameDirField.setText("");
        gameDirField.setToolTipText("");
        dirPanel.add(gameDirField, cc.xyw(2, 2, 3, CellConstraints.FILL, CellConstraints.CENTER));
        gameDirFieldLabel = new JLabel();
        gameDirFieldLabel.setBackground(new Color(-7978430));
        gameDirFieldLabel.setHorizontalAlignment(0);
        gameDirFieldLabel.setHorizontalTextPosition(0);
        gameDirFieldLabel.setMinimumSize(new Dimension(0, 20));
        gameDirFieldLabel.setOpaque(true);
        gameDirFieldLabel.setPreferredSize(new Dimension(0, 20));
        gameDirFieldLabel.setRequestFocusEnabled(false);
        gameDirFieldLabel.setText("");
        dirPanel.add(gameDirFieldLabel, cc.xyw(2, 1, 3, CellConstraints.FILL, CellConstraints.BOTTOM));
        installDirField = new JTextField();
        installDirField.setPreferredSize(new Dimension(100, 30));
        dirPanel.add(installDirField, cc.xyw(2, 4, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        installDirFieldLabel = new JLabel();
        installDirFieldLabel.setBackground(new Color(-7978430));
        installDirFieldLabel.setHorizontalAlignment(0);
        installDirFieldLabel.setHorizontalTextPosition(0);
        installDirFieldLabel.setMinimumSize(new Dimension(0, 20));
        installDirFieldLabel.setOpaque(true);
        installDirFieldLabel.setPreferredSize(new Dimension(0, 20));
        installDirFieldLabel.setText("");
        dirPanel.add(installDirFieldLabel, cc.xyw(2, 3, 3, CellConstraints.DEFAULT, CellConstraints.BOTTOM));
        exitButton = new JButton();
        exitButton.setMinimumSize(new Dimension(100, 30));
        exitButton.setPreferredSize(new Dimension(100, 30));
        exitButton.setText("");
        dirPanel.add(exitButton, new CellConstraints(2, 5, 1, 1, CellConstraints.RIGHT, CellConstraints.DEFAULT, new Insets(10, 0, 0, 10)));
        nextButton = new JButton();
        nextButton.setMinimumSize(new Dimension(100, 30));
        nextButton.setPreferredSize(new Dimension(100, 30));
        nextButton.setText("Next");
        dirPanel.add(nextButton, new CellConstraints(3, 5, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT, new Insets(10, 10, 0, 0)));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return root;
    }

}
