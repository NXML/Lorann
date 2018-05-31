package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Loïc BOLLENBACH loic.bollenbach@viacesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
        
    }

    /**
     * Play.
     *
     * @throws InterruptedException
     *             Signals that an interrupted exception has occurred
     */
    @Override
    public void play() throws InterruptedException {
    	
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
        
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
        
    }
    
    /**
     * Gets the order performer.
     * 
     * @return the order performer
     */
	@Override
	public IOrderPerformer getOrderPerformer() {
		return null;
		
	}
    
}
