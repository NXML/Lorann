package model.elements;

import java.util.Random;

import model.Map;
/**
 * <h1>The Class Masked.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Masked extends Monster{
	public static char charSprite = '3';
	public static String imagePath = "monster_3.png";
	private int movementVector =1;
	
	/*Constructor of a Masked which is a monster using super constructor
	 * @param int x
	 * @param int y
	 * @param Map map
	 */
	public Masked(int x, int y, Map map) {
		super(x, y, imagePath, map);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Function that define the move patern of this Monster
	 * random direction each step
	 */
public void Move() {
		
		if(canMoveTo(x+(1*movementVector), y)) {
			moveTo(x+(1*movementVector), y);
		}
		else if(canMoveTo(x-(1*movementVector), y)){
			movementVector *= -1;
		}
		
		
	}

}