package model.elements;

import model.Direction;
import model.Map;
/**
 * <h1>The Class FireBall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class FireBall extends AI{
	
	public static String imagePaths[]= {"fireball_1.png","fireball_2.png","fireball_3.png","fireball_4.png","fireball_5.png"};
	public int normalVectorX;
	public int normalVectorY;
	
	/*
	 * Entity Constructor
	 * @param xPosition
	 * @param yPosition
	 * @param enum DIRECTION
	 * 
	 * using super constructor with image table
	 */
	public FireBall(int x, int y,Direction direction, Map map) {
		super(x, y, imagePaths, map);
		this.direction=direction;
		/*
		  set the noraml vector x and Y when launch the fireball;
		 */
		switch(direction) {
		case UP: normalVectorX=0;normalVectorY=1;break;
		case UP_RIGHT:normalVectorX=-1;normalVectorY=1;break;
		case RIGHT:normalVectorX=-1;normalVectorY=0;break;
		case BOTTOM_RIGHT:normalVectorX=-1;normalVectorY=-1;break;
		case BOTTOM:normalVectorX=0;normalVectorY=-1;break;
		case BOTTOM_LEFT:normalVectorX=1;normalVectorY=-1;break;
		case LEFT:normalVectorX=1;normalVectorY=0;break;
		case UP_LEFT:normalVectorX=1;normalVectorY=1;break;
		default :normalVectorX=0;normalVectorY=0; break;
		};
		
		this.Move();
	}
	/*
	 * Function that define the IA for fireball
	 * 
	 */
	@Override
	public void Move() {
		
		if(canMoveTo(this.x+normalVectorX,this.y+normalVectorY)) {
			moveTo(this.x+normalVectorX,this.y+normalVectorY);	
		}
		else {
			normalVectorX*=-1;
			normalVectorY*=-1;
			if(canMoveTo(this.x+normalVectorX,this.y+normalVectorY)) {
				moveTo(this.x+normalVectorX,this.y+normalVectorY);	}
		}
		
		
	}

}
