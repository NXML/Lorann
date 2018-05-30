package model.elements;

import model.Map;
/**
 * <h1>The Class AI.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public abstract class AI extends Entity{
	/*
	 * Create an AI with coordinates an image path and a map
	 * @param x
	 * @param y
	 * @param String imagepath
	 * @Map map
	 */
	public AI(int x, int y, String image, Map map) {
		super(x, y, image, map);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Create an AI with coordinates an image path and a map
	 * @param x
	 * @param y
	 * @param String[] of image paths 
	 * @Map map
	 */
	public AI(int x, int y, String images[], Map map) {
		super(x, y, images, map);
		// TODO Auto-generated constructor stub
	}
	
}
