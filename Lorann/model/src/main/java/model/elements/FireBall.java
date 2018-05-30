package model.elements;

import model.Direction;
import model.Map;

public class FireBall extends AI{
	
	public static String imagePaths[]= {"fireball_1.png","fireball_2.png","fireball_3.png","fireball_4.png","fireball_5.png"};

	public FireBall(int x, int y,Direction direction, Map map) {
		super(x, y, imagePaths, map);
		this.direction=direction;
	}
	
	void move() {
		moveTo(x,y);
	}

}
