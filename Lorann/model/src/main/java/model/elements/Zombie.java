package model.elements;

import model.Map;
/**
 * <h1>The Class Zombie.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Zombie extends Monster {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '2';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "monster_2.png";
	
	/**
	 * The movement vector.
	 */
	public int movementVector = 1;
	
	/**
	 * Instantiate a new zombie.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Zombie(int x, int y,  Map map) {
		super(x, y, imagePath, map);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	public void move() {
		if(canMoveTo(x, y+(1*movementVector))) {
			moveTo(x, y+(1*movementVector));
			
		}
		else if(canMoveTo(x, y-(1*movementVector))){
			movementVector *= -1;
			
		}
		
	}

}