package model.DAO;

import java.util.ArrayList;

import model.ElementFactory;
import model.Map;
import model.elements.Element;
import model.elements.Entity;

public class DataLoader {
	
	private final static String sqlGetMapByID ="{call FindMapByID(?)}";
	private Map map;
	private ElementFactory elementFactory;
	
	public DataLoader(Map map) {
		this.map=map;
		this.elementFactory = new ElementFactory(map);
		
	}
	
	
	public void setMapElementsByID(){};
	public void setMapEntityByID(){};	
	public void setMapHeroByID(){}


	public void load() {
		setMapElementsByID();
		setMapEntityByID();
		setMapHeroByID();
	} 
	
	
	
	
	
	
	
	

}
