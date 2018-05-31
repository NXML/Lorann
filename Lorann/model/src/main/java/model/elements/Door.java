package model.elements;

import model.Map;
/**
 * <h1>The Class Door.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Door extends Entity{
	public static char charSprite = 'Q';
	public static String imagePath = "gate_closed.png";
	private boolean open = false;

	public Door(int x , int y , Map map) {
		super(x, x, imagePath, map);
		// TODO Auto-generated constructor stub
	}

	

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	
	
	
	

}
