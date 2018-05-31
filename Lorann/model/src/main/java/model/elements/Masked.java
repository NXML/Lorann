package model.elements;

import java.util.Random;

import model.Map;
/**
 * <h1>The Class Masked.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Masked extends Monster{
	public static char charSprite = '3';
	public static String imagePath = "monster_3.png";
	private int offsetX , offsetY;
	
	/*Constructor of a Masked which is a monster using super constructor
	 * @param int x
	 * @param int y
	 * @param Map map
	 */
	public Masked(int x, int y, Map map) {
		super(x, y, imagePath, map);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Function that define the move patern of this Monster
	 * random direction each step
	 */
	public void Move() {
		int counter=0;
		int[] array = {-1,0,1};
		
		do {
		 offsetX = array[new Random().nextInt(array.length)];
		 offsetY = array[new Random().nextInt(array.length)];
		 if(canMoveTo(x+offsetX,y+offsetY)) {
			 moveTo(x+offsetX,y+offsetY);
		 }
		
		}
		while(!canMoveTo(x+offsetX,y+offsetY) | counter<20);
			
	}

}