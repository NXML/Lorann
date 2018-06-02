package model.elements;

/**
 * <h1>The Class Cross.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Cross extends Wall {
	
	/**
	 * The image path.
	 */
	public static String imagePath = "bone.png";
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = 'O';
	
	/**
	 * Instantiate a new cross.
	 */
	public Cross() {
		super(imagePath);
		
	}

}
