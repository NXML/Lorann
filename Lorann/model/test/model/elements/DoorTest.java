package model.elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import model.Map;
/**
 * <h1>The Class DoorTest.</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 * @see Entity
 */
public class DoorTest {
	/** The Door*/
	private Door doorTest;
	/** The map*/
	private Map map;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		doorTest = new Door(1,1,map);
	}

	@After
	public void tearDown() throws Exception {
	}
	/** door test is open*/
	@Test
	public void testIsOpen() {
		boolean expected = false;
		assertEquals(expected , this.doorTest.isOpen());
	}
	/** Test of door set open*/
	@Test
	public void testSetOpen() {
		boolean expected =true;
		this.doorTest.setOpen(true);
		assertEquals(expected,true);
	}

}
