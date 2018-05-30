package model.elements;

import model.Map;
/**
 * <h1>The Class Item.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public abstract class Item extends Entity{
	/*
	 * Constructor using super constructor for 1 image
	 * 
	 */
	public Item(int x, int y, String image, Map map) {
		super(x, y, image, map);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Constructor using super construcor for items with many images
	 * 
	 */
	public Item(int x, int y, String images[], Map map) {
		super(x, y, images, map);
		// TODO Auto-generated constructor stub
	}

}
