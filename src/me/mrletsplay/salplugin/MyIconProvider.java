package me.mrletsplay.salplugin;

import java.io.InputStream;

import org.pf4j.Extension;

import me.mrletsplay.shittyauthlauncher.api.IconProvider;

@Extension
public class MyIconProvider implements IconProvider {

	@Override
	public InputStream loadLauncherIcon() {
		return SALPlugin.class.getResourceAsStream("/include/cringe_studios.png");
	}

	@Override
	public InputStream loadDefaultInstallationIcon() {
		return loadLauncherIcon();
	}

	@Override
	public InputStream loadDefaultAccountIcon() {
		return loadLauncherIcon();
	}

}
