package model;

import java.util.ArrayList;

public interface IMap {
	public IHero getHero();
	public ArrayList<IEntity> getEntity();
	public IElement getElementXY(int x , int y);
	public void addEntity(IEntity entity);
	public void removeEntity(IEntity entity);
	
}
