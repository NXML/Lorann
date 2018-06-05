package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IModel;

public class FrameTest {
	
	/**	 The width	 */
	private int width;
	
	/**	 The height	 */
	private int height;
	
	/**	 The keyCode	 */
	private int keyCode;
	
	/**	 The message	 */
	private String message;
	
	/** The Frame to test. */
	private Frame frame;
	
	private int X;
	
	private int Y;
	
	private int userorder;

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
		this.width = 10;
		this.height = 5;
		this.keyCode = 5;
		this.message = "Hello";
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	/**
	 * 
	 * Test of the getWidth method
	 * 
	 */
	@Test
	public void testGetWidth() {
		final int expected = 10;
		assertEquals(expected, this.width);
	}
	

/**
 * 
 * Test of the getHeight method
 * 
 */


	@Test
	public void testGetHeight() {
		final int expected = 5;
		assertEquals(expected, this.height);

	}


/**
 * 
 * Test of the DisplayMessage method
 * 
 */


	@Test
	public void testDisplayMessage() {
		final String expected = "Hello";
		assertEquals(expected, this.message);
	}




}
