package controller;

import java.io.IOException;

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
	private static final int TIME_SLEEP = 150;
	
	/** The view. */
	private IView view;
	
	/** The model. */
	private IModel model;
	
	/** The user order. */
	private UserOrder userOrder;
	
	/**
	 * Instantiate a new Lorann controller.
	 * 
	 * @param view
	 * 			the view
	 * @param model
	 * 			the model
	 */
	public LorannController(IView view, IModel model) {
		this.setView(view);
		this.setModel(model);
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
			switch(this.getUserOrder()) {
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
				this.getModel().getMap().getHero().launchFireBall();
			case NOP:
			default:
				
			}
				this.clearUserOrder();
			
			for (int i=0 ; i<model.getMap().getEntities().size();i++) {
				model.getMap().getEntities().get(i).move();
			}
			if(model.getMap().isFinished()) {
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
	public final void orderPerform(final UserOrder userOrder) throws IOException {
		this.setUserOrder(userOrder);
		
	}
	
	/**
	 * Set the user order.
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
	
	/*
	 * (non-Javadoc)
	 * @see controller.ControllerFacade#getOrderPerformer()
	 */
	@Override
	public IOrderPerformer getOrderPerformer() {
		return this;
		
	}
	
	private UserOrder getUserOrder() {
		return this.userOrder;
		
	}
	
	private void setView(IView view) {
		this.view = view;
		
	}
	
	private void setModel(IModel model) {
		this.model = model;
		
	}

}
