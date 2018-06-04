package model.elements;

import java.util.Observable;

import model.Gif;
import model.IElement;
import model.ISprite;
import model.Sprite;


/**
 * <h1>The Class Element.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 * @see IElement
 */
public class Element extends Observable implements IElement {

	/**
	 * The permeable.
	 */
	protected boolean permeable;
	
	/**
	 * The sprite.
	 */
	protected ISprite sprite;

	/**
	 * Instantiate a new element with an image.
	 * 
	 * @param image
	 * 			the image
	 */
	public Element(String image) {
		this.sprite = new Sprite(image);
	
	}
	
	/**
	 * Instantiate a new element with images.
	 * 
	 * @param images
	 * 			the table of images
	 */
	public Element(String images[]) {
		this.sprite = new Gif(images);
	}

	/*
	 * (non-Javadoc)
	 * @see model.IElement#getSprite()
	 */
	@Override
	public ISprite getSprite() {
		return sprite;
		
	}

	/*
	 * (non-Javadoc)
	 * @see model.IElement#isPermeable()
	 */
	@Override
	public boolean isPermeable() {
		return permeable;
		
	}
	
}
