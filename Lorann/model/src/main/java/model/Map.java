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
private Element[][] elements;
private Hero hero;
private int width;
private int height;
private DataLoader dataLoader;
private ElementFactory elementFactory;

public Map(){
	this.dataLoader = new DataLoader(this);
	this.dataLoader.load();
	
}

public Element getElementXY(int x , int y) {return elements[x][y];}
public ArrayList<Entity> getEntity(){return entities;}



public Hero getHero(){return this.hero;};

public boolean isFinished() {return finished;}

public void setFinished(boolean finished) {this.finished = finished;}

public int getID() {return ID;}

public int getWidth() {return width;}

public int getHeight(){return height;}






}
