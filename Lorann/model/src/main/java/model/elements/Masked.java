package model.elements;

import model.Map;

public class Masked extends Monster{
	public static char charSprite = '3';
	public static String imagePath = "monster_3.png";
	
	
	
	public Masked(int x, int y, Map map) {
		super(x, y, imagePath, map);
		// TODO Auto-generated constructor stub
	}
	
	public void Move() {
		this.moveTo(x, y);
	}

}