package com.omega.rain.level;

import com.omega.rain.graphics.Screen;

public class Level {
	
	protected int width, height;
	protected int[] tiles;

	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tiles = new int[width * height];
		generateLevel();
	}

	public Level(String path) {
		loadlevel(path);
	}

	protected void generateLevel() {	
	}

	private void loadlevel(String path) {
	}

	public void update() {
	}

	private void time() {
	}
	
	public void render(int xScroll, int yScroll, Screen screen) {
	}
}
