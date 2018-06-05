package model;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.lang.model.element.Element;

import model.DAO.DataLoader;
import model.elements.Entity;
import model.elements.Hero;

/**
 * <h1>The Class Map.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see IMap
 */
public class Map implements IMap {
	
	/**
	 * The ID.
	 */
	private int ID;
	
	/**
	 * The end.
	 */
	private boolean finished = false;
	


	/**
	 * The exit.
	 */
	private boolean exit = false;
	
	/**
	 * The entities.
	 */
	private ArrayList<IEntity> entities = new ArrayList<IEntity>();
	
	/**
	 * The table of elements.
	 */
	private IElement elements[][] = new IElement[20][12];

	/**
	 * The hero.
	 */
	private IHero hero;
	
	/**
	 * The width.
	 */
	private int width;
	
	/**
	 * The height.
	 */
	private int height;
	
	/**
	 * The dataloader.
	 */
	private DataLoader dataLoader;

	/**
	 * Instantiate a new map.
	 */
	public Map(){
		this.dataLoader = new DataLoader(this);
		this.dataLoader.load();		
	
	}

	/*
	 * (non-Javadoc)
	 * @see model.IMap#getElementXY(int, int)
	 */
	@Override
	public IElement getElementXY(int x , int y) {return elements[x][y];}

	/**
	 * Set the element at [x:y].
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param element
	 * 			the element
	 */
	public void setElementXY(int x , int y , IElement element) {this.elements[x][y] = element;}

	/*
	 * (non-Javadoc)
	 * @see model.IMap#addEntity(model.IEntity)
	 */
	@Override
	public void addEntity(IEntity entity) {entities.add(entity);};

	/*
	 * (non-Javadoc)
	 * @see model.IMap#removeEntity(model.IEntity)
	 */
	@Override
	public  void  removeEntity(IEntity entity) {entities.remove(entity);};

	/*
	 * (non-Javadoc)
	 * @see model.IMap#getEntities()
	 */
	@Override
	public ArrayList<IEntity> getEntities(){return entities;}

	/*
	 * (non-Javadoc)
	 * @see model.IMap#getHero()
	 */
	@Override
	public IHero getHero(){return this.hero;};

	/**
	 * Set the hero.
	 * 
	 * @param hero
	 * 			the hero
	 */
	public void setHero(IHero hero){this.hero = hero;}

	/*
	 * (non-Javadoc)
	 * @see model.IMap#isFinished()
	 */
	public boolean isFinished() {return finished;}

	/**
	 * Set whether it's finished.
	 * 
	 * @param finished
	 * 			true or false
	 */
	public void setFinished(boolean finished) {this.finished = finished;}

<<<<<<< HEAD

=======
	/**
	 * Get the ID.
	 * 
	 * @return the ID
	 */
	public int getID() {return ID;}
	
/*	public void existingMap () {
		try {
			
		}catch{
			
		}
	}*/
	
	public void setID(int ID) {
		if (ID >= 5) {
			throw new IllegalArgumentException();
		}else {
			this.ID = ID;
		}
	}
>>>>>>> branch 'preprod' of https://github.com/EpsicrOnn/Lorann_project-V.2

}



