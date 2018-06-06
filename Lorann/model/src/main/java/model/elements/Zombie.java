package model.elements;

import java.util.ArrayList;

import model.IEntity;
import model.Map;
/**
 * <h1>The Class Zombie.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Zombie extends Monster {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '2';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "monster_2.png";
	
	/**
	 * The movement vector.
	 */
	public int movementVector = 1;
	
	/**
	 * Instantiate a new zombie.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Zombie(int x, int y,  Map map) {
		super(x, y, imagePath, map);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	@SuppressWarnings("unchecked")
	public void move() {
		
		
		for (IEntity entity : (ArrayList<IEntity>) map.getEntities().clone()) {
			if(entity.getX()==x && entity.getY()== y) {
				if(entity instanceof FireBall) {
					map.removeEntity(entity);
					map.getHero().setSpell(true);
					map.removeEntity(this);
					
				}
				
				
			}
			
		}
		
		if(canMoveTo(x, y+(1*movementVector))) {
			moveTo(x, y+(1*movementVector));
			
		}
		else if(canMoveTo(x, y-(1*movementVector))){
			movementVector *= -1;
			
		}
		for (IEntity entity : (ArrayList<IEntity>) map.getEntities().clone()) {
			if(entity.getX()==x && entity.getY()== y) {
				if(entity instanceof FireBall) {
					map.removeEntity(entity);
					map.getHero().setSpell(true);
					map.removeEntity(this);
					
				}
				
				
			}
			
		}
		
	}

}