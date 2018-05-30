package model.elements;

import model.Map;

public class Hero extends Entity{
	
	public static final char charSprite = '@';
	static final String imagesPaths[]= {"lorann_b.png","lorann_bl.png","lorann_l.png","lorann_ul.png","lorann_u.png","lorann_ur.png","lorann_r.png","lorann_br.png"};



	private boolean spell = true;
	private int     score = 0;
	private boolean alive = true;
	
	
	public Hero(int x, int y, Map map) {
		super(x, y, imagesPaths, map);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public boolean canSpell() {
		return spell;
	}


	public void setSpell(boolean spell) {
		this.spell = spell;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public boolean isAlive() {
		return alive;
	}


	public void setAlive(boolean alive) {
		this.alive = alive;
	}


	public static char getCharsprite() {
		return charSprite;
	}
	

}
