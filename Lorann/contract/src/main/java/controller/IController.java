package controller;

import model.IModel;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Loïc
 * @version 1.0
 * @see IOrderPerformer
 */
public interface IController {
	
	/**
	 * Play.
	 * 
	 * @throws InterruptedException
	 * 				Signals that an interrupted exception has occurred
	 */
	void play() throws InterruptedException;
	
	/**
	 * Get the order performer.
	 * 
	 * @return the order performer
	 */
	IOrderPerformer getOrderPerformer();

	/**
	 * Get the model.
	 * 
	 * @return the model
	 */
	IModel getModel();

}
