package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * <h1>The Class Sprite.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see ISprite
 */
public class Sprite implements ISprite {
	
	/**
	 * The image.
	 */
	protected Image image;
	
	/**
	 * Instantiate a new sprite.
	 * 
	 * @param path
	 * 			the path
	 */
	public Sprite(String path) {
		try {
		    File pathToFile = new File("..\\model\\Sprite\\"+path);
		    this.image = ImageIO.read(pathToFile);
		    
		} catch (IOException ex) {
		    ex.printStackTrace();
		    
		}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.ISprite#getImage()
	 */
	@Override
	public Image getImage() {
		return this.image;
		
	}

}
