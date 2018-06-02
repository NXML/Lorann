package model;

/**
 * 
 * @author Arthur-Michel
 * @version 1.0
 */
public interface IEntity extends IElement{
	
	/**
	 * Move.
	 */
	void move();
	
	/**
	 * Move up.
	 */
	void moveUP();
	
	/**
	 * Move down.
	 */
	void moveDOWN();
	
	/**
	 * Move right.
	 */
	void moveRIGHT();
	
	/**
	 * Move left.
	 */
	void moveLEFT();
	
	/**
	 * Move up right.
	 */
	void moveUP_RIGHT();
	
	/**
	 * Move up left.
	 */
	void moveUP_LEFT();
	
	/**
	 * Move down left.
	 */
	void moveDOWN_LEFT();
	
	/**
	 * Move down right.
	 */
	void moveDOWN_RIGHT();
	
	/**
	 * Get x.
	 * 
	 * @return x
	 */
	int getX();
	
	/**
	 * Get y.
	 * 
	 * @return y
	 */
	int getY();
	
}
