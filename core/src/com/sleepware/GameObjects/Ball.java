package com.sleepware.GameObjects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.sleepware.GameWorld.GameWorld;

public class Ball {

	private Circle circle;
	private int value;
	private Color colour;
	private boolean alive;

	public Ball() {
		circle = new Circle();
		alive = false;
	}
	
	public void live(float x, float y, int radius, int value, Color colour) {
		circle.x = x;
		circle.y = y;
		circle.radius = radius;
		
		this.value = value;
		this.colour = colour;
		alive=true;
	}
	
	public void kill() {
		alive=false;
	}

	
    public void update(float delta) {
    	//dunno yet
    }
    
	public void draw(ShapeRenderer shapeRenderer) {
		
		if (alive) {
			shapeRenderer.setColor(colour);
			shapeRenderer.circle(circle.x, circle.y, circle.radius);
		}
	}


}
