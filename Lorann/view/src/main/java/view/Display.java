package view;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import model.IEntity;
import model.IModel;

public class Display extends JPanel
{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IModel model;
	
	private boolean           placement    = true;

	
	public Display(IModel model)
	{
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		System.out.println("Affichage");
		this.model = model;
		
	}
	
	

		    
			

	 
	 
	public void drawMap(Graphics g) throws IOException, InterruptedException
		{	  
		
		/* Afficher les elements de la map*/
			  for(int x = 0; x < 20; x++)
			  {
				  for(int y = 0; y < 12; y++){
					  g.drawImage(model.getMap().getElementXY(x,y).getSprite().getImage(), x*32, y*32, this);
				  }   
			  }  
			  for (IEntity entity : model.getMap().getEntity()) {
				  g.drawImage(entity.getSprite().getImage(), entity.getX()*32, entity.getY()*32, this);
			}
			  
			  
			  

			this.repaint();
		}
			  
			  
          
        
	
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	    if (placement){
			 try {drawMap(g);} 
			 catch (IOException e1) {e1.printStackTrace();} 
			 catch (InterruptedException e) {e.printStackTrace();}
	     }
	}
	
	
	
	
	
	
	public void update() 
	{
		this.repaint();
	}
	
}
