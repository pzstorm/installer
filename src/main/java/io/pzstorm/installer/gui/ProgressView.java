package io.pzstorm.installer.gui;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;

public class ProgressView {
    private JButton cancelButton;
    private JPanel root;
    private JProgressBar progressBar;
    private JTextArea textArea1;

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
        root.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow", "center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow"));
        root.setBackground(new Color(-14604221));
        root.setForeground(new Color(-14604221));
        progressBar = new JProgressBar();
        progressBar.setBackground(new Color(-1));
        progressBar.setForeground(new Color(-14043084));
        progressBar.setIndeterminate(true);
        CellConstraints cc = new CellConstraints();
        root.add(progressBar, cc.xywh(1, 1, 1, 3));
        textArea1 = new JTextArea();
        root.add(textArea1, cc.xy(3, 1));
        cancelButton = new JButton();
        cancelButton.setText("Cancel");
        root.add(cancelButton, cc.xy(1, 5));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return root;
    }

}
