package model.elements;

import java.util.ArrayList;
import java.util.Random;

import model.IEntity;
import model.Map;
/**
 * <h1>The Class Masked.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Masked extends Monster {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '3';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "monster_3.png";
	
	/**
	 * The movement vector.
	 */
	private int movementVectorX =0;
	private int movementVectorY=0;
	private boolean moved = false;
	
	/**
	 * Instantiate a new masked.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Masked(int x, int y, Map map) {
		super(x, y, imagePath, map);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	@SuppressWarnings("unchecked")
	public void move() {
		int[] array = {-1,0,1};
		movementVectorX=0;
		movementVectorY=0;
		moved=false;
		for (IEntity entity : (ArrayList<IEntity>) map.getEntities().clone()) {
			if(entity.getX()==x && entity.getY()== y) {
				if(entity instanceof FireBall) {
					map.removeEntity(entity);
					map.getHero().setSpell(true);
					map.removeEntity(this);
				}
			}
		}
		while((movementVectorX==0 && movementVectorY == 0) || !moved) {
			movementVectorX= array[new Random().nextInt(array.length)];
			movementVectorY= array[new Random().nextInt(array.length)];
			if(canMoveTo(x+(1*movementVectorX), y+(1*movementVectorY))) {
				moveTo(x+(1*movementVectorX), y+(1*movementVectorY));
				moved=true;
				
			}
			else if(canMoveTo(x-(1*movementVectorX), y-(1*movementVectorY))){
				movementVectorX *= -1;
				movementVectorY *= -1;
				moved=true;
			}
		}
		
	}

}