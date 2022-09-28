package me.mrletsplay.salplugin;

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
	public String getGameName() {
		return "Cringe Minecraft";
	}

}
