


package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import controller.IController;
import controller.UserOrder;
import model.IModel;


public class Frame extends JFrame implements KeyListener , IView
{
	
	private static final long serialVersionUID = -7393744101067014109L;
	private int width = 660;
	private int height = 484;
	
	
	private Display Display;
	private IController controller;
	private IModel model;
	private UserOrder userOrder;
	
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
				
			case KeyEvent.VK_SPACE:
			userOrder = UserOrder.MAGIC;
			System.out.println("espace");
			break;
			
		}
	}


	public void keyReleased(KeyEvent keyEvent) 
	{
		
	}



	public void keyTyped(KeyEvent keyEvent) 
	{
			
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
	
}
