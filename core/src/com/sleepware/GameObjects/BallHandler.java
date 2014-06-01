package com.sleepware.GameObjects;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.sleepware.GameWorld.GameWorld;

public class BallHandler {

	private final int MAX_NUMBER_OF_BALLS = 15;
	
	private Ball balls[];
	
	public BallHandler(GameWorld myWorld, int gameWidth, int gameHeight) {
		
		balls = new Ball[MAX_NUMBER_OF_BALLS];
		
		for(int i=0; i<MAX_NUMBER_OF_BALLS; i++) {
			balls[i] = new Ball();
		}
	}

    public void update(float delta) {
		for(int i=0; i<MAX_NUMBER_OF_BALLS; i++) {
			balls[i].update(delta);
		}
    }
    
	public void draw(ShapeRenderer shapeRenderer) {
		for(int i=0; i<MAX_NUMBER_OF_BALLS; i++) {
			balls[i].draw(shapeRenderer);
		}
	}
}
