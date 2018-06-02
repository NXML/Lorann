package model.elements;
/**
 * <h1>The Class Wall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public abstract class Wall extends MotionlessElement {
	
	/**
	 * Instantiate a wall.
	 * 
	 * @param image
	 * 			the image
	 */
	public Wall(String image) {
		super(image);
		
	}

	/**
	 * The permeable.
	 */
	protected boolean permeable = false;
	
}
