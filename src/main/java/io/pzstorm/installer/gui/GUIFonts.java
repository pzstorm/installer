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
	static final Font DESC_FONT = ZENDOTS_REGULAR.deriveFont(12f);

	/**
	 * Font used by installed window label text.
	 */
	static final Font LABEL_FONT = ZENDOTS_REGULAR.deriveFont(10f);

	/**
	 * Registers {@code Font} through {@code InputStream} from resources.
	 *
	 * @param path path to {@code Font} resource to register.
	 *
	 * @return instance of registered {@code Font}.
	 *
	 * @throws RuntimeException if the fontStream data does not contain the required font tables for the
	 * 		specified format or if the file with the path corresponding to given name is not found in resources.
	 */
	public static Font registerLocalFont(String path) {

		try {
			InputStream fontStream = InstallerWindowGUI.class.getClassLoader().getResourceAsStream(path);
			if (fontStream == null) {
				throw new IOException("Unable to find font resource '" + path + "' as stream");
			}
			Font localFont = Font.createFont(Font.TRUETYPE_FONT, fontStream);
			boolean registered = GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(localFont);
			if (!registered) {
				throw new IllegalStateException("Unable to register font '" + path + '\'');
			}
			else return localFont;
		}
		catch (FontFormatException | IOException e) {
			throw new RuntimeException(e);
		}
	}
}
