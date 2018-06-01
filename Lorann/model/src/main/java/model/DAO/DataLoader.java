package model.DAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ElementFactory;
import model.Map;
import model.elements.CristalBall;
import model.elements.Cross;
import model.elements.Demon;
import model.elements.Door;
import model.elements.HWall;
import model.elements.Hero;
import model.elements.Masked;
import model.elements.Ogre;
import model.elements.Purse;
import model.elements.VWall;
import model.elements.Zombie;
/**
 * <h1>The Class DataLoader.</h1>
 * 
 * @author Arthur-Michel 
 * @version 1.0
 */
public class DataLoader extends AbstractLoader{
	
	private final static String sqlGetMapByID ="{call FindMapByID(?)}";
	private Map map;
	private ElementFactory elementFactory;
	
	public DataLoader(Map map) {
		this.map=map;
		this.elementFactory = new ElementFactory(map);
		
	}
	
	/*
	 * <h2> Load elements from database<h2>
	 * using LoranBDDConnector
	 * 
	 * @Author Arthur Michel
	 * @param int MapID
	 * 
	 * 
	 * 
	 */
	public void setMapElementsByID(int ID) {
		final CallableStatement callStatement = prepareCall(sqlGetMapByID);
	     try {
			callStatement.setInt(1, ID);
			if (callStatement.execute()) {
				final ResultSet result = callStatement.getResultSet();
				if (result.first()) {
					do {
						model.elements.Element  Bufferelement = null;
						char Bufferchar = result.getString("CharSprite").charAt(0);
						if(Bufferchar == Cross.charSprite) {Bufferelement = elementFactory.getCross();}
						else if(Bufferchar == HWall.charSprite) {Bufferelement = elementFactory.gethWall();}
						else if(Bufferchar == VWall.charSprite) {Bufferelement = elementFactory.getvWall();}
						else {Bufferelement = elementFactory.getGround();}
						map.setElementXY(result.getInt("CoordX"), result.getInt("CoordY"), Bufferelement);
						}
						while(result.next());
					}
				result.close();
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * <h2> Load array from database<h2>
	 * using LoranBDDConnector
	 * 
	 * @Author Arthur Michel
	 * @param int MapID
	 * 
	 * 
	 * 
	 */
	
	public void setMapEntityByID(int ID){
		final CallableStatement callStatement = prepareCall(sqlGetMapByID);
	     try {
			callStatement.setInt(1, ID);
			if (callStatement.execute()) {
				final ResultSet result = callStatement.getResultSet();
				if (result.first()) {
					do {
						char Bufferchar = result.getString("CharSprite").charAt(0);
						if(Bufferchar == Purse.charSprite) {map.addEntity(new Purse(result.getInt("CoordX"), result.getInt("CoordY"),map));}
						if(Bufferchar == Door.charSprite) {map.addEntity(new Door(result.getInt("CoordX"), result.getInt("CoordY"),map));}
						if(Bufferchar == Demon.charSprite){map.addEntity(new Demon(result.getInt("CoordX"), result.getInt("CoordY"),map));}
						if(Bufferchar == Ogre.charSprite){map.addEntity(new Ogre(result.getInt("CoordX"), result.getInt("CoordY"),map));}
						if(Bufferchar == Masked.charSprite){map.addEntity(new Masked(result.getInt("CoordX"), result.getInt("CoordY"),map));}
						if(Bufferchar == Zombie.charSprite){map.addEntity(new Zombie(result.getInt("CoordX"), result.getInt("CoordY"),map));}
						if(Bufferchar == CristalBall.charSprite){map.addEntity(new CristalBall(result.getInt("CoordX"), result.getInt("CoordY"),map));}
					}
					while(result.next());
					
				
				
				}
				result.close();
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * <h2> Load hero from database<h2>
	 * using LoranBDDConnector
	 * 
	 * @Author Arthur Michel
	 * @param int MapID
	 * 
	 * 
	 * 
	 */
	
	public void setMapHeroByID(int ID){
		final CallableStatement callStatement = prepareCall(sqlGetMapByID);
	     try {
			callStatement.setInt(1, ID);
			if (callStatement.execute()) {
				final ResultSet result = callStatement.getResultSet();
				if (result.first()) {
					do {
						char Bufferchar = result.getString("CharSprite").charAt(0);
						if(Bufferchar == Hero.charSprite) {
							Hero BufferedHero= new Hero(result.getInt("CoordX"), result.getInt("CoordY"),map);
							map.addEntity(BufferedHero);
							map.setHero(BufferedHero);
						}
					}
					while(result.next());
					
				}
				result.close();
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
	
	
	
	
	/*
	 * Function that run all function for load Elements
	 * 
	 */
	
	
	public void load() {
		setMapElementsByID(map.getID());
		setMapEntityByID(map.getID());
		setMapHeroByID(map.getID());
	} 
	
	
	
	
	
	
	
	

}
