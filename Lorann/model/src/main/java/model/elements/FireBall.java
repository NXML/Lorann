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
	
	public static String imagePaths[]= {"Sprite/fireball_1.png","Sprite/fireball_2.png","Sprite/fireball_3.png","Sprite/fireball_4.png","Sprite/fireball_5.png"};
	
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
