package model.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ISprite;

/**
 * <h1>The Class ElementTest.</h1>
 * 
 * @author Loïc
 * @version 1.0
 * @see Element
 */
public class ElementTest {
	
	/** The element to test. */
	protected Element elementToTest;
	
	/** The image. */
	protected String image = "0.png";

	/**
	 * Set up the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		elementToTest = new Element(image);
		
	}

	/**
	 * Test of the method getSprite(). 
	 */
	@Test
	public void testGetSprite() {
		ISprite expected = this.elementToTest.sprite;
		assertEquals(expected, this.elementToTest.getSprite());
		
	}



}
