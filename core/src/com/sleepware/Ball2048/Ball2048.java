package com.sleepware.Ball2048;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sleepware.Screens.SplashScreen;
import com.sleepware.ZBHelpers.AssetLoader;


public class Ball2048 extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
		//setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}