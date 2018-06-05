package model.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Map;

/**
 * <h1>The Class DoorTest.</h1>
 * 
 * @author Nicolas
 * @version 1.0
 * @see Door
 */
public class DoorTest {
	
	/**	The Door for the test. */
	private Door doorTest;
	
	/**	The map for the test. */
	private Map map;

	/**
	 * Set up the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		doorTest = new Door(1, 1, map);
		
	}

	/**
	 * Test of the method isOpen().
	 */
	@Test
	public void testIsOpen() {
		boolean expected = false;
		assertEquals(expected , this.doorTest.isOpen());
		
	}

	/**
	 * Test of the method setOpen().
	 */
	@Test
	public void testSetOpen() {
		boolean expected = true;
		this.doorTest.setOpen(true);
		assertEquals(expected, this.doorTest.isOpen());
		
	}

}
