package model.elements;
/**
 * <h1>The Class VWALL.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class VWall extends Wall{
	public static char charSprite = '|';
	private final static  String imagePath="VWall.png";
	
	
	public VWall() {
		super(imagePath);
	}

}
