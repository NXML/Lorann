package model.elements;

public class Door extends MotionlessElement{
	public static char charSprite = 'Q';
	public static String imagePath = "Door_Open.png";
	private boolean open = false;

	public Door(String image) {
		super(image);
		// TODO Auto-generated constructor stub
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	
	
	
	

}
