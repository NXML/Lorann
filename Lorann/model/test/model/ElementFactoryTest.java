package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.elements.Element;

/**
 * <h1>The Class ElementFactoryTest.</h1>
 * 
 * @author Loïc
 * @version 1.0
 * @see ElementFactory
 */
public class ElementFactoryTest {
	
	/** The element factory to test. */
	private ElementFactory elementFactoryToTest;
	
	/** The map. */
	private Map map;
	
	/**
	 * Set up the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		elementFactoryToTest = new ElementFactory(map);
		
	}

	/**
	 * The test of the method getVWall().
	 */
	@Test
	public void testGetVWall() {
		Element expected = this.elementFactoryToTest.vWall;
		assertEquals(expected, this.elementFactoryToTest.getVWall());
		
	}

	/**
	 * The test of the method getHWall().
	 */
	@Test
	public void testGetHWall() {
		Element expected = this.elementFactoryToTest.hWall;
		assertEquals(expected, this.elementFactoryToTest.getHWall());
		
	}

	/**
	 * The test of the method getCross().
	 */
	@Test
	public void testGetCross() {
		Element expected = this.elementFactoryToTest.cross;
		assertEquals(expected, this.elementFactoryToTest.getCross());
		
	}

	/**
	 * The test of the method getGround().
	 */
	@Test
	public void testGetGround() {
		Element expected = this.elementFactoryToTest.ground;
		assertEquals(expected, this.elementFactoryToTest.getGround());
		
	}

}
