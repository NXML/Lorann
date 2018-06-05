package view;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Class FrameTest.</h1>
 * 
 * @author Nicolas
 * @version 1.0
 * @see Frame
 */
public class FrameTest {
	
	/**	The width .*/
	private int width;
	
	/**	The height. */
	private int height;
	
	/**	The key code. */
	private int keyCode;
	
	/** The message. */
	private String message;

	/**
	 * Set up the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		this.width = 10;
		this.height = 5;
		this.keyCode = 5;
		this.message = "Hello";
		
	}

	/**
	 * Test of the method getWidth().
	 */
	@Test
	public void testGetWidth() {
		final int expected = 10;
		assertEquals(expected, this.width);
		
	}
	
	/**
	 * Test of the method getHeight().
	 */ 
	@Test
	public void testGetHeight() {
		final int expected = 5;
		assertEquals(expected, this.height);

	}

	/**
	 * Test of the method displayMessage().
	 */
	@Test
	public void testDisplayMessage() {
		final String expected = "Hello";
		assertEquals(expected, this.message);
	}

}
