package view;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.IController;
import model.IEntity;
import model.IModel;
import model.ISprite;

/**
 * <h1>The Class Display.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see Jpanel
 * @see Observer
 */
public class Display extends JPanel implements Observer {
	
	/** The serial version. */
	private static final long serialVersionUID = 1L;
	
	/** The model. */
	private IModel model;
	
	/** The different scores sprite. */
	private Image score1,score2,score3,score4,score5,score6,score7,score8,score9,score0,score;	

	/**
	 * Instantiate a new display.
	 *
	 * @param model
	 * 			the model
	 */
	public Display(IModel model) {
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		System.out.println("Affichage");
		this.model = model;
		
		for (IEntity entity : model.getMap().getEntities()) {
			((Observable) entity).addObserver(this);
			
		}
		/*Score  digits loading*/
		try {
			 score1 = ImageIO.read(new File("..\\model\\Sprite\\1.png"));
			 score2 = ImageIO.read(new File("..\\model\\Sprite\\2.png"));
			 score3 = ImageIO.read(new File("..\\model\\Sprite\\3.png"));
			 score4 = ImageIO.read(new File("..\\model\\Sprite\\4.png"));
			 score5 = ImageIO.read(new File("..\\model\\Sprite\\5.png"));
			 score6 = ImageIO.read(new File("..\\model\\Sprite\\6.png"));
			 score7 = ImageIO.read(new File("..\\model\\Sprite\\7.png"));
			 score8 = ImageIO.read(new File("..\\model\\Sprite\\8.png"));
			 score9 = ImageIO.read(new File("..\\model\\Sprite\\9.png"));
			 score0 = ImageIO.read(new File("..\\model\\Sprite\\0.png"));
			 score = ImageIO.read(new File("..\\model\\Sprite\\SCORE.png"));
			 
		} catch (IOException e) {
		    e.printStackTrace();
		    
		}
		
	}
	
	/**
	 * Draw and display the different elements on the map.
	 * 
	 * @param g
	 * @throws IOException
	 * 			Signals that an I/O exception has occurred.
	 * @throws InterruptedException
	 * 			Signals that an interrupted exception has occurred.
	 */
	private void drawMap(Graphics g) throws IOException, InterruptedException {
		
		/* Display elements on the map*/
		for(int x = 0; x < 20; x++) {
			for(int y = 0; y < 12; y++) {
				g.drawImage(model.getMap().getElementXY(x,y).getSprite().getImage(), x*32, y*32, this);
				
			}   
			
		}  
		
		/*Display all entities on the map*/
		for (IEntity entity : model.getMap().getEntities()) {
			g.drawImage(entity.getSprite().getImage(), entity.getX()*32, entity.getY()*32, this);
			
		}
		
		/*g.setColor(Color.WHITE);
		  g.drawString("Score : "+model.getMap().getHero().getScore(), 20, 32*12+10);
		*/
		//Display players score
		String scorevalue = ""+model.getMap().getHero().getScore();
		g.drawImage(this.score, 10, 30*13+10, this);
		for (int i = 0; i < scorevalue.length(); i++) {
				Image digit = null;
				switch(scorevalue.charAt(i)) {
				case '0': digit=score0; break;
				case '1': digit=score1; break;
				case '2': digit=score2; break;
				case '3': digit=score3; break;
				case '4': digit=score4; break;
				case '5': digit=score5; break;
				case '6': digit=score6; break;
				case '7': digit=score7; break;
				case '8': digit=score8; break;
				case '9': digit=score9; break;
				
				}
				g.drawImage(digit, 10+20+5*32+32*i, 30*13+10, this);
				
		}
		
	}
	
	/**
	 * Draw the components.
	 * 
	 * @param g 
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
			 try {drawMap(g);} 
			 catch (IOException e1) {e1.printStackTrace();} 
			 catch (InterruptedException e) {e.printStackTrace();}
	     
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		this.repaint();
		
	}

}
