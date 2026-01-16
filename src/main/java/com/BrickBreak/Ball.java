//Melin Ozturk
//12/9/2025
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

//precondition: g is a non-null value
//postcondition: draw the ball on the screen 

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
//precondition: X is a numeric value
//postcondition: reverses the x velocity of the ball
	public void reverseX(){
		this.xVelocity = -this.xVelocity;

	}

public int getXpos(){
	return x;

}

public int getYpos(){
	return y; 
}
//precondition: Y is a numeric value
//postcondition: reverses the y velocity of the ball
	public void reverseY(){
		this.yVelocity = -this.yVelocity;

	}

	public void setXVelocity(int xVelocity){
		this.xVelocity= xVelocity;
	}

	public void setYVelocity(int yVelocity){
		this.yVelocity= yVelocity;
	}

	public int getXvelocity(){
	return xVelocity; 

	}

	public void setYvelocity(int yVelocity){
	this.yVelocity= yVelocity;


	}

	public int getYvelocity(){
	return xVelocity; 

	}
 
	public void setSize(int radius){
		this.radius= radius;
		
	}

	public int getSize(){
		return radius;

	}
	
	
}
