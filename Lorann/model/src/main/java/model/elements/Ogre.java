package model.elements;

import model.Map;

public class Ogre extends Monster{
	public static char charSprite = '4';
	public static String imagePath = "monster_4.png";
	
	
	
	public Ogre(int x, int y, String image, Map map) {
		super(x, y, image, map);
		// TODO Auto-generated constructor stub
	}
	
	public void Move() {
		this.moveTo(x, y);
	}

}