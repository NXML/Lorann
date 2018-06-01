package model;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Gif extends Sprite{
	private Image images[] = new Image[8];
	private int state = 0;
	private int spritecount=0;

	/*
	 * <p> This class allow you to set multiple sprite to an element</p>
	 * 
	 * @param Table ofImage paths
	 * 
	 */
	public Gif(String paths[])  {
		super(paths[0]);
		for (String path : paths) 
		{
			spritecount++;
				int i = 0;
				try {
				    File pathToFile = new File("..\\model\\Sprite\\"+path);
				    this.images[i] = ImageIO.read(pathToFile);
				} catch (IOException ex) {
				    ex.printStackTrace();
				}	
				i++;
		}
	}
	/*
	 * Set the state of this sprite his next state
	 * @return void
	 */
	public void next() {this.state=(state+1)%spritecount;}
	/*
	 *Return the image at the current state of this sprite 
	 * 
	 */
	public Image getImage() {
		
		this.image=images[state];
		this.next();
		return this.image;
		
	}

		
	
	

}
