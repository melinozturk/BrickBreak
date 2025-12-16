//Melin Ozturk
//12//9/2025
//This is the Ball class for the BrickBreak game. 

//anything that is not get or set need post pre 
package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	
	private int x;
	private int y;
    private int radius;
	private int xVelocity;
	private int yVelocity; 

	//constructor(s):
	public Ball(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xVelocity = -1;
		this.yVelocity = -2;
	}
	
	//methods:

//precondition: 
//postcondition: 

	public void draw(Graphics g) {
      g.setColor(Color.PINK);
	
	  g.fillOval(x, y, radius, radius);
	}

//precondition: None
//postcondition: moves the ball by changeX and changeY

    public void move() {
    x+= xVelocity;
    y+= yVelocity;
	}
	
//precondition: 
//postcondition: 
	public void setX(int x){
		this.x=x;

	}
//precondition: 
//postcondition: 
	public int getX(){
		return x;

	}
//precondition: 
//postcondition: 
	public void setY(int y){
		this.y=y;

	}
//precondition: 
//postcondition: 
	public int getY(){
		return y;

	}
//precondition: 
//postcondition: 
	public void reverseX(){
		this.xVelocity = -this.xVelocity;

	}
//precondition: 
//postcondition: 
public int getXpos(){
	return x;

}
//precondition: 
//postcondition: 
public int getYpos(){
	return y; 
}
//precondition: 
//postcondition: 
	public void reverseY(){
		this.yVelocity = -this.yVelocity;

	}
	//precondition: 
//postcondition: 
	public void setXVelocity(int xVelocity){
		this.xVelocity= xVelocity;
	}
	//precondition: 
//postcondition: 
	public void setYVelocity(int yVelocity){
		this.yVelocity= yVelocity;
	}
//precondition: 
//postcondition: 
	//public void setXvelocity(int xVelocity){
	//this.xVelocity= xVelocity;


	
//precondition: 
//postcondition: 
	public int getXvelocity(){
	return xVelocity; 

	}
//precondition: 
//postcondition: 
	public void setYvelocity(int yVelocity){
	this.yVelocity= yVelocity;


	}
//precondition: 
//postcondition: 
	public int getYvelocity(){
	return xVelocity; 

	}
//precondition: 
//postcondition: 
	public void setSize(int radius){
		this.radius= radius;
		
	}
//precondition: 
//postcondition: 
	public int getSize(){
		return radius;

	}
	
	
}
