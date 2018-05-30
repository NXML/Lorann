package model.elements;

import java.util.Observable;

import model.Gif;
import model.IElements;
import model.Sprite;


/**
 * <h1>The Class Element.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Element extends Observable implements IElements {

	protected boolean permeable;
	protected Sprite sprite;

	/*
	 * 
	 * Constructor Element using a path to an image
	 * 
	 */
	public Element(String image){
	this.sprite = new Sprite(image);
	}
	/*
	 * 
	 * Overloading Constructor to make an element with many sprites
	 * 
	 */
	public Element(String images[]){
		this.sprite = new Gif(images);
		}


	
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return sprite;
	}

	/*
	 * Return permeability of an element
	 * @return Bolean Permeability
	 * 
	 */
	public boolean isPermeable() {
		return permeable;
	}

	
	
	
	
	
}
