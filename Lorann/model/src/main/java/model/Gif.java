package model;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Gif extends Sprite{
	private Image images[];
	private int state = 0;

	public Gif(String paths[]) {
		super(paths[0]);
		for (String path : paths) 
		{
				int i = 0;
				try {
				    File pathToFile = new File(path);
				    this.images[i] = ImageIO.read(pathToFile);
				} catch (IOException ex) {
				    ex.printStackTrace();
				}	
		}
	}

	public void next() {this.state=(state+1)%images.length;}


	public Image getImage() {
		this.image=images[state];
		this.next();
		return this.image;
	}

		
	
	

}
