package com.sleepware.Ball2048.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sleepware.Ball2048.Ball2048;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "2048 Ball";
		//config.useGL20 = false;
		config.width = 272 *2;
		config.height = 408 *2;
		new LwjglApplication(new Ball2048(), config);
	}
}
