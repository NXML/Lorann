package model;

import java.util.ArrayList;
import javax.lang.model.element.Element;

import model.DAO.DataLoader;
import model.elements.Entity;
import model.elements.Hero;


public class Map {
private int ID;
private boolean finished = false;
private boolean exit = false;
private ArrayList<Entity> entities;
private model.elements.Element[][] elements;
private Hero hero;
private int width;
private int height;
private DataLoader dataLoader;

//constructor
public Map(){
	this.dataLoader = new DataLoader(this);
	this.dataLoader.load();
	
}
/// getter setter element
public model.elements.Element getElementXY(int x , int y) {return elements[x][y];}
public void setElementXY(int x , int y , model.elements.Element element) {this.elements[x][y]=element;}


//getter setter entity
public void addEntity(Entity entity) {entities.add(entity);};

public void removeEntity(Entity entity) {entities.remove(entity);};
public ArrayList<Entity> getEntity(){return entities;}










public Hero getHero(){return this.hero;};

public void setHero(Hero hero){this.hero= hero;}

public boolean isFinished() {return finished;}

public void setFinished(boolean finished) {this.finished = finished;}

public int getID() {return ID;}

public int getWidth() {return width;}

public int getHeight(){return height;}






}
