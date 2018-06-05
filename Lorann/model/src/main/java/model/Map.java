package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


import java.util.ArrayList;


import model.DAO.DataLoader;


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
	private int ID = 4;
	
	/**
	 * The end.
	 */
	private boolean finished = false;
	


	/**
	 * The exit.
	 */
	@SuppressWarnings("unused")
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
	@SuppressWarnings("unused")
	private int width;
	
	/**
	 * The height.
	 */
	@SuppressWarnings("unused")
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
	
	public void setID(int ID) throws Exception {
		try {
			if(this.ID < 5) {
				throw new Exception("Map out of range");
				
			}
		} catch (final Exception e) {
			e.printStackTrace();
			
		}
		
	}

}



