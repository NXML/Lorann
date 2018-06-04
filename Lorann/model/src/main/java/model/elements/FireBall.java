package model.elements;

import java.util.ArrayList;

import model.Direction;
import model.IEntity;
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
	 * 
	 * different way to move the ball
	 */
	private int mod=1;
	public void setMod(int mod) {
		this.mod = mod;
	}

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
		map.getHero().setSpell(false);
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
		
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void move() {
		if(this.mod==1) {
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
		else {
			int xOffset =0;
			int yOffset =0;
			double minDistance=1000;
			for(int i=-1; i<=1; i++) {
				for(int j =-1; j<=1; j++) {
					double bufferedDistance=distance(this.x+i,this.y-j,map.getHero().getX(),map.getHero().getY());
						if(bufferedDistance<minDistance) {
							xOffset=i;
							yOffset=-j;
							minDistance=bufferedDistance;
						}
				}
			}

			if(canMoveTo(this.x+xOffset,this.y+yOffset)) {
				moveTo(this.x+xOffset,this.y+yOffset);
			}
		}
		for (IEntity entity : (ArrayList<IEntity>) map.getEntities().clone()) {
			if(entity.getX()==x && entity.getY()== y) {
				if(entity instanceof Monster) {
					map.removeEntity(entity);
					map.getHero().setSpell(true);
					map.removeEntity(this);
				}
				if(entity instanceof Hero) {
					map.getHero().setSpell(true);
					map.removeEntity(this);
				}
			}
		}
	}
	private double distance(int entityX,int entityY,int entity2X,int entity2Y) {
		return java.lang.Math.sqrt(java.lang.Math.pow((entity2X-entityX),2)+java.lang.Math.pow((entityY-entity2Y),2));
	}
}
