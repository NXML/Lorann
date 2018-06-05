package model.elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.ElementFactory;

public class PurseTest {
	
	/**
	 * <h1>The Class ElementFactoryTest.</h1>
	 * 
	 * @author Nicolas
	 * @version 1.0
	 * @see ElementFactory
	 */
	
	
	/** The value */
	private int value;
	
	/** The purse for the test */
	private Purse purse;

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
		this.purse = new Purse(value, value, null);
		this.value = 100;
	}

	@After
	public void tearDown() throws Exception {
	}

	
	/**
	 * 
	 * Test of the getValue method
	 * 
	 */
	@Test
	public void testGetValue() {
		final int expected = 100;
		assertEquals(expected, purse.getValue());
	}

}
