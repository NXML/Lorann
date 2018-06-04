package model.elements;

import java.util.ArrayList;

import model.IEntity;
import model.IHero;
import model.Map;
/**
 * <h1>The Class Hero</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 * @see IHero
 */
public class Hero extends Entity implements IHero {
	
	/**
	 * The char sprite.
	 */
	public static final char charSprite = '@';
	
	/**
	 * The image paths.
	 */
	static final String imagePaths[]= {"lorann_b.png","lorann_bl.png","lorann_l.png","lorann_ul.png","lorann_u.png","lorann_ur.png","lorann_r.png","lorann_br.png"};

	/**
	 * The spell.
	 */
	private boolean spell = true;
	
	/**
	 * The score.
	 */
	private int     score = 0;
	
	/**
	 * The life.
	 */
	private boolean alive = true;
	
	/**
	 * Instantiate a new hero.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Hero(int x, int y, Map map) {
		super(x, y, imagePaths, map);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IHero#canSpell()
	 */
	@Override
	public boolean canSpell() {
		return spell;
		
	}

	/*
	 * (non-Javadoc)
	 * @see model.IHero#setSpell(boolean)
	 */
	@Override
	public void setSpell(boolean spell) {
		this.spell = spell;
		
	}

	/*
	 * (non-Javadoc)
	 * @see model.IHero#getScore()
	 */
	@Override
	public int getScore() {
		return score;
		
	}

	/*
	 * (non-Javadoc)
	 * @see model.IHero#setScore(int)
	 */
 	@Override
	public void setScore(int score) {
		this.score = score;
		
	}

 	/*
 	 * (non-Javadoc)
 	 * @see model.IHero#isAlive()
 	 */
 	@Override
	public boolean isAlive() {
		return alive;
		
	}

 	/*
 	 * (non-Javadoc)
 	 * @see model.IHero#setAlive(boolean)
 	 */
 	@Override
	public void setAlive(boolean alive) {
		this.alive = alive;
		
	}

 	/*
 	 * (non-Javadoc)
 	 * @see model.elements.Entity#move()
 	 */
	@Override
	public void move() {
		super.move();
		
	}
	/*
	 * 
	 * 
	 * (non-Javadoc)
	 * @see model.IHero#launchFireBall()
	 */
	@Override
	public  void launchFireBall() {
		map.addEntity(new FireBall(this.x,this.y,this.direction,this.map));
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#moveTo(int, int)
	 */
	public void moveTo(int x,int y) {
		super.moveTo(x, y);
		for (IEntity entity : (ArrayList<IEntity>) map.getEntities().clone()) {
			if(entity.getX()==x && entity.getY()== y) {
				if(entity instanceof Monster){
					this.setAlive(false);
					//map.removeEntity(this);
					
				}
				if(entity instanceof Purse) {
					this.setScore(score+ ((Purse)entity).getValue());
					map.removeEntity(entity);
					System.out.println(map.getHero().getScore());
					
				}
				if(entity instanceof Door) {
					if(((Door) entity).isOpen()==false) {this.setAlive(false);}
					else {map.setFinished(true);}
					
				}
				if(entity instanceof CristalBall) {
					for (IEntity subentyty : map.getEntities()) {
						if(subentyty instanceof Door) {
							((Door) subentyty).setOpen(true);
							
						}
						
					}
					map.removeEntity(entity);
					
				}
				
			}
			
		}
		
	}

}
