package model.elements;

import model.Map;
/**
 * <h1>The Class Purse.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Purse extends Item {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '$';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "purse.png";
	
	/**
	 * The value.
	 */
	private int value = 100;
	
	/**
	 * Get the value.
	 * 
	 * @return the value
	 */
	public int getValue() {
		return value;
		
	}

	/**
	 * Instantiate a new purse.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Purse(int x, int y, Map map) {
		super(x, y, imagePath, map);
		
	}
	
}
