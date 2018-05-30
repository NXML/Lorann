package model.elements;

import model.Map;
/**
 * <h1>The Class Purse.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Purse extends Item{
	
	public static char charSprite = '$';
	public static String imagePath = "purse.png";
	
	/*
	 * 
	 * Constructor using super constructor
	 */
	public Purse(int x, int y, Map map) {
		super(x, y, imagePath, map);
		// TODO Auto-generated constructor stub
	}
	

}
