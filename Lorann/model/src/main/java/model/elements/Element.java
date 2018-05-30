package model.elements;

import java.util.Observable;

import model.Gif;
import model.IElements;
import model.Sprite;



public class Element extends Observable implements IElements {

	protected boolean permeable;
	protected Sprite sprite;
	public char charSprite;
	
	
	public char getCharSprite() {
		return charSprite;
	}



	public Element(String image){
	this.sprite = new Sprite(image);
	}
	
	public Element(String images[]){
		this.sprite = new Gif(images);
		}


	
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return sprite;
	}


	public boolean isPermeable() {
		return permeable;
	}

	
	
	
	
	
}
