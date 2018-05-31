package model.elements;
/**
 * <h1>The Class HWall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class HWall extends Wall{
	private final static  String imagePath="horizontal_bone.png";
	public static char charSprite = '-';
	/*
	 * Constructor using superconstructor
	 */
	public HWall() {
		super(imagePath);
	}

}
