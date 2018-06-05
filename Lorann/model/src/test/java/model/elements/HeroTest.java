package model.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Class HeroTest.</h1>
 * 
 * @author Nicolas
 * @version 1.0
 * @see Hero
 */
public class HeroTest {
	
	/**	The hero for the test. */
	private Hero hero;

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

	/**
	 * Test of the method canSpell().
	 */
	@Test
	public void testCanSpell() {
		final boolean expected = true;
		assertEquals(expected, hero.canSpell());
		
	}

	/**
	 * Test of the method setSpell().
	 */
	@Test
	public void testSetSpell() {
		final boolean expected = true;
		this.hero.setSpell(true);
		assertEquals(expected, hero.canSpell());

	}

	/**
	 * Test of the getScore method
	 */
	@Test
	public void testGetScore() {
		final int expected = 100;
		assertEquals(expected, hero.getScore());
	}

	/**
	 * Test of the method setScore().
	 */
	@Test
	public void testSetScore() {
		final int expected = 200;
		this.hero.setScore(200);
		assertEquals(expected, hero.getScore());
		
	}

	/**
	 * Test of the method isAlive().
	 */
	@Test
	public void testIsAlive() {
		final boolean expected = true;
		assertEquals(expected, hero.isAlive());
		
	}

	/**
	 * Test of the method setAlive().
	 */
	@Test
	public void testSetAlive() {
		final boolean expected = true;
		this.hero.setAlive(true);
		assertEquals(expected, hero.isAlive());
		
	}

	/**
	 * Test of the method isFinished().
	 */
	@Test
	public void testIsFinished() {
		final boolean expected = false;
		assertEquals(expected, hero.isFinished());
		
	}

}
