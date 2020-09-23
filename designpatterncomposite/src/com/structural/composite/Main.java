package com.structural.composite;

public class Main {

	public static void main(String[] args) {
		Shape rect = new Rectangle();
		Shape rect1 = new Rectangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(rect);
		drawing.add(rect1);
		drawing.add(cir);
		
		drawing.drawing("Red");
		
		drawing.clear();
		
		drawing.add(rect);
		drawing.add(rect1);
		drawing.drawing("Green");
	}

	

}
