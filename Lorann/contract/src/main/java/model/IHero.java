package model;

/**
 * <h1>The Interface IHero.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see IEntity
 */
public interface IHero extends IEntity {
	
	/**
	 * Check whether it's alive.
	 * 
	 * @return true or false
	 */
	boolean isAlive();
	
	/**
	 * Set whether it's alive
	 * 
	 * @param alive
	 * 			true or false
	 */
	void setAlive(boolean alive);
	
	/**
	 * Check whether it can spell.
	 * 
	 * @return true or false
	 */
	boolean canSpell();
	
	/**
	 * Set whether it can spell.
	 * 
	 * @param spell
	 * 			true or false
	 */
	void setSpell(boolean spell);
	
	/**
	 * Get the score.
	 * 
	 * @return the score
	 */
	int getScore();
	
	/**
	 * Set the score.
	 * 
	 * @param score
	 * 			the score
	 */
	void setScore(int score);
	
	
	
	
}
