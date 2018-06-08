
package view;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


import controller.IOrderPerformer;
import controller.UserOrder;
import model.IModel;

/**
 * <h1>The Class Frame</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see JFrame
 * @see KeyListener
 * @see IView
 */
public class Frame extends JFrame implements KeyListener, IView {
	
	/** The serial version. */
	private static final long serialVersionUID = -7393744101067014109L;
	
	/** The width of the frame. */
	private int width = 660;
	
	/** The height of the frame. */
	private int height = 484;
	
	/** The display. */
	private Display display;
	
	/** The model. */
	private IModel model;
	
	/** The order performer. */
	private IOrderPerformer orderPerformer;
 	
 	
 	
	
	/**
	 * Instantiate a new frame.
	 *
	 * @param model
	 * 			the model
	 */
	public Frame(IModel model) {
		this.model = model;
		this.display = new Display(this.model);
		this.setTitle("Lorran");
	    this.setContentPane(this.display);
	    this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.addKeyListener(this);
		this.setVisible(true);

	}

	/**
	 * Convert the key code to the user order.
	 * 
	 * @param keyCode
	 * 			the key code
	 */
  private static UserOrder keyCodeToUserOrder(final int keyCode) {
    	
    	UserOrder userOrder;
    	
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
    	
    	return userOrder;
    	
    }

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
  	public final void keyPressed(final KeyEvent keyEvent) {
  		try {
			this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
			
		} catch (final IOException e) {
			e.printStackTrace();
			
		}
		 
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
    */
    private IOrderPerformer getOrderPerformer() {
    	return this.orderPerformer;
    	
    }

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public final void keyTyped(final KeyEvent keyEvent) {
		// this.keyCodeToUserOrder(keyEvent.getKeyCode());
		
	}
	    
	/**
	 * Repaint the components.
	 */ 
	public void repaint() {
		this.display.repaint();
		
	}

	
	/**
	 * Get the display.
	 * 
	 * @return the display
	 */
	public Display getDisplay() {
		return display;
		
	}
	
	/**
	 * Get the width.
	 * 
	 * @return the width
	 */
	public int getWidth() {
		return width;
		
	}

	
	/**
	 * Set the width.
	 * 
	 * @param width
	 * 			the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
		
	}

	/**
	 * Get the height.
	 * 
	 * @return the Height
	 */
	public int getHeight() {
		return height;
		
	}
	
	/**
	 * Set the height.
	 * 
	 * @param height
	 * 			the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
		
	}

	/**
	 * Set the display.
	 * 
	 * @param Display
	 * 			the display to set
	 */
	
	public void setDisplay(Display Display) {
		this.display = Display;
		
	}


	/*
	 * (non-Javadoc)
	 * @see view.IView#displayMessage
	 */
	@Override
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));	
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see view.IView#setOrderPerformer(controller.IOrderPerformer)
	 */
	@Override
	public final void setOrderPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
		
	}
	
}
