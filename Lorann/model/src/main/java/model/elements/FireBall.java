package model.elements;

import model.Direction;
import model.Map;

/**
 * <h1>The Class FireBall.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class FireBall extends AI {
	
	/**
	 * The image paths.
	 */
	public static String imagePaths[]= {"fireball_1.png","fireball_2.png","fireball_3.png","fireball_4.png","fireball_5.png"};
	
	/**
	 * The normal vector x.
	 */
	public int normalVectorX;
	
	/**
	 * The normal vector y.
	 */
	public int normalVectorY;
	
	/**
	 * Instantiate a new fireball.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param direction
	 * 			the direction
	 * @param map
	 * 			the map
	 */
	public FireBall(int x, int y,Direction direction, Map map) {
		super(x, y, imagePaths, map);
		this.direction=direction;
		
		switch(direction) {
		case UP: normalVectorX=0;normalVectorY=1;break;
		case TOP_RIGHT:normalVectorX=-1;normalVectorY=1;break;
		case RIGHT:normalVectorX=-1;normalVectorY=0;break;
		case BOTTOM_RIGHT:normalVectorX=-1;normalVectorY=-1;break;
		case DOWN:normalVectorX=0;normalVectorY=-1;break;
		case BOTTOM_LEFT:normalVectorX=1;normalVectorY=-1;break;
		case LEFT:normalVectorX=1;normalVectorY=0;break;
		case TOP_LEFT:normalVectorX=1;normalVectorY=1;break;
		default :normalVectorX=0;normalVectorY=0; break;
		
		}
		this.move();
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	@Override
	public void move() {
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
