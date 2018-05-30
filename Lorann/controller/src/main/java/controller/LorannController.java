package controller;

import java.io.IOException;

import model.IModel;
import view.IView;

public class LorannController extends ControllerFacade implements IOrderPerformer {
	private static final int TIME_SLEEP = 30;
	private IView view;
	private IModel model;
	private UserOrder userOrder;

	public LorannController(IView view, IModel model) {
		super(view, model);
		this.clearUserOrder();
		
	}
	
	@Override
	public void play() {
		
	}
	
	public IModel getModel() {
		return this.model;
		
	}
	
	public IView getView() {
		return this.view;
		
	}

	@Override
	public void orderPerform(final UserOrder userOrder) {
		this.setUserOrder(userOrder);
		
	}
	
	private UserOrder getUserOrder() {
		return this.userOrder;
		
	}
	
	private void setUserOrder(final UserOrder userOrder) {
		this.userOrder = userOrder;
		
	}
	
	private void clearUserOrder() {
		this.userOrder = UserOrder.NOP;
		
	}
	
	private void setView(IView view) {
		this.view = view;
		
	}
	
	private void setModel(IModel model) {
		this.model = model;
		
	}
	
	private void launchFireball() throws IOException {
		
	}
	
	public IOrderPerformer getOrderPerformer() {
		return this;
		
	}

}
