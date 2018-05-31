package model.elements;

import model.Direction;
import model.IEntity;
import model.Map;


/**
 * <h1>The Class Entity.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */


public class Entity extends Element implements IEntity{
	protected Direction direction;
	protected int x;
	protected int y;
	protected Map map;
	
	
	
	/*
	 * Constructor of an entity
	 * @param int Position X
	 * @param int Position Y
	 * @param Srting imagePath
	 * @param Map map
	 */
	
	public Entity(int x , int y , String image ,Map map) {
		super(image);
		this.x=x;
		this.y=y;
		this.map=map;
	}
	
	public Entity(int x , int y , String images[] ,Map map) {
		super(images);
		this.x=x;
		this.y=y;
		this.map=map;
	}
	
	/*
	 * <h2> Move an element at a specific location</h2>
	 * <p> notify observers from the chenges</p>
	 * 
	 */
	public void moveTo(int x,int y) {
		this.x=x;
		this.y=y;
		this.setChanged();
		this.notifyObservers();

	}
	/*
	 * 
	 * Check passability on another Block
	 *  @return Boolean 
	 */
	
	public boolean canMoveTo(int x , int y) {
		return map.getElementXY(x, y).isPermeable();
		
	}
	// Function moves
	
	
	
	/**
	 * Move up
	 */
	@Override
	public void moveUP() {
		if(canMoveTo(this.x ,this.y-1)) {moveTo(this.x ,this.y-1);}
		
	}
	/*
	 * MoveDown
	 */
	@Override
	public void moveDOWN() {
		if(canMoveTo(this.x ,this.y+1)) {moveTo(this.x ,this.y+1);}
		
	}
	/*
	 * moveRight
	 */
	@Override
	public void moveRIGHT() {
		if(canMoveTo(this.x+1 ,this.y)) {moveTo(this.x+1 ,this.y);}
		
	}
	/*
	 * moveLeft
	 */
	@Override
	public void moveLEFT() {
		if(canMoveTo(this.x-1 ,this.y)) {moveTo(this.x-1 ,this.y);}
		
	}
	/*
	 * moveUP_RIGHT
	 */
	@Override
	public void moveUP_RIGHT() {
		if(canMoveTo(this.x+1 ,this.y-1)) {moveTo(this.x+1 ,this.y-1);}
		
	}
	@Override
	public void moveUP_LEFT() {
		if(canMoveTo(this.x-1 ,this.y-1)) {moveTo(this.x-1 ,this.y-1);}
		
	}
	/*
	 * moveUP_LEFT
	 */
	@Override
	public void moveDOWN_LEFT() {
		if(canMoveTo(this.x-1 ,this.y+1)) {moveTo(this.x-1 ,this.y+1);}
		
	}
	/*
	 * moveDOWN_RIGHT
	 */
	@Override
	public void moveDOWN_RIGHT() {
		if(canMoveTo(this.x+1 ,this.y+1)) {moveTo(this.x+1 ,this.y+1);}
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
