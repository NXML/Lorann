package model.elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PurseTest {
	
	private int value;
	private Purse purse;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.purse = new Purse(value, value, null);
		this.value = 100;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetValue() {
		final int expected = 100;
		assertEquals(expected, purse.getValue());
	}

}
