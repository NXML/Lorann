package model.elements;

import model.Map;
/**
 * <h1>The Class Monster.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Monster extends AI {

	/**
	 * Instantiate a new monster.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param image
	 * 			the image
	 * @param map
	 * 			the map
	 */
	public Monster(int x, int y, String image, Map map) {
		super(x, y, image, map);
		
	}

}
