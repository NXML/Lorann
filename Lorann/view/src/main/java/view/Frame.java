package view;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import controller.IController;
import controller.IOrderPerformer;
import controller.UserOrder;
import model.IModel;
/**
 * <h1>The Class Frame</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see Jpanel , Cotroler
 */
public class Frame extends JFrame implements KeyListener , IView
{
	
	private static final long serialVersionUID = -7393744101067014109L;
	private int width = 660;
	private int height = 484;
	
	
	private Display Display;
	private IController controller;
	private IModel model;
	private IOrderPerformer orderPerformer;
 	UserOrder userOrder;
 	
	
	
	public Frame(IModel model)
	{
		this.model = model;
		this.Display = new Display(this.model);
		
		this.setTitle("Lorran");
	    this.setContentPane(this.Display);
	    this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.addKeyListener(this);
		this.setVisible(true);


	}
	
	public IController getController()
	{
		return controller;
	}

	
	  
  private void keyCodeToUserOrder(final int keyCode) {
    	
    	System.out.println(keyCode);
    	
    	switch(keyCode)
		{
			case KeyEvent.VK_NUMPAD8:
				userOrder = UserOrder.UP;
				break;
				
			case KeyEvent.VK_NUMPAD2:
				userOrder = UserOrder.DOWN;
				break;
				
			case KeyEvent.VK_NUMPAD4 :
				userOrder = UserOrder.LEFT;
				break;
				
			case KeyEvent.VK_NUMPAD6:
				userOrder = UserOrder.RIGHT;
				break;
			
			case KeyEvent.VK_NUMPAD7:
				userOrder = UserOrder.TOP_LEFT;
				break;
			
			case KeyEvent.VK_NUMPAD9:
				userOrder = UserOrder.TOP_RIGHT;
				break;	
				
			case KeyEvent.VK_NUMPAD1:
				userOrder = UserOrder.BOTTOM_LEFT;
				break;	
				
			case KeyEvent.VK_NUMPAD3:
				userOrder = UserOrder.BOTTOM_RIGHT;
				break;	
				
			case KeyEvent.VK_NUMPAD5:
				userOrder = UserOrder.MAGIC;
				break;
			
			default:
				userOrder = UserOrder.NOP;
				break;
		}
    	

    }

    
	public final void keyPressed(final KeyEvent keyEvent) {
		 this.keyCodeToUserOrder(keyEvent.getKeyCode());
	    }
	
	 
	/*private UserOrder keyCodeToUserOrder(final int keyCode) {
		  UserOrder userOrder;
			
		  switch(keyCode){
			case KeyEvent.VK_NUMPAD7:
				userOrder = UserOrder.TOP_LEFT;
				break;
			default:
				userOrder = UserOrder.NOP;
				break;
		}
		  return userOrder;
	}
		  
	  
    
    public final void keyPressed(final KeyEvent keyEvent) {
		 try {
			this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
		} catch (IOException e) {
			System.out.println("lol");
			e.printStackTrace();
		}
    }
    
    private IOrderPerformer getOrderPerformer() {
    	return this.orderPerformer;
    }
*/
	public void keyReleased(int keyEvent) {
		
	}

	public void keyTyped(KeyEvent keyEvent) {
		// this.keyCodeToUserOrder(keyEvent.getKeyCode());
	}
	
	 public UserOrder getUserOrder() {
	    	return this.userOrder;
	    }
	 
	public void repaint()
	{
		this.Display.repaint();
	}

	public Display getDisplay() {
		return Display;
	}
	
	public void setController(IController controller)
	{
		this.controller = controller;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setDisplay(Display Display) {
		this.Display = Display;
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
