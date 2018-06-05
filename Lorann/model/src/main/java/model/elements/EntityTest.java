package model.elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IEntity;

public class EntityTest {
	
	
	private int X;
	private int Y;
	private Entity entity;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.X = 5 ;
		this.Y=20 ;
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
	}

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

	@Test
	public void testGetX() {
		final int expected = 5;
		assertEquals(expected, entity.getX());

	}

	@Test
	public void testGetY() {
		final int expected = 20;
		assertEquals(expected, entity.getY());

	}

}
