package model.elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
	private Element elementToTest;
	
	/** The image. */
	private String image;
	
	/** The sprite. */
	private ISprite sprite;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		elementToTest = new Element(image);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSprite() {
		ISprite expected = sprite;
		assertEquals(expected, this.elementToTest.getSprite());
		
	}

}
