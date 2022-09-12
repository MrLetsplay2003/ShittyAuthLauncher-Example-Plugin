package me.mrletsplay.salplugin;

import java.io.InputStream;

import org.pf4j.Extension;

import me.mrletsplay.shittyauthlauncher.api.BrandingProvider;

@Extension
public class MyBrandingProvider implements BrandingProvider {

	@Override
	public String getLauncherBrand() {
		return "CringeLauncher";
	}

	@Override
	public String getLauncherVersion() {
		return "69.420";
	}

	@Override
	public InputStream loadIcon() {
		return SALPlugin.class.getResourceAsStream("/include/cringe_studios.png");
	}

}
