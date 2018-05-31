package controller;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Lo�c BOLLENBACH loic.bollenbach@viacesi.fr
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
	 * Gets the order performer.
	 * 
	 * @return the order performer
	 */
	IOrderPerformer getOrderPerformer();

}
