package model.elements;

import model.IHero;
import model.Map;
/**
 * <h1>The Class Hero</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Hero extends Entity implements IHero{
	
	public static final char charSprite = '@';
	static final String imagesPaths[]= {"lorann_b.png","lorann_bl.png","lorann_l.png","lorann_ul.png","lorann_u.png","lorann_ur.png","lorann_r.png","lorann_br.png"};



	private boolean spell = true;
	private int     score = 0;
	private boolean alive = true;
	
	/*
	 * Constructor using superconstructor
	 * 
	 */
	public Hero(int x, int y, Map map) {
		super(x, y, imagesPaths, map);
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * Say if the Hero canSpell or not
	 * 
	 */
	@Override
	public boolean canSpell() {
		return spell;
	}

/*
 * 
 * set the value of hero's spell
 * @param boolean
 */
	@Override
	public void setSpell(boolean spell) {
		this.spell = spell;
	}

/*
 * get Hero's Score
 *@return hero's score
 */	@Override
	public int getScore() {
		return score;
	}

/*
 * set Hero's score
 * @param int Score
 */
 	@Override
	public void setScore(int score) {
		this.score = score;
	}

/*
 * @return player alive status boolean
 * 
 */
 	@Override
	public boolean isAlive() {
		return alive;
	}

/*
 * Set player Alive status
 * @param alive boolean
 */
 	@Override
	public void setAlive(boolean alive) {
		this.alive = alive;
	}


	@Override
	public void Move() {
		super.Move();
		
	}


	
	

}
