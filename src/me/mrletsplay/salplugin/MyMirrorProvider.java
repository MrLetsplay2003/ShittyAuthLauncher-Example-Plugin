package me.mrletsplay.salplugin;

import java.util.Arrays;
import java.util.List;

import org.pf4j.Extension;

import me.mrletsplay.shittyauthlauncher.api.MirrorProvider;
import me.mrletsplay.shittyauthpatcher.mirrors.DownloadsMirror;

@Extension
public class MyMirrorProvider implements MirrorProvider {

	public static final DownloadsMirror TEST_MIRROR = new DownloadsMirror("Test Mirror", DownloadsMirror.MOJANG.getVersionManifestURL(), DownloadsMirror.MOJANG.getAssetsURL());

	@Override
	public List<DownloadsMirror> getMirrors() {
		return Arrays.asList(TEST_MIRROR);
	}

}
