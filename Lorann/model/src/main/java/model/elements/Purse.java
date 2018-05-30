package model.elements;

import model.Map;

public class Purse extends Item{
	
	public static char charSprite = '$';
	public static String imagePath = "purse.png";
	
	
	public Purse(int x, int y, Map map) {
		super(x, y, imagePath, map);
		// TODO Auto-generated constructor stub
	}
	

}
