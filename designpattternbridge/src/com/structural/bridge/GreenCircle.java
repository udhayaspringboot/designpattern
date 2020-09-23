package com.structural.bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(float radius, int x, int y) {
		System.out.println("Green Circle"+" radius"+radius+"x "+x+"y "+y);

	}

}
