package controller;

import model.IModel;
import view.IView;

/**
 * <h1>The Class LorannController.</h1>
 * 
 * @author Loïc
 * @version 1.0
 * @see IController
 */
public class LorannController implements IOrderPerformer, IController {
	
	/** The constant speed. */
	private static final int TIME_SLEEP = 300;
	
	/** The view. */
	private IView view;
	
	/** The model. */
	private IModel model;
	
	/**
	 * Instantiate a new Lorann controller.
	 * 
	 * @param view
	 * 			the view
	 * @param model
	 * 			the model
	 */
	public LorannController(IView view, IModel model) {
		super();
		this.view = view;
		this.model = model;
		this.clearUserOrder();
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see controller.ControllerFacade#play()
	 */
	@Override
	public void play() throws InterruptedException {
		while(this.getModel().getMap().getHero().isAlive()) {
			Thread.sleep(TIME_SLEEP);
			System.out.println(view.getUserOrder());
				
			
				this.clearUserOrder();
			
			for (int i=0 ; i<model.getMap().getEntities().size();i++) {
				model.getMap().getEntities().get(i).move();
			}
			if(model.getMap().getFinished()) {
				this.getView().displayMessage("Good job ! You win !\n Your score is : " + model.getMap().getHero().getScore());
			
			}
		
		}
		this.getView().displayMessage("Game Over");
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see controller.IController#getModel()
	 */
	public IModel getModel() {
		return this.model;
		
	}
	
	/**
	 * Get the view.
	 * 
	 * @return the view
	 */
	private IView getView() {
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
	 * Set the user order.
	 * 
	 * @param userOrder
	 * 			the user order to set
	 */
	private void setUserOrder(final UserOrder userOrder) {
		
	}
	
	/**
	 * Clear user order.
	 */
	private void clearUserOrder() {
		
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
