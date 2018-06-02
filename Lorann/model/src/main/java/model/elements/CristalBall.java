package model.elements;

import model.Map;
/**
 * <h1>The Class CristalBall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class CristalBall extends Item {
	
	/**
	 * The image.
	 */
	public static String image = "crystal_ball.png";
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = 'C';

	/**
	 * Instantiate a new cristalball.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public CristalBall(int x, int y, Map map) {
		super(x, y, image, map);
		
	}

}
