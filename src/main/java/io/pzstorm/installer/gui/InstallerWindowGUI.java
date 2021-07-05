package io.pzstorm.installer.gui;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class InstallerWindowGUI extends JFrame {

	public JPanel mainPanel;
	private JPanel logoPanel;
	private JLabel logoIcon;
	private JPanel bottomPanel;
	private JLabel installerDesc;
	private JTextField gameDirField;
	private JLabel gameDirFieldLabel;
	private JTextField installDirField;
	private JLabel installDirFieldLabel;
	private JButton okButton;
	private JButton cancelButton;

	public InstallerWindowGUI() {

		$$$setupUI$$$();
		setContentPane(mainPanel);
		setTitle("Storm Installer");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		installerDesc.setText("<html><body>" +
				"<p>Welcome to Zomboid Storm installer</p>" +
				"<p style=\"text-align: center;padding-top: 5px\">version 41.50-0.2.1</p>" +
				"</body></html"
		);
		installerDesc.setFont(GUIFonts.DESC_FONT);

		gameDirFieldLabel.setText("Enter path to Project Zomboid installation directory");
		gameDirFieldLabel.setFont(GUIFonts.LABEL_FONT);
		gameDirFieldLabel.setForeground(Color.WHITE);

		String gameDirFieldText = "~/SteamLibrary/steamapps/common/ProjectZomboid/projectzomboid/";
		gameDirField.setText(gameDirFieldText);
		gameDirField.setForeground(Color.GRAY);


			}
		installDirFieldLabel.setText("Enter Storm installation directory");
		installDirFieldLabel.setFont(GUIFonts.LABEL_FONT);
		installDirFieldLabel.setForeground(Color.WHITE);

		String installDirFieldText = "~/SteamLibrary/steamapps/common/ProjectZomboid/Storm/";
		installDirField.setText(installDirFieldText);
		installDirField.setForeground(Color.GRAY);

		okButton.setText("OK");
		cancelButton.setText("Cancel");
	}

	public static void main(String[] args) {
		InstallerWindowGUI window = new InstallerWindowGUI();
	}

	/**
	 * Method generated by IntelliJ IDEA GUI Designer
	 * >>> IMPORTANT!! <<<
	 * DO NOT edit this method OR call it in your code!
	 *
	 * @noinspection ALL
	 */
	private void $$$setupUI$$$() {

		mainPanel = new JPanel();
		mainPanel.setLayout(new FormLayout("fill:d:grow", "center:150px:noGrow,fill:d:grow"));
		mainPanel.setAlignmentX(0.5f);
		mainPanel.setAlignmentY(0.5f);
		mainPanel.setBackground(new Color(-16777216));
		mainPanel.setForeground(new Color(-16777216));
		mainPanel.setMinimumSize(new Dimension(600, 200));
		mainPanel.setOpaque(false);
		mainPanel.setPreferredSize(new Dimension(600, 500));
		logoPanel = new JPanel();
		logoPanel.setLayout(new FormLayout("center:d:grow", "center:d:grow"));
		logoPanel.setAlignmentX(0.0f);
		logoPanel.setAlignmentY(0.0f);
		logoPanel.setAutoscrolls(false);
		logoPanel.setBackground(new Color(-14604221));
		logoPanel.setMinimumSize(new Dimension(1, 1));
		logoPanel.setPreferredSize(new Dimension(100, 150));
		CellConstraints cc = new CellConstraints();
		mainPanel.add(logoPanel, cc.xy(1, 1, CellConstraints.FILL, CellConstraints.TOP));
		logoIcon = new JLabel();
		logoIcon.setAlignmentX(0.5f);
		logoIcon.setAlignmentY(0.5f);
		logoIcon.setHorizontalAlignment(0);
		logoIcon.setHorizontalTextPosition(0);
		logoIcon.setIcon(new ImageIcon(getClass().getResource("/storm-logo.png")));
		logoIcon.setText("");
		logoPanel.add(logoIcon, cc.xy(1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FormLayout("fill:d:grow", "center:d:grow"));
		bottomPanel.setAlignmentX(0.5f);
		bottomPanel.setBackground(new Color(-14604221));
		bottomPanel.setDoubleBuffered(false);
		bottomPanel.setEnabled(true);
		bottomPanel.setForeground(new Color(-16777216));
		bottomPanel.setMinimumSize(new Dimension(1, 1));
		bottomPanel.setPreferredSize(new Dimension(600, 300));
		mainPanel.add(bottomPanel, cc.xy(1, 2, CellConstraints.DEFAULT, CellConstraints.FILL));
		installerDesc = new JLabel();
		installerDesc.setBackground(new Color(-1));
		Font installerDescFont = this.$$$getFont$$$(null, -1, -1, installerDesc.getFont());
		if (installerDescFont != null)
			installerDesc.setFont(installerDescFont);
		installerDesc.setForeground(new Color(-1));
		installerDesc.setText("");
		bottomPanel.add(installerDesc, cc.xy(1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));
	}

	/** @noinspection ALL */
	private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {

		if (currentFont == null)
			return null;
		String resultName;
		if (fontName == null)
		{
			resultName = currentFont.getName();
		}
		else
		{
			Font testFont = new Font(fontName, Font.PLAIN, 10);
			if (testFont.canDisplay('a') && testFont.canDisplay('1'))
			{
				resultName = fontName;
			}
			else
			{
				resultName = currentFont.getName();
			}
		}
		Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
		boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
		Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) :
				new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
		return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
	}

	/** @noinspection ALL */
	public JComponent $$$getRootComponent$$$() {

		return mainPanel;
	}
}
