package model.elements;

import model.Map;
/**
 * <h1>The Class Demon</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Demon extends Monster{
	public static char charSprite = '1';
	public static String imagePath = "monster_1.png";
	private int movementVector =1;
	
	
	/*Constructor of a Demon which is a monster using super constructor
	 * @param int x
	 * @param int y
	 * @param Map map
	 */
	public Demon(int x, int y, Map map) {
		super(x, y, imagePath, map);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Function that define the move pattern of this Monster
	 * horizontal deplacement in the map
	 * 
	 */
	public void Move() {
		
		if(canMoveTo(x+(1*movementVector), y)) {
			moveTo(x+(1*movementVector), y);
		}
		else if(canMoveTo(x-(1*movementVector), y)){
			movementVector *= -1;
		}
		
		
	}

}
