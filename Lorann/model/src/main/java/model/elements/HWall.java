package model.elements;
/**
 * <h1>The Class HWall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class HWall extends Wall {
	
	/**
	 * The image path.
	 */
	private final static  String imagePath="horizontal_bone.png";
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '-';
	
	/**
	 * Instantiate a new horizontal wall.
	 */
	public HWall() {
		super(imagePath);
		
	}

}
