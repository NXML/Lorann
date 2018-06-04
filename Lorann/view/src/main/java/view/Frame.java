package view;
import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;
import javax.swing.JFrame;
import controller.IController;
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
	
	/** The userOrder. */
	private UserOrder userOrder;
	
	
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
	
	public IController getController()
	{
		return controller;
	}

	
	/**
	 * Invoked when a key is pressed
	 * 
	 * @param keyEvent
	 * 
	 */
	public void keyPressed(KeyEvent keyEvent) 
	{
		switch(keyEvent.getKeyCode())
		{
			case KeyEvent.VK_NUMPAD8:
			userOrder = UserOrder.UP;
			model.getMap().getHero().moveUP();
			System.out.println("haut");
			break;
			
			
			case KeyEvent.VK_NUMPAD2:
			userOrder = UserOrder.DOWN;
			model.getMap().getHero().moveDOWN();
			System.out.println("bas");
			break;
			
			
			case KeyEvent.VK_NUMPAD4 :
			userOrder = UserOrder.LEFT;
			model.getMap().getHero().moveLEFT();
			System.out.println("gauche");
			break;
			
			
			case KeyEvent.VK_NUMPAD6:
			userOrder = UserOrder.RIGHT;
			model.getMap().getHero().moveRIGHT();
			System.out.println("droite");
			break;
			

			case KeyEvent.VK_NUMPAD7:
				userOrder = UserOrder.TOP_LEFT;
				model.getMap().getHero().moveUP_LEFT();
				System.out.println("Top left");
				break;
				
			case KeyEvent.VK_NUMPAD9:
				userOrder = UserOrder.TOP_RIGHT;
				model.getMap().getHero().moveUP_RIGHT();
				System.out.println("Top right");
				break;
					
				case KeyEvent.VK_NUMPAD1:
					userOrder = UserOrder.BOTTOM_LEFT;
					model.getMap().getHero().moveDOWN_LEFT();
					System.out.println("bottom left");
					break;
					
				case KeyEvent.VK_NUMPAD3:
					userOrder = UserOrder.BOTTOM_RIGHT;
					model.getMap().getHero().moveDOWN_RIGHT();
					System.out.println("bottom right");
					break;
				
			case KeyEvent.VK_NUMPAD5:
			userOrder = UserOrder.MAGIC;
			System.out.println("espace");
			break;
			
		}
	}


	/**
	 * Invoked when a key is released
	 * 
	 * @param keyEvent
	 * 
	 */
	public void keyReleased(KeyEvent keyEvent) 
	{
		
	}


	/**
	 * Invoked when a key is typed
	 * 
	 * @param keyEvent
	 * 
	 */
	public void keyTyped(KeyEvent keyEvent) 
	{
			
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
	
}
