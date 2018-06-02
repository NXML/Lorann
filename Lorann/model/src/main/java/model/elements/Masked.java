package model.elements;

import java.util.Random;

import model.Map;
/**
 * <h1>The Class Masked.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Masked extends Monster {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '3';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "monster_3.png";
	
	/**
	 * The movement vector.
	 */
	private int movementVector =1;
	
	/**
	 * Instantiate a new masked.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Masked(int x, int y, Map map) {
		super(x, y, imagePath, map);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	@Override
	public void move() {
		if(canMoveTo(x+(1*movementVector), y)) {
			moveTo(x+(1*movementVector), y);
			
		}
		else if(canMoveTo(x-(1*movementVector), y)){
			movementVector *= -1;
			
		}
		
	}

}