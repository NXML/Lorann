package controller;

import model.IModel;
import view.IView;

public class LorannController extends ControllerFacade implements IOrderPerformer, IController {
	private static final int TIME_SLEEP = 30;
	private IView view;
	private IModel model;
	private UserOrder userOrder;

	public LorannController(IView view, IModel model) {
		super(view, model);
		
	}
	
	public void play() {
		
	}

	@Override
	public void orderPerform(final UserOrder userOrder) {
		
	}
	
	private UserOrder getUserOrder() {
		return this.userOrder;
		
	}
	
	private void setUserOrder(final UserOrder userOrder) {
		this.userOrder = userOrder;
		
	}
	
	private void clearUserOrder() {
		
	}
	
	private void setView(final IView view) {
		this.view = view;
		
	}
	
	private void setModel(final IModel model) {
		this.model = model;
		
	}
	
	private void launchFireball() {
		
	}

}
