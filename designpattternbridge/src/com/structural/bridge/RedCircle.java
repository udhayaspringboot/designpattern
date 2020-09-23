package com.structural.bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(float radius, int x, int y) {
		
		System.out.println("Red Circle"+" radius"+radius+"x "+x+"y "+y);
		

	}

}
