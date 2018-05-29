package elements;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Gif extends Sprite{
	private Image images[];
	
	
	
	
	Gif(String startImage , String paths[]) {
		super(startImage);
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




	public Image[] getImages() {
		return images;
	}

		
	
	

}
