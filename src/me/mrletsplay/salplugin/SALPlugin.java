package me.mrletsplay.salplugin;

import java.io.IOException;
import java.net.URL;

import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.web.WebView;
import me.mrletsplay.shittyauthlauncher.ShittyAuthLauncher;

public class SALPlugin extends Plugin {

	public SALPlugin(PluginWrapper wrapper) {
		super(wrapper);
	}

	@Override
	public void start() {
		log.info("The plugin was loaded!");

		URL url2 = SALPlugin.class.getResource("/include/test.fxml");
		FXMLLoader l2 = new FXMLLoader(url2);
		l2.setClassLoader(SALPlugin.class.getClassLoader());
		Parent stuff = null;
		try {
			stuff = l2.load(url2.openStream());

			WebView wv = (WebView) stuff.lookup("#myWebView");
			wv.setContextMenuEnabled(false);
			wv.getEngine().load("https://cringe-studios.com/dev/shittyauth.html");
			ShittyAuthLauncher.addTab("Test Tab", wv);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
