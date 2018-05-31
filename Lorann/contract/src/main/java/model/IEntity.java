package model;

public interface IEntity extends IElement{
	public void move();
	public void moveUP();
	public void moveDOWN();
	public void moveRIGHT();
	public void moveLEFT();
	public void moveUP_RIGHT();
	public void moveUP_LEFT();
	public void moveDOWN_LEFT();
	public void moveDOWN_RIGHT();
	public int getX();
	public int getY();
}
