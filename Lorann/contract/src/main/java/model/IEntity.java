package model;

import java.util.Observer;

/**
 * <h1>The Interface IEntity.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see IElement
 */
public interface IEntity extends IElement {
	
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
	

	

	@Override
	default void addObserver(Observer o) {
		// TODO Auto-generated method stub
	}

	void setMod(int i);
	

	
}
