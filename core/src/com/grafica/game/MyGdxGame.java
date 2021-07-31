package com.grafica.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int i, h;
	int ancho;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("gato.jpg");
		ancho = Gdx.graphics.getWidth();
		i=0;
		h=10;
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 0);
		batch.begin();
		batch.draw(img, i, 0);
		batch.end();


		if(i<0 || i+img.getWidth()>ancho)
			h=h*-1;
		i=i+h;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
