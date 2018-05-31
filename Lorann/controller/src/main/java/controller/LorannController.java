package controller;

import java.io.IOException;

import model.IModel;
import view.IView;

/**
 * <h1>The Class LorannController.</h1>
 * 
 * @author Lo�c BOLLENBACH loic.bollenbach@viacesi.fr
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
	public void play() throws InterruptedException {
		while(this.getModel().getMap().getHero().isAlive()) {
			Thread.sleep(TIME_SLEEP);
			switch(this.userOrder) {
			case UP:
				this.getModel().getMap().getHero().moveUP();
				break;
			case DOWN:
				this.getModel().getMap().getHero().moveDOWN();
				break;
			case LEFT:
				this.getModel().getMap().getHero().moveLEFT();
				break;
			case RIGHT:
				this.getModel().getMap().getHero().moveRIGHT();
				break;
			case TOP_LEFT:
				this.getModel().getMap().getHero().moveUP_LEFT();
				break;
			case TOP_RIGHT:
				this.getModel().getMap().getHero().moveUP_RIGHT();
				break;
			case BOTTOM_LEFT:
				this.getModel().getMap().getHero().moveDOWN_LEFT();
				break;
			case BOTTOM_RIGHT:
				this.getModel().getMap().getHero().moveDOWN_RIGHT();
				break;
			case MAGIC:
				try {
					this.launchFireball();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			case NOP:
			default:
				break;
			}
			this.clearUserOrder();
			
		}
		this.getView().displayMessage("Game Over");
		
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
	 * 			Signals that an I/O exception has occurred
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