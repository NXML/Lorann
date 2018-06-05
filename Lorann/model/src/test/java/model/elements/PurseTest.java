package model.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Class PurseTest.</h1>
 * 
 * @author Nicolas
 * @version 1.0
 * @see Purse
 */
public class PurseTest {
	
	/** The value. */
	private int value;
	
	/** The purse for the test. */
	private Purse purse;

	/**
	 * Set up the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		this.purse = new Purse(value, value, null);
		this.value = 100;
		
	}

	/**
	 * Test of the method getValue().
	 */
	@Test
	public void testGetValue() {
		final int expected = 100;
		assertEquals(expected, purse.getValue());
		
	}

}
