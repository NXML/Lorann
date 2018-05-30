package model.elements;

import model.Map;

public class Demon extends Monster{
	public static char charSprite = '1';
	public static String imagePath = "monster_1.png";
	
	
	
	public Demon(int x, int y, String image, Map map) {
		super(x, y, image, map);
		// TODO Auto-generated constructor stub
	}
	
	public void Move() {
		this.moveTo(x, y);
	}

}
