package model.elements;

import model.Map;

public class Zombie extends Monster{
	public static char charSprite = '2';
	public static String imagePath = "monster_2.png";
	
	
	
	public Zombie(int x, int y, String image, Map map) {
		super(x, y, image, map);
		// TODO Auto-generated constructor stub
	}
	
	public void Move() {
		this.moveTo(x, y);
	}

}