package com.ait.day7.Abstraction;

public class Rectangle extends Shape {
	
	private float width;
	private float height;
	
	public Rectangle() {
		this.height=2.0f;
		this.width=5.0f;
	}
	void calArea() {
		area=width*height;
	}

}
