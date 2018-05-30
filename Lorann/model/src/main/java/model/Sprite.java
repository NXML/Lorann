package model;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	protected Image image;
	
	
	public Sprite(String path){
		try {
		    File pathToFile = new File(path);
		    this.image = ImageIO.read(pathToFile);
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
	}
	
	Image getImage() {
		return this.image;
	}

}