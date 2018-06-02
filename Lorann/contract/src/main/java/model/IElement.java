package model;

/**
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see ISprite
 */
public interface IElement {
	
	/**
	 * Get the sprite.
	 * 
	 * @return the sprite
	 */
	ISprite getSprite();
	
	/**
	 * Check whether it's permeable.
	 * 
	 * @return true or false
	 */
	boolean isPermeable();
	
}
