package model.elements;

import model.Map;
import model.Sprite;
/**
 * <h1>The Class Door.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Door extends Entity{
	public static char charSprite = 'Q';
	public static String imagePath = "gate_closed.png";
	public static String imagePath2 = "gate_open.png";
	private boolean open = false;

	public Door(int x , int y , Map map) {
		super(x, x, imagePath, map);
		// TODO Auto-generated constructor stub
	}

	

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		if(open) this.sprite = new Sprite(imagePath2);
		if(!open) this.sprite = new Sprite(imagePath);
		this.open = open;
	}
	
	
	
	

}
