package model;

public class Model implements IModel{
private IMap map;
/*
 * <h2>Constructor of the model<h2>
 * 
 * instentiate a new Map
 */
public Model() {
	this.map=new Map();
}
/*
 * Function that return this model's map
 * @return map
 */
@Override
public IMap getMap() {
	return map;
}

	
	
	
}
