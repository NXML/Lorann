package model.elements;
/**
 * <h1>The Class Wall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public abstract class Wall extends MotionlessElement{
	
	/*
	 * Constructor using super constructor
	 */
	public Wall(String image) {
		super(image);
		// TODO Auto-generated constructor stub
	}

	protected boolean permeable = false;
}
