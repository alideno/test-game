package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class TestGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	


	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
