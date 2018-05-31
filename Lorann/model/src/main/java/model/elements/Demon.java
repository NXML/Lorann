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
	public static String imagePath = "Sprite/monster_1.png";
	
	
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
	 * Function that define the move patern of this Monster
	 */
	public void Move() {
		this.moveTo(x, y);
	}

}
