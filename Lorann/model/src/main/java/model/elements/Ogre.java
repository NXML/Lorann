package model.elements;



import model.Map;

/**
 * <h1>The Class Ogre.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class Ogre extends Monster {
	
	/**
	 * The char sprite.
	 */
	public static char charSprite = '4';
	
	/**
	 * The image path.
	 */
	public static String imagePath = "monster_4.png";
	
	/**
	 * The movement vector.
	 */
	public int movementVector = 1;
	
	/**
	 * Instantiate a new ogre.
	 * 
	 * @param x
	 * 			x
	 * @param y
	 * 			y
	 * @param map
	 * 			the map
	 */
	public Ogre(int x, int y,  Map map) {
		super(x, y, imagePath, map);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.Entity#move()
	 */
	@Override
	public void move() {
		int xOffset =0;
		int yOffset =0;
		double minDistance=1000;
		
		for(int i=-1; i<=1; i++) {
			for(int j =-1; j<=1; j++) {
				double bufferedDistance=distance(this.x+i,this.y-j,map.getHero().getX(),map.getHero().getY());
					if(bufferedDistance<minDistance) {
						xOffset=i;
						yOffset=-j;
						minDistance=bufferedDistance;
					}
			}
		}

		if(canMoveTo(this.x+xOffset,this.y+yOffset)) {
			moveTo(this.x+xOffset,this.y+yOffset);
		}
	}
	
		
	
	
	private double distance(int entityX,int entityY,int entity2X,int entity2Y) {
		return java.lang.Math.sqrt(java.lang.Math.pow((entity2X-entityX),2)+java.lang.Math.pow((entityY-entity2Y),2));
	}

}