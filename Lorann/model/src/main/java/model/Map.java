package model;

import java.util.ArrayList;
import javax.lang.model.element.Element;

import model.DAO.DataLoader;
import model.elements.Entity;
import model.elements.Hero;


public class Map implements IMap{
private int ID=1;
private boolean finished = false;
private boolean exit = false;
private ArrayList<IEntity> entities;
private IElement[][] elements;
private IHero hero;
private int width;
private int height;
private DataLoader dataLoader;

/*
 * <p>Constructor <p>
 * Start to load data using a data Loader
 * 
 * */
public Map(){
	this.dataLoader = new DataLoader(this);
	this.dataLoader.load();
	
}
/*
 * Return an element at specific coordinaites
 * @param int x
 * @param int y
 * @return Element
 */
@Override
public IElement getElementXY(int x , int y) {return elements[x][y];}


/*
 * place a certain Element at specific coordinates
 * @param int x
 * @param int y
 * @return Void
 */
public void setElementXY(int x , int y , model.elements.Element element) {this.elements[x][y]=element;}


/*
 * add entity to the arraylist of entities in this map
 * @param entity
 * 
 */
@Override
public void addEntity(IEntity entity) {entities.add(entity);};

/*
 * add entity from the arraylist of entities in this map
 * @param entity
 * 
 */
@Override
public void removeEntity(IEntity entity) {entities.remove(entity);};

/*
 *return all the arraylist entities of this map 
 * @return ArrayList<Entity>
 * 
 */
@Override
public ArrayList<IEntity> getEntity(){return entities;}








/*
 * get Curent map hero
 * @return Hero
 */
@Override
public IHero getHero(){return this.hero;};


/*
 * set current map hero
 * @param Hero
 * 
 */
public void setHero(IHero hero){this.hero= hero;}


/*
 * return the finish state of a map
 * @return boolean
 * 
 */
public boolean isFinished() {return finished;}
/*
 * set the current finish state of a map 
 * @param boolean
 */
public void setFinished(boolean finished) {this.finished = finished;}

/*
 * Function to get the ID of a map
 * @return int
 * 
 */
public int getID() {return ID;}

/*
 * Function to get the width of the map
 * @return int
 */
public int getWidth() {return width;}

/*
 * function to get the Height of the map 
 * @return int
 */
public int getHeight(){return height;}






}
