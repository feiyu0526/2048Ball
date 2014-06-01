package com.sleepware.GameObjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.sleepware.GameWorld.GameWorld;
import com.sleepware.ZBHelpers.AssetLoader;

public class ScoreBoard {

	public static final int NUMBER_OF_FALLING_FRUIT = 5;
	
	private GameWorld gameWorld;
	private final int groundStart;
	private int grassLeftStart;

	//private FallingScore[] fallingFruit;
	//private StaticImage[] staticImage;

	private int fruitScore;

	private boolean highscore;


	
	public ScoreBoard(GameWorld gameWorld, 
			int grassLeftStart, 
			int grassRightStart, 
			int groundStart,
			int fruitDiameter) {
		
		this.gameWorld = gameWorld;
		this.groundStart = groundStart;
		this.grassLeftStart = grassLeftStart;		
		/*
		fallingFruit = new FallingScore[NUMBER_OF_FALLING_FRUIT];
		
		final int gap= fruitDiameter+10;
		
		for(int i=0; i<NUMBER_OF_FALLING_FRUIT; i++)
		{
			fallingFruit[i] = new FallingScore(fruitDiameter,fruitDiameter, (groundStart/2), (grassLeftStart+(i*gap)+40), 1);
		}
		
		staticImage = new StaticImage[NUMBER_OF_FALLING_FRUIT];
		
		for(int i=0; i<NUMBER_OF_FALLING_FRUIT; i++) {
			staticImage[i] = new StaticImage((grassLeftStart+(i*gap)+40)+(fruitDiameter/4), (groundStart/2)+(fruitDiameter/4), fruitDiameter/2, fruitDiameter/2);
		}
*/
		
		onRestart(0, false);
	}
	
	public void update(float delta) {
		/*
		for(int i=0; i<fruitScore; i++) {
			fallingFruit[i].update(delta);
		}
		for(int i=0; i<fruitScore; i++) {
			if(fallingFruit[i].checkForOverflow()) {
				if(i<NUMBER_OF_FALLING_FRUIT-1)
				fallingFruit[i+1].onRestart(gameWorld.getBird().getFruitValue());
			}
		}
	*/
	}

	
	public void draw(SpriteBatch batcher, TextureRegion star) {

		final int x = grassLeftStart + 40;
		final int xScore = x + 120;
		
		AssetLoader.drawButtonText(batcher,"GAMEOVER", x, (groundStart/2) - 160 );

		AssetLoader.drawButtonText(batcher,"SCORE", x, (groundStart/2) - 100 );
		AssetLoader.drawButtonText(batcher,""+gameWorld.getScore(), xScore, (groundStart/2) - 100 );

		final int highscoreY = (groundStart/2) - 75;
		if(highscore) {
			AssetLoader.drawButtonText(batcher,"NEW HIGHSCORE!", x, highscoreY );
			
		} else {
			AssetLoader.drawButtonText(batcher,"HIGHSCORE", x, highscoreY );
			AssetLoader.drawButtonText(batcher,""+AssetLoader.getHighScore(), xScore, highscoreY );
		}

		AssetLoader.drawButtonText(batcher,"RATING", x, (groundStart/2) - 25 );

		AssetLoader.drawButtonText(batcher,"RETRY ?", x, (groundStart/2) + 100 );
/*
		for(int i=0; i<NUMBER_OF_FALLING_FRUIT; i++)
		{
			staticImage[i].draw(batcher,star);
		}
		for(int i=0; i<NUMBER_OF_FALLING_FRUIT; i++)
		{
			fallingFruit[i].draw(batcher,fruit);
		}	
	*/	
	}
	
	
	public void onRestart(int fruitScore, boolean highscore) {
		
		this.highscore=highscore;
		/*
		for(int i=0; i<NUMBER_OF_FALLING_FRUIT; i++)
		{
			fallingFruit[i].reset();
		}
		
		this.fruitScore=fruitScore;
		
		if(fruitScore>0) {
			fallingFruit[0].onRestart(gameWorld.getBird().getFruitValue());
		}
		*/
	}
}
