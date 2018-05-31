package model.elements;

/**
 * <h1>The Class Cross.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Cross extends Wall{
	
	public static String imagePath="bone.png";
	public static char charSprite = 'O';
	
	/*
	 * Constructor a cross wall using superconstructor
	 * 
	 * 
	 */
	public Cross() {
		super(imagePath);
	}

}
