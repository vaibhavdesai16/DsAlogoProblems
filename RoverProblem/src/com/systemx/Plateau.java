package com.systemx;

public class Plateau {
	private int maxX;
	private int maxY;
	private int minX;
	private int minY;
	private static Plateau single_instance = null;


	public static Plateau getInstance() {
		if (single_instance == null)
			single_instance = new Plateau();
		return single_instance;
	}

	public int getMaxX() {
		return maxX;
	}


	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}


	public int getMaxY() {
		return maxY;
	}


	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}


	public int getMinX() {
		return minX;
	}


	public void setMinX(int minX) {
		this.minX = minX;
	}


	public int getMinY() {
		return minY;
	}


	public void setMinY(int minY) {
		this.minY = minY;
	}

	public static Plateau getSingle_instance() {
		return single_instance;
	}



}
