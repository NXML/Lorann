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
	/** the serial version */
	private static final long serialVersionUID = -7393744101067014109L;
	
	/** The width of the frame. */
	private int width = 660;
	
	/** The height of the frame. */
	private int height = 484;
	
	/** The display. */
	private Display Display;
	
	/** The controller. */
	private IController controller;
	
	/** The model. */
	private IModel model;
	
	/** The order performer. */
	private IOrderPerformer orderPerformer;
	
	/** The userOrder. */
 	UserOrder userOrder;
	
	/**
	 * Instantiate a new Frame.
	 *
	 * @param model
	 * 			the model
	 */
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
	
	/**
	 * Get the Controller.
	 * 
	 * @return the controller
	 */
	
	private IController getController()
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

	/**
	 * Invoked when a key is released
	 * 
	 * @param keyEvent
	 * 
	 */
    
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
	
	/**
	 * Invoked when a key is typed
	 * 
	 * @param keyEvent
	 * 
	 */
	
	 public UserOrder getUserOrder() {
	    	return this.userOrder;
	    }
	    
	/**
	 * Repaint the components
	 */ 
	public void repaint()
	{
		this.Display.repaint();
	}

	
	/**
	 * Get the Display.
	 * 
	 * @return the display
	 */
	public Display getDisplay() {
		return Display;
	}
	

	/**
	 * Set the Controller.
	 * 
	 * @param controller
	 * 			the controller to set
	 */
	public void setController(IController controller)
	{
		this.controller = controller;
	}
	
	/**
	 * Get the Width.
	 * 
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	
	/**
	 * Set the Width.
	 * 
	 * @param Width
	 * 			the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Get the Height.
	 * 
	 * @return the Height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Set the Height.
	 * 
	 * @param height
	 * 			the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	
	/**
	 * Set the Display.
	 * 
	 * @param display
	 * 			the display to set
	 */
	
	public void setDisplay(Display Display) {
		this.Display = Display;
	}


	/*
	 * (non-Javadoc)
	 * @see view.IView#displayMessage
	 */
	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
