package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * <h1>The Class Gif.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 */
public class Gif extends Sprite {
	
	/**
	 * The images.
	 */
	private Image images[] = new Image[8];
	
	/**
	 * The state.
	 */
	private int state = 0;
	
	/**
	 * The sprite count.
	 */
	private int spriteCount = 0;

	/**
	 * <p>This class allows you to set multiple sprites to an element.</p>
	 * 
	 * @param paths
	 * 			table of image paths
	 */
	public Gif(String paths[])  {
		super(paths[0]);
		int i = 0;
		for (String path : paths) {
			spriteCount++;
				
			try {
				File pathToFile = new File("..\\model\\Sprite\\"+path);
				this.images[i] = ImageIO.read(pathToFile);
				
			} catch (IOException ex) {
			    ex.printStackTrace();
			    
			}	
			i++;
				
		}
		
	}
	
	/**
	 * Set the state of this sprite his next state.
	 */
	public void next() {this.state=(state+1)%spriteCount;}
	
	/**
	 * Get the image.
	 * 
	 * @return the image
	 */
	public Image getImage() {
		this.next();
		return this.image=images[state];
		
	}

}
