package controller;

import java.io.IOException;

import model.IModel;
import view.IView;

/**
 * <h1>The Class LorannController.</h1>
 * 
 * @author Loïc BOLLENBACH loic.bollenbach@viacesi.fr
 * @version 1.0
 * @see IOrderPerfomer
 */
public class LorannController extends ControllerFacade implements IOrderPerformer {
	
	/** The Constant speed. */
	private static final int TIME_SLEEP = 30;
	
	/** The view. */
	private IView view;
	
	/** The model. */
	private IModel model;
	
	/** The user order. */
	private UserOrder userOrder;

	/**
	 * Instantiates a new Lorann controller.
	 * 
	 * @param view
	 * 			the view
	 * @param model
	 * 			the model
	 */
	public LorannController(IView view, IModel model) {
		super(view, model);
		this.clearUserOrder();
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see controller.ControllerFacade#play()
	 */
	@Override
	public void play() {
		
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
	 * Gets the view.
	 * 
	 * @return the view
	 */
	public IView getView() {
		return this.view;
		
	}

	/*
	 * (non-Javadoc)
	 * @see controller.IOrderPerformer#orderPerform(controller.UserOrder)
	 */
	@Override
	public void orderPerform(final UserOrder userOrder) {
		this.setUserOrder(userOrder);
		
	}
	
	/**
	 * Gets the user order.
	 * 
	 * @return the user order
	 */
	private UserOrder getUserOrder() {
		return this.userOrder;
		
	}
	
	/**
	 * Sets the user order.
	 * 
	 * @param userOrder
	 * 			the user order to set
	 */
	private void setUserOrder(final UserOrder userOrder) {
		this.userOrder = userOrder;
		
	}
	
	/**
	 * Clear user order.
	 */
	private void clearUserOrder() {
		this.userOrder = UserOrder.NOP;
		
	}
	
	/**
	 * Sets the view.
	 * 
	 * @param view
	 * 			the view to set
	 */
	private void setView(IView view) {
		this.view = view;
		
	}
	
	/**
	 * Sets the model.
	 * 
	 * @param model
	 * 			the model to set
	 */
	private void setModel(IModel model) {
		this.model = model;
		
	}
	
	/**
	 * Launch a fireball.
	 * 
	 * @throws IOException
	 * 			Signals that an I/O exception has occured
	 */
	private void launchFireball() throws IOException {
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see controller.ControllerFacade#getOrderPerformer()
	 */
	@Override
	public IOrderPerformer getOrderPerformer() {
		return this;
		
	}

}
