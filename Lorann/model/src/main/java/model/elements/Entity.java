package model.elements;

import model.Direction;
import model.Map;

public class Entity extends Element {
	protected Direction direction;
	protected int x;
	protected int y;
	protected Map map;
	
	
	
	
	
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
	
	
	public void moveTo(int x,int y) {
		this.x=x;
		this.y=y;
		this.setChanged();
		this.notifyObservers();

	}
	
	public boolean canMoveTo(int x , int y) {
		return map.getElementXY(x, y).isPermeable();
		
	}
	// Function moves
	public void moveUP() {
		if(canMoveTo(this.x ,this.y-1)) {moveTo(this.x ,this.y-1);}
		
	}
	
	public void moveDOWN() {
		if(canMoveTo(this.x ,this.y+1)) {moveTo(this.x ,this.y+1);}
		
	}
	public void moveRIGHT() {
		if(canMoveTo(this.x+1 ,this.y)) {moveTo(this.x+1 ,this.y);}
		
	}
	
	public void moveLEFT() {
		if(canMoveTo(this.x-1 ,this.y)) {moveTo(this.x-1 ,this.y);}
		
	}
	
	public void moveUP_RIGHT() {
		if(canMoveTo(this.x+1 ,this.y-1)) {moveTo(this.x+1 ,this.y-1);}
		
	}
	public void moveUP_LEFT() {
		if(canMoveTo(this.x-1 ,this.y-1)) {moveTo(this.x-1 ,this.y-1);}
		
	}
	
	public void moveDOWN_LEFT() {
		if(canMoveTo(this.x-1 ,this.y+1)) {moveTo(this.x-1 ,this.y+1);}
		
	}
	
	public void moveDOWN_RIGHT() {
		if(canMoveTo(this.x+1 ,this.y+1)) {moveTo(this.x+1 ,this.y+1);}
		
	}
	
	
	
	
	
	
	
	
	
	

}
