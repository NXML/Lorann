package controller;

import model.IModel;
import view.IView;

public class LorannController extends ControllerFacade implements IOrderPerformer {
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
	public void orderPerform(UserOrder userOrder) {
		
	}
	
	private UserOrder getUserOrder() {
		return this.userOrder;
		
	}
	
	private void setUserOrder(UserOrder userOrder) {
		this.userOrder = userOrder;
		
	}
	
	private void clearUserOrder() {
		
	}
	
	private void setView(IView view) {
		this.view = view;
		
	}
	
	private void setModel(IModel model) {
		this.model = model;
		
	}
	
	private void launchFireball() {
		
	}

}
