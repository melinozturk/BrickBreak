//Melin Ozturk
//12//9/2025
//This is the Ball class for the BrickBreak game. 

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
    x+= changeX;
    y+= changeY;
	}
//precondition: 
//postcondition: 
	public void setXpos(){

	}
//precondition: 
//postcondition: 
	public void getXpos(){

	}
//precondition: 
//postcondition: 
	public void setYPos(){

	}
//precondition: 
//postcondition: 
	public void getYpos(){

	}
//precondition: 
//postcondition: 
	public void reverseX(){

	}
//precondition: 
//postcondition: 
	public void reverseY(){

	}
//precondition: 
//postcondition: 
	public void setXvelocity(){

	}
//precondition: 
//postcondition: 
	public void getXvelocity(){

	}
//precondition: 
//postcondition: 
	public void setYvelocity(){

	}
//precondition: 
//postcondition: 
	public void getYvelocity(){

	}
//precondition: 
//postcondition: 
	public void setSize(){
		
	}
//precondition: 
//postcondition: 
	public void getSize(){

	}
	
	
}
