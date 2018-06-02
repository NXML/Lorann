package model;

import java.util.ArrayList;

/**
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see IHero
 * @see IEntity
 * @see IElement
 */
public interface IMap {
	
	/**
	 * Get the hero.
	 * 
	 * @return the hero
	 */
	IHero getHero();
	
	/**
	 * Get the entities.
	 * 
	 * @return the entities
	 */
	ArrayList<IEntity> getEntities();
	
	/**
	 * Get the element at [x:y].
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @return the element at [x:y]
	 */
	IElement getElementXY(int x , int y);
	
	/**
	 * Add the entity.
	 * 
	 * @param entity
	 * 			the entity
	 */
	void addEntity(IEntity entity);
	
	/**
	 * Remove the entity.
	 * 
	 * @param entity
	 * 			the entity
	 */
	void removeEntity(IEntity entity);
	
}
