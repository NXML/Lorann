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


}
