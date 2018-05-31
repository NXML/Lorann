package model.elements;

import model.Direction;
import model.Map;
/**
 * <h1>The Class FireBall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class FireBall extends AI{
	
	public static String imagePaths[]= {"fireball_1.png","fireball_2.png","fireball_3.png","fireball_4.png","fireball_5.png"};
	
	/*
	 * Entity Constructor
	 * @param xPosition
	 * @param yPosition
	 * @param enum DIRECTION
	 * 
	 * using super constructor with image table
	 */
	public FireBall(int x, int y,Direction direction, Map map) {
		super(x, y, imagePaths, map);
		this.direction=direction;
	}
	/*
	 * Function that define the IA for fireball
	 * 
	 */
	@Override
	public void move() {
		moveTo(x,y);
	}

}
