package model.elements;

import model.Map;
/**
 * <h1>The Class AI.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public abstract class AI extends Entity{
	
	/**
	 * Instantiate an AI with an image.
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
	public AI(int x, int y, String image, Map map) {
		super(x, y, image, map);
		
	}
	
	/**
	 * Instantiate an AI with images.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param images
	 * 			the table of images
	 * @param map
	 * 			the map
	 */
	public AI(int x, int y, String images[], Map map) {
		super(x, y, images, map);
		
	}
	
}
