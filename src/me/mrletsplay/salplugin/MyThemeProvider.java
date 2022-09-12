package me.mrletsplay.salplugin;

import java.util.Arrays;
import java.util.Collection;

import org.pf4j.Extension;

import me.mrletsplay.shittyauthlauncher.api.Theme;
import me.mrletsplay.shittyauthlauncher.api.ThemeProvider;

@Extension
public class MyThemeProvider implements ThemeProvider {

	public static final Theme MY_THEME = new Theme(
		"dark_green",
		"Dark Green",
		Arrays.asList(
			"/include/theme/dark.css" /* From ShittyAuthLauncher */,
			SALPlugin.class.getResource("/include/green.css").toExternalForm() /* Make sure the URL is an absolute URL to the resource */
		));

	@Override
	public Collection<Theme> getThemes() {
		return Arrays.asList(MY_THEME);
	}

}
