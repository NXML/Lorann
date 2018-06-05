package model.elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;

public class DoorTest {
	
	
	/**
	 * <h1>The Class ElementFactoryTest.</h1>
	 * 
	 * @author Nicolas
	 * @version 1.0
	 * @see ElementFactory
	 */
	
	/**	 The Door for the test 	 */
	private Door doorTest;
	
	/**	 The map for the test 	 */
	private Map map;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Set up the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		doorTest = new Door(1,1,map);
	}

	/**
	 * Test of the isOpen method
	 */
	@Test
	public void testIsOpen() {
		boolean expected = false;
		assertEquals(expected , this.doorTest.isOpen());
	}

	/**
	 * Test of the setOpen method
	 */
	@Test
	public void testSetOpen() {
		boolean expected =true;
		this.doorTest.setOpen(true);
		assertEquals(expected,true);
	}

}
