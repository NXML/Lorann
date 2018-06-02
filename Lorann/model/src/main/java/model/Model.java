package model;

/**
 * <h1>The Class Model.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see IModel
 */
public class Model implements IModel {
	
	/**
	 * The map.
	 */
	private IMap map;
	
	/**
	 * Instantiate a new model.
	 */
	public Model() {
		this.map = new Map();
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#getMap()
	 */
	@Override
	public IMap getMap() {
		return map;
		
	}
	
}
