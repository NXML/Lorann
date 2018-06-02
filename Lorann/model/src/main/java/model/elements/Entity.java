package model.elements;

import model.Direction;
import model.IEntity;
import model.ISprite;
import model.Map;

/**
 * <h1>The Class Entity.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 * @see IEntity
 */
public class Entity extends Element implements IEntity {
	
	/**
	 * The direction.
	 */
	protected Direction direction;
	
	/**
	 * x.
	 */
	protected int x;
	
	/**
	 * y.
	 */
	protected int y;
	
	/**
	 * The map.
	 */
	protected Map map;
	
	/**
	 * Instantiate a new Entity with an image.
	 * 	
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param image
	 * 			the image
	 * @param map
	 * 			the map
	 */
	public Entity(int x, int y, String image, Map map) {
		super(image);
		this.x=x;
		this.y=y;
		this.map=map;
		
	}
	
	/**
	 * Instantiate a new entity with images
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param images
	 * 			the table of images
	 * @param map
	 * 			the map
	 */
	public Entity(int x, int y, String images[], Map map) {
		super(images);
		this.x=x;
		this.y=y;
		this.map=map;
		
	}
	
	/**
	 * Move to [x:y].
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 */
	public void moveTo(int x, int y) {
		this.x=x;
		this.y=y;
		this.setChanged();
		this.notifyObservers();
		
	}

	/**
	 * Check whether it can move to [x:y].
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @return true or false
	 */
	public boolean canMoveTo(int x, int y) {
		return map.getElementXY(x, y).isPermeable();
		
	}	
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#moveUP()
	 */
	@Override
	public void moveUP() {
		if(canMoveTo(this.x ,this.y-1)) {moveTo(this.x ,this.y-1);}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#moveDOWN()
	 */
	@Override
	public void moveDOWN() {
		if(canMoveTo(this.x ,this.y+1)) {moveTo(this.x ,this.y+1);}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#moveRIGHT()
	 */
	@Override
	public void moveRIGHT() {
		if(canMoveTo(this.x+1 ,this.y)) {moveTo(this.x+1 ,this.y);}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#moveLEFT()
	 */
	@Override
	public void moveLEFT() {
		if(canMoveTo(this.x-1 ,this.y)) {moveTo(this.x-1 ,this.y);}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#moveUP_RIGHT()
	 */
	@Override
	public void moveUP_RIGHT() {
		if(canMoveTo(this.x+1 ,this.y-1)) {moveTo(this.x+1 ,this.y-1);}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#moveUP_LEFT()
	 */
	@Override
	public void moveUP_LEFT() {
		if(canMoveTo(this.x-1 ,this.y-1)) {moveTo(this.x-1 ,this.y-1);}
		
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#moveDOWN_LEFT()
	 */
	@Override
	public void moveDOWN_LEFT() {
		if(canMoveTo(this.x-1 ,this.y+1)) {moveTo(this.x-1 ,this.y+1);}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#moveDOWN_RIGHT()
	 */
	@Override
	public void moveDOWN_RIGHT() {
		if(canMoveTo(this.x+1 ,this.y+1)) {moveTo(this.x+1 ,this.y+1);}
		
	}

	/*
	 * (non-Javadoc)
	 * @see model.elements.Element#getSprite()
	 */
	@Override
	public ISprite getSprite() {
		return sprite;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#getX()
	 */
	@Override
	public int getX() {
		return x;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IEntity#getY()
	 */
	@Override
	public int getY() {
		return y;
		
	}

	/*
	 * (non-Javadoc)
	 * @see model.IEntity#move()
	 */
	@Override
	public void move() {
		moveTo(x,y);
		
	}

}
