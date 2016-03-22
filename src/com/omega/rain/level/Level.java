package com.omega.rain.level;

import com.omega.rain.graphics.Screen;

public class Level {

	//Got to episode 25
	//https://youtu.be/ufcmUZqHx4U?list=PLlrATfBNZ98eOOCk2fOFg7Qg5yoQfFAdf
	
	private int width, height;
	private int[] tiles;

	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tiles = new int[width * height];
		generateLevel();
	}

	public Level(String path) {
		loadlevel(path);
	}

	private void generateLevel() {
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
