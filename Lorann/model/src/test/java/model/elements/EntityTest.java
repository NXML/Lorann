package model.elements;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.ISprite;
import model.Map;

public class EntityTest extends ElementTest {
	/** The entity for the test. */
	private Entity entity;
	
	private Map map;
	
	/**
	 * <h1>The Class ElementFactoryTest.</h1>
	 * 
	 * @author Nicolas
	 * @version 1.0
	 * @see ElementFactory
	 */
	
	private int X;
	
	private int Y;
	
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
		this.map=new Map();
		this.X=5;
		this.Y=20;
		this.entity=new Demon(5,20,map);
	}


	/**
	 * Test of the method moveUP().
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
	 * Test of the method moveDOWN ().
	 */
	@Test
	public void testMoveDOWN() {
		this.Y = this.Y - 1 ;
		final int expectedX = 5;
		final int expectedY = 19;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);
	};

	/**
	 * Test of the method moveRIGHT ().
	 */
	@Test
	public void testMoveRIGHT() {
		this.X = this.X + 1 ;
		final int expectedX = 6;
		final int expectedY = 20;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);
;
	}

	/**
	 * Test of the method moveLEFT ().
	 */
	@Test
	public void testMoveLEFT() {
		this.X = this.X - 1 ;
		final int expectedX = 4;
		final int expectedY = 20;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);
	}

	/**
	 * Test of the method getX ().
	 */
	@Test
	public void testGetX() {
		final int expected = 5;
		assertEquals(expected, entity.getX());

	}

	/**
	 * Test of the method getY ().
	 */
	@Test
	public void testGetY() {
		final int expected = 20;
		assertEquals(expected, entity.getY());

	}

}
