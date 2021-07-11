package io.pzstorm.installer.gui;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class GUIFonts {

	/**
	 * Font family used as default Font for all GUI elements.
	 */
	private static final Font ZENDOTS_REGULAR = registerLocalFont("ZenDots-Regular.ttf");

	/**
	 * Font used by installer window description text.
	 */
	static final Font DESC_FONT = ZENDOTS_REGULAR.deriveFont(14f);

	/**
	 * Font used by installed window label text.
	 */
	static final Font LABEL_FONT = ZENDOTS_REGULAR.deriveFont(12f);

	/**
	 * Registers {@code Font} through {@code InputStream} from resources.
	 * If the font is already registered this method will still return the font instance.
	 *
	 * @param path path to {@code Font} resource to register.
	 *
	 * @return instance of registered {@code Font}.
	 *
	 * @throws RuntimeException if the file with the path corresponding to given name is not found in resources.
	 */
	public static Font registerLocalFont(String path) {

		try {
			InputStream fontStream = MainView.class.getClassLoader().getResourceAsStream(path);
			if (fontStream == null) {
				throw new IOException("Unable to find font resource '" + path + "' as stream");
			}
			Font localFont = Font.createFont(Font.TRUETYPE_FONT, fontStream);
			GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(localFont);
			return localFont;
		}
		catch (FontFormatException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Recursively apply fonts to a JComponent and all children.
	 * @param font The font to apply.
	 * @param component The parent component.
	 */
	public static void applyCustomFont(Font font, Container component) {
		component.setFont(font);
		for (Component child: component.getComponents()) {
			child.setFont(font);
			if (child instanceof Container) {
				applyCustomFont(font, ((Container)child));
			}
		}
	}
}
