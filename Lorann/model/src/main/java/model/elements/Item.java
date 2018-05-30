package model.elements;

import model.Map;

public abstract class Item extends Entity{

	public Item(int x, int y, String image, Map map) {
		super(x, y, image, map);
		// TODO Auto-generated constructor stub
	}
	
	public Item(int x, int y, String images[], Map map) {
		super(x, y, images, map);
		// TODO Auto-generated constructor stub
	}

}
