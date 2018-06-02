package model.elements;
/**
 * <h1>The Class VWALL.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class VWall extends Wall {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '|';
	
	/**
	 * The image path.
	 */
	private final static String imagePath="vertical_bone.png";
	
	/**
	 * Instantiate a new vertical wall.
	 */
	public VWall() {
		super(imagePath);
		
	}

}
