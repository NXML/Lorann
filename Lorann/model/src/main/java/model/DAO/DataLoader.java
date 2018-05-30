package model.DAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ElementFactory;
import model.Map;
import model.elements.Cross;
import model.elements.Demon;
import model.elements.Element;
import model.elements.Entity;
import model.elements.Ground;
import model.elements.HWall;
import model.elements.Purse;
import model.elements.VWall;

public class DataLoader extends AbstractLoader{
	
	private final static String sqlGetMapByID ="{call FindMapByID(?)}";
	private Map map;
	private ElementFactory elementFactory;
	
	public DataLoader(Map map) {
		this.map=map;
		this.elementFactory = new ElementFactory(map);
		
	}
	
	
	public void setMapElementsByID(int ID) {
		final CallableStatement callStatement = prepareCall(sqlGetMapByID);
	     try {
			callStatement.setInt(1, ID);
			if (callStatement.execute()) {
				final ResultSet result = callStatement.getResultSet();
				if (result.first()) {
					model.elements.Element  Bufferelement = null;
					char Bufferchar = result.getString("CharSprite").charAt(0);
					if(Bufferchar == Cross.charSprite) {Bufferelement = elementFactory.getCross();}
					else if(Bufferchar == HWall.charSprite) {Bufferelement = elementFactory.gethWall();}
					else if(Bufferchar == VWall.charSprite) {Bufferelement = elementFactory.getvWall();}
					else {Bufferelement = elementFactory.getGround();}
					map.setElementXY(result.getInt("CoordX"), result.getInt("CoordY"), Bufferelement);
					result.next();
					}
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public void setMapEntityByID(int ID){
		final CallableStatement callStatement = prepareCall(sqlGetMapByID);
	     try {
			callStatement.setInt(1, ID);
			if (callStatement.execute()) {
				final ResultSet result = callStatement.getResultSet();
				if (result.first()) {
					
					char Bufferchar = result.getString("CharSprite").charAt(0);
					
					
					if(Bufferchar == Purse.charSprite) {map.addEntity(new Purse(result.getInt("CoordX"), result.getInt("CoordY"),map));}
					
					
					
					
					
		
					result.next();
					}
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	public void setMapHeroByID(int ID){}


	
	
	
	
	
	
	
	
	public void load() {
		setMapElementsByID(map.getID());
		setMapEntityByID(map.getID());
		setMapHeroByID(map.getID());
	} 
	
	
	
	
	
	
	
	

}
