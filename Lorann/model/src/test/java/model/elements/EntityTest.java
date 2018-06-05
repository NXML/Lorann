package model.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ISprite;
import model.Map;

public class EntityTest extends ElementTest {
	
	/** The map. */
	private Map map;

	/*
	 * (non-Javadoc)
	 * @see model.elements.ElementTest#setUp()
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.elementToTest = new Entity(1, 1, this.image, map);
		
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
