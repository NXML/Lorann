package model;

import model.elements.Cross;
import model.elements.Demon;
import model.elements.Element;
import model.elements.Entity;
import model.elements.Ground;
import model.elements.HWall;
import model.elements.Masked;
import model.elements.Ogre;
import model.elements.VWall;
import model.elements.Zombie;

/**
 * <h1>The Class ElementFactory.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 */
public class ElementFactory {

	/**
	 * The vertical wall.
	 */
	Element vWall;
	
	/**
	 * The horizontal wall.
	 */
	Element hWall;
	
	/**
	 * The cross.
	 */
	Element cross;

	/**
	 * The ground.
	 */
	Element ground;
	
	/**
	 * The map.
	 */
	Map map;
	
	/**
	 * Instantiate a new element factory
	 * 
	 * @param map
	 * 			the map
	 */
	public ElementFactory(Map map) {
		this.map = map;
		this.vWall  = new VWall();
		this.hWall  = new HWall();
		this.cross  = new Cross();
		this.ground = new Ground();
		
	}

	/**
	 * Get the vertical wall.
	 * 
	 * @return the vertical wall
	 */
	public Element getVWall() {return vWall;}

	/**
	 * Get the horizontal wall.
	 * 
	 * @return the horizontal wall
	 */
	public Element getHWall() {return hWall;}

	/**
	 * Get the cross.
	 * 
	 * @return the cross
	 */
	public Element getCross() {return cross;}

	/**
	 * Get the ground.
	 * 
	 * @return the ground
	 */
	public Element getGround() {return ground;}
	
	/**
	 * Create a demon.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @return the entity
	 */
	public Entity  createDemon(int x, int y) {return new Demon(x,y, map);}
	
	/**
	 * Create a masked.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @return the entity
	 */
	public Entity  createMasked(int x, int y) {return new Masked(x,y, map);}
	
	/**
	 * Create an ogre.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @return the entity
	 */
	public Entity  createOgre(int x, int y) {return new Ogre(x,y, map);}
	
	/**
	 * Create a zombie.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @return the entity
	 */
	public Entity  createZombie(int x, int y) {return new Zombie(x,y, map);}
	
}
