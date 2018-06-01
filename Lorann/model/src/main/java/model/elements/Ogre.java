package model.elements;

import java.util.Random;

import model.Map;
/**
 * <h1>The Class Ogre.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Ogre extends Monster{
	public static char charSprite = '4';
	public static String imagePath = "monster_4.png";
	public int movementVector = 1;
	
	
	/*Constructor of a Ogre which is a monster using super constructor
	 * @param int x
	 * @param int y
	 * @param Map map
	 */
	public Ogre(int x, int y,  Map map) {
		super(x, y, imagePath, map);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Function that define the move patern of this Monster
	 * this monster teleport in all the map
	 */
public void Move() {
		
		if(canMoveTo(x, y+(1*movementVector))) {
			moveTo(x, y+(1*movementVector));
		}
		else if(canMoveTo(x, y-(1*movementVector))){
			movementVector *= -1;
		}
		
		
	}

}