package model.elements;

import model.Map;

public class CristalBall extends Item{
	
	
	public static String imagePaths[]= {"fireball_1.png","fireball_2.png","fireball_3.png","fireball_4.png","fireball_5.png"};

	public CristalBall(int x, int y, Map map) {
		super(x, y, imagePaths, map);
		// TODO Auto-generated constructor stub
	}

}
