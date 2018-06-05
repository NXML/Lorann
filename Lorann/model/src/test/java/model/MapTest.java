package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <h1>The Class MapTest.</h1>
 * 
 * @author Loïc
 * @version 1.0
 * @see Map
 */
public class MapTest {
	
	/** The map to test. */
	private Map mapToTest;
	
	/** The entities. */
	private ArrayList<IEntity> entities = new ArrayList<IEntity>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.mapToTest = new Map();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddEntity() {
		ArrayList<IEntity> expected = entities;
		this.entities.removeAll(entities);
		assertEquals(expected, this.mapToTest.getEntities());
		
	}

	@Test
	public void testRemoveEntity() {
		fail("Not yet implemented");
	}

}
