package model.elements;

import model.Map;
/**
 * <h1>The Class Zombie.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Zombie extends Monster{
	public static char charSprite = '2';
	public static String imagePath = "monster_2.png";
	
	
	/*Constructor of a Zombie which is a monster using super constructor
	 * @param int x
	 * @param int y
	 * @param Map map
	 */
	public Zombie(int x, int y,  Map map) {
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