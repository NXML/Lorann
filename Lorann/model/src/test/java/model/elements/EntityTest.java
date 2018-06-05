package model.elements;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.ISprite;
import model.Map;

public class EntityTest extends ElementTest {
	
	private int X;
	private int Y;
	private Map map;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		super.elementToTest = new Entity(10, 5, this.image, map);
		this.X = 5;
		this.Y = 20;
	}


	@Test
	public void testMoveUP() {
		this.Y = this.Y + 1 ;
		final int expectedX = 5;
		final int expectedY = 21;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);

	}

	@Test
	public void testMoveDOWN() {
		this.Y = this.Y - 1 ;
		final int expectedX = 5;
		final int expectedY = 19;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);
	};

	@Test
	public void testMoveRIGHT() {
		this.X = this.X + 1 ;
		final int expectedX = 6;
		final int expectedY = 20;
		assertEquals(expectedX, this.X);
		assertEquals(expectedY, this.Y);
;
	}

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
