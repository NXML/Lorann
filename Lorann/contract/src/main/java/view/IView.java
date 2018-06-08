package view;

import controller.IOrderPerformer;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Nicolas
 * @author Riadjy
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
	 * Set the order performer.
	 * 
	 * @param orderPerformer
	 * 				the order performer
	 */
    void setOrderPerformer(final IOrderPerformer orderPerformer);
    
}
