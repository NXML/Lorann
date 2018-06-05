package model.elements;

import model.Map;
/**
 * <h1>The Class Demon</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Demon extends Monster {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '1';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "monster_1.png";
	
	/**
	 * The movement vector.
	 */
	private int movementVector =1;
	
	/**
	 * Instantiate a new demon.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Demon(int x, int y, Map map) {
		super(x, y, imagePath, map);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	public void move() {
		if(canMoveTo(x+(1*movementVector), y)) {
			moveTo(x+(1*movementVector), y);
			
		}
		else if(canMoveTo(x-(1*movementVector), y)){
			movementVector *= -1;
			
		}	
		
	}

}
