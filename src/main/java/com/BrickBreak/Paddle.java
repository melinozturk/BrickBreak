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
	private int speed;
	private int location;


	//constructor(s):
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = 5; 
		this.location = x + width /2;
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
		int centerX = x + height / 2;		
	 
	 if (centerX<location) {
		if ((centerX+speed)>location) {
			y+= Math.abs(location-(centerX+speed));
		}
		else y+=speed;
	 }
		
	}
	//precondition:
	//postcondition: 
	public int getX(){

	return x; 

	}
	//precondition:
	//postcondition: 
	public int getY(){
		return y;

	}
	//precondition:
	//postcondition: 
	public int getHeight(){
		return height; 

	}
	//precondition:
	//postcondition: 
	public int getWidth(){
		return width; 

	}
	//precondition:
	//postcondition: 
	public int getVelocity(){
		return speed; 

	}
	
}
