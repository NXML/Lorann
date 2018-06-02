package model.elements;
/**
 * <h1>The Class Ground.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Ground extends MotionlessElement {
	
	/**
	 * The char sprite
	 */
	public static char charSprite = '*';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "ground.png";
	
	/**
	 * Instantiate a new ground.
	 */
	public Ground() {
		super(imagePath);
		this.permeable=true;
		this.permeable = true;
		
	}

}
