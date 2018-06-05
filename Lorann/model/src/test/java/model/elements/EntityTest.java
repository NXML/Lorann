package model.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ISprite;
import model.Map;

/**
 * <h1>The Class EntityTest.</h1>
 * 
 * @author Loïc
 * @author Nicolas
 * @version 1.0
 * @see Entity
 */
public class EntityTest extends ElementTest {
	
	/** x. */
	private int X;
	
	/** y. */
	private int Y;
	
	/** The map. */
	private Map map;

	/**
	 * Set up the test configuration.
	 */
	@Before
	public void setUp() throws Exception {
		super.elementToTest = new Entity(10, 5, this.image, map);
		this.X = 5;
		this.Y = 20;
	}

	/**
	 * Test the method moveUP().
	 */
	@Test
	public void testMoveUP() {
		this.Y = this.Y + 1 ;
		final int expectedX = 5;
		final int expectedY = 21;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);

	}

	/**
	 * Test the method moveDOWN().
	 */
	@Test
	public void testMoveDOWN() {
		this.Y = this.Y - 1 ;
		final int expectedX = 5;
		final int expectedY = 19;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);
		
	}

	/**
	 * Test the method moveRIGHT().
	 */
	@Test
	public void testMoveRIGHT() {
		this.X = this.X + 1 ;
		final int expectedX = 6;
		final int expectedY = 20;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);

	}

	/**
	 * Test the method moveLEFT().
	 */
	@Test
	public void testMoveLEFT() {
		this.X = this.X - 1 ;
		final int expectedX = 4;
		final int expectedY = 20;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.elements.ElementTest#testGetSprite()
	 */
	@Override
	@Test
	public void testGetSprite() {
		ISprite expected = super.elementToTest.sprite;
		assertEquals(expected, super.elementToTest.getSprite());
		
	}

}
