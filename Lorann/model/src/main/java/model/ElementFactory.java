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


public class ElementFactory {

	Element vWall;
	Element hWall;
	Element cross;
	Element ground;
	Map map;
	
	public ElementFactory(Map map){
		this.map = map;
		this.vWall  = new VWall();
		this.hWall  = new HWall();
		this.cross  = new Cross();
		this.ground = new Ground();
	}

	public Element getvWall() {return vWall;}

	public Element gethWall() {return hWall;}

	public Element getCross() {return cross;}

	public Element getGround() {return ground;}
	
	public Entity  createDemon(int x, int y) {return new Demon(x,y, map);}
	public Entity  createMasked(int x, int y) {return new Masked(x,y, map);}
	public Entity  createOgre(int x, int y) {return new Ogre(x,y, map);}
	public Entity  createZombie(int x, int y) {return new Zombie(x,y, map);}
	
	
	
	
	
	
}
