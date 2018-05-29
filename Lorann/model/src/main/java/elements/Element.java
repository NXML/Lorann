package elements;

import model.IElements;



public class Element implements IElements {

	protected boolean permeable;
	protected Sprite sprite;
	protected char charSprite;
	
	
	public char getCharSprite() {
		return charSprite;
	}



	public Element(String image){
	this.sprite = new Sprite(image);
	}


	
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return sprite;
	}


	public boolean isPermeable() {
		return permeable;
	}

	
	
	
	
	
}
