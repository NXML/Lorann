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
	int randomX,randomY;
	
	
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
		int counter=0;
		do {
		 randomX = new Random().nextInt((0 - 20) + 1) + 0;
		 randomY = new Random().nextInt((0 - 12) + 1) + 0;
		 if(canMoveTo(randomX,randomY)) {
			 moveTo(randomX,y+randomY);
		 }
		
		}
		while(!canMoveTo(randomX,randomY) | counter<20);
			
	}

}