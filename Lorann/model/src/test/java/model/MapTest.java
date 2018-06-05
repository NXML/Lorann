package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Class MapTest.</h1>
 * 
 * @author Riadjy
 * @version 1.0
 * @see Map
 */
public class MapTest {

	/** The ID. */
	private int ID;

	/**
	 * Set up of the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		this.ID = 5;
	}

	/**
	 * Test of the throw of an exception when the setter of the ID set an invalid value.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Test
	public void setID() throws Exception {
		try {
			if(this.ID > 5) {
				fail("Should throw exception when Map > 5");
				
			}
		} catch (final Exception e) {
			assertEquals("Map out of range", e.getMessage());
			
		}
		
	}
	
}
