package model;

public interface IHero extends IEntity{
	public boolean isAlive();
	public void setAlive(boolean alive);
	public boolean canSpell();
	public void setSpell(boolean spell);
	public int getScore();
	public void setScore(int score);
	
	
}
