package model.elements;

import java.util.Random;

import model.Map;

/**
 * <h1>The Class Ogre.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Ogre extends Monster {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '4';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "monster_4.png";
	
	/**
	 * The movement vector.
	 */
	public int movementVector = 1;
	
	/**
	 * Instantiate a new ogre.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Ogre(int x, int y,  Map map) {
		super(x, y, imagePath, map);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	@Override
	public void move() {
		if(canMoveTo(x+(1*movementVector), y+(1*movementVector))) {
			moveTo(x+(1*movementVector), y+(1*movementVector));
			
		}
		else if(canMoveTo(x-(1*movementVector), y-(1*movementVector))){
			movementVector *= -1;
			
		}
		
	}

}