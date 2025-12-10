//Melin Ozturk
//12//9/2025
//This is the Paddle class for the BrickBreak game. 

package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	//your code here!

	//don't forget you need instance variables:
	private int x;
	private int y; 
	private int width;
	private int height;

	//constructor(s):
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	
	//methods:

	//precondition: g is a non-null value
	//postcondition: draws the paddle on the screen
	public void draw(Graphics g) {
      g.setColor(Color.WHITE);

	  g.fillRect(x, y, width, height);
	}
	//precondition:
	//postcondition: 
	public void move() {
		
	}
	//precondition:
	//postcondition: 
	public void getX(){

	}
	//precondition:
	//postcondition: 
	public void getY(){

	}
	//precondition:
	//postcondition: 
	public void getHeight(){

	}
	//precondition:
	//postcondition: 
	public void getWidth(){

	}
	//precondition:
	//postcondition: 
	public void getVelocity(){

	}
	
}
