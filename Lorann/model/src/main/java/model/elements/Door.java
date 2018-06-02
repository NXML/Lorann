package model.elements;

import model.Map;
import model.Sprite;
/**
 * <h1>The Class Door.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Door extends Entity {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = 'Q';
	
	/**
	 * The first image path.
	 */
	public static String imagePath = "gate_closed.png";
	
	/**
	 * The second image path
	 */
	public static String imagePath2 = "gate_open.png";
	
	/**
	 * The state of the door.
	 */
	private boolean open = false;

	/**
	 * Instantiate a new door.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Door(int x , int y , Map map) {
		super(x, y, imagePath, map);
		this.permeable=true;
		
	}

	/**
	 * Check whether it's open.
	 * 
	 * @return true or false
	 */
	public boolean isOpen() {
		return open;
		
	}

	/**
	 * Set whether it's open.
	 * 
	 * @param open
	 * 			true or false
	 */
	public void setOpen(boolean open) {
		if(open) this.sprite = new Sprite(imagePath2);
		if(!open) this.sprite = new Sprite(imagePath);
		this.open = open;
		
	}

}
