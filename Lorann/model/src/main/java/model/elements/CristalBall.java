package model.elements;

import model.Map;
/**
 * <h1>The Class CristalBall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class CristalBall extends Item{
	
	public static String image ="Sprite/crystal_ball.png";
/*
 * Cristall ball Construcor using super constructor 
 * 
 */
	public CristalBall(int x, int y, Map map) {
		super(x, y, image, map);
		// TODO Auto-generated constructor stub
	}

}
