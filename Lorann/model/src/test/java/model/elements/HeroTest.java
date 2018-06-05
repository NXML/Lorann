package model.elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HeroTest {
	
	/**	 The Hero for the test 	 */
	private Hero hero;

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
		
		this.hero = new Hero(0, 0, null);
		hero.setAlive(true);
		hero.setScore(100);
		
	}

	@After
	public void tearDown() throws Exception {
	}


	/**
	 * Test of the canSpell method
	 */
	@Test
	public void testCanSpell() {
		final boolean expected = true;
		assertEquals(expected , hero.canSpell());
	}

	/**
	 * Test of the setSpell method
	 */
	@Test
	public void testSetSpell() {
		final boolean expected = true;
		this.hero.setSpell(true);
		assertEquals(expected , hero.canSpell());

	}

	
	/**
	 * Test of the getScore method
	 */
	@Test
	public void testGetScore() {
		final int expected = 100;
		assertEquals(expected , hero.getScore());
	}

	
	/**
	 * Test of the setScore method
	 */
	@Test
	public void testSetScore() {
		final int expected = 200;
		this.hero.setScore(200);
		assertEquals(expected , hero.getScore());
	}

	
	/**
	 * Test of the isAlive method
	 */
	@Test
	public void testIsAlive() {
		final boolean expected = true;
		assertEquals(expected , hero.isAlive());
	}

	/**
	 * Test of the setAlive method
	 */
	
	@Test
	public void testSetAlive() {
		final boolean expected = true;
		this.hero.setAlive(true);
		assertEquals(expected, hero.isAlive());
	}

	
	/**
	 * Test of the isFinished method
	 */

	@Test
	public void testIsFinished() {
		final boolean expected = false;
		assertEquals(expected, hero.isFinished());
	}

}
