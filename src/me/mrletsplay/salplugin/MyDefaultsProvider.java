package me.mrletsplay.salplugin;

import org.pf4j.Extension;

import me.mrletsplay.shittyauthlauncher.api.DefaultsProvider;
import me.mrletsplay.shittyauthlauncher.api.Theme;
import me.mrletsplay.shittyauthlauncher.api.impl.DefaultLocaleProvider;
import me.mrletsplay.shittyauthlauncher.locale.Locale;
import me.mrletsplay.shittyauthpatcher.mirrors.DownloadsMirror;
import me.mrletsplay.shittyauthpatcher.util.ServerConfiguration;

@Extension
public class MyDefaultsProvider implements DefaultsProvider {

	@Override
	public Theme getDefaultTheme() {
		return MyThemeProvider.MY_THEME;
	}

	@Override
	public DownloadsMirror getDefaultMirror() {
		return MyMirrorProvider.TEST_MIRROR;
	}

	@Override
	public ServerConfiguration getDefaultServerConfiguration() {
		return new ServerConfiguration(
			"https://mc.graphite-official.com",
			"https://mc.graphite-official.com",
			"https://mc.graphite-official.com",
			"https://mc.graphite-official.com",
			"https://mc.graphite-official.com");
	}

	@Override
	public boolean allowCustomServerConfigurations() {
		return true;
	}

	@Override
	public Locale getDefaultLocale() {
		return DefaultLocaleProvider.INSTANCE.getLocales().get(0);
	}

}
