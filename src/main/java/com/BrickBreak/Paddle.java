//Melin Ozturk
//12//9/2025
//This is the Paddle class for the BrickBreak game. 

package com.BrickBreak;

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
		this.speed = 1 ; 
		this.location = x + width /2;
	}

	
	//methods:

	//precondition: g is a non-null value
	//postcondition: draws the paddle on the screen
	public void draw(Graphics g) {
      g.setColor(Color.WHITE);

	  g.fillRect(x, y, width, height);
	}
	//precondition: none
	//postcondition: moves the paddle toward the location variable by speed amount 
	public void move() {
	//	System.out.println("attempted move");
		
		x += speed;


		if (x < 0 || x > 700 - width) {
			System.out.println("hit left wall");
			speed = -speed;
		}
	}
		
	public void setLocation(int loc){
		this.location=loc;

	}
	
	public int getLocation(){
		return location;

	}
	
	public int getVelocity(){
		return speed;
	}
	//precondition: input is a numeric value
	//postcondition: adds input to speed of paddle
	public void addVelocity(int input){
		this.speed+=input;
		
	}

	public int setVelocity(int speed){
		return this.speed=speed;
	}
	
	public void setX(int x){
		this.x=x;
	}

	public int getX(){

	return x; 

	}

	public void setY(int y){
		this.y=y;
	}
	
	public int getY(){
		return y;

	}
	 
	public int getHeight(){
		return height; 

	}

	public int getWidth(){
		return width; 

	}
	//precondition: input is a numeric value
	//postcondition: returns speed of paddle
	public int addVelocity(){
		return speed; 

	
	
}
}