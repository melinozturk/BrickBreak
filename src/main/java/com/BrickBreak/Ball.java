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

	//constructor(s):
	
	//methods:
	public void draw(Graphics g) {
      g.setColor(Color.PINK);
	 
	  g.fillOval(x, y, radius, radius);
	}
	public void move() {
	  
	}

}
