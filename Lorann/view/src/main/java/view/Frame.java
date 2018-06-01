


package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import controller.IController;
import model.IModel;


public class Frame extends JFrame implements KeyListener , IView
{
	
	private static final long serialVersionUID = -7393744101067014109L;
	private int width = 660;
	private int height = 484;
	
	
	private Display Display;
	private IController controller;
	private IModel model;
	
	
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
			case KeyEvent.VK_UP:
		
			System.out.println("haut");
			break;
			
			
			case KeyEvent.VK_DOWN:
			
			System.out.println("bas");
			break;
			
			
			case KeyEvent.VK_LEFT :
			
			System.out.println("gauche");
			break;
			
			
			case KeyEvent.VK_RIGHT:
			
			System.out.println("droite");
			break;
			
			case KeyEvent.VK_SPACE:
			
			System.out.println("espace");
			break;
				
		}
	}


	public void keyReleased(KeyEvent keyEvent) 
	{
		switch(keyEvent.getKeyCode())
		{
			case KeyEvent.VK_UP:
			
			System.out.println("haut relache");
			break;
			
			
			case KeyEvent.VK_DOWN:
			
			System.out.println("bas relache");
			break;
			
			
			case KeyEvent.VK_LEFT :
			
			System.out.println("gauche relache");
			break;
			
			
			case KeyEvent.VK_RIGHT:
			
			System.out.println("droite relache");
			break;
			
			case KeyEvent.VK_SPACE:
			
			System.out.println("espace relache");
			break;
				
		}
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
