package model.elements;
/**
 * <h1>The Class Ground.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Ground extends MotionlessElement{
	
	public static char spriteChar = '*';
	public static String imagePath = "Sprite/ground.png";
	
	/*Sprite/
	 * 
	 * Constructor using superconstructor
	 * 
	 */
	public Ground() {
		super(imagePath);
		// TODO Auto-generated constructor stub
	}

}
