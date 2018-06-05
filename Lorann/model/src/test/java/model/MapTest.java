package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	private int ID;

	@Before
	public void setUp() throws Exception {
		this.ID = 5;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void setID() throws Exception {
		try {
			if(this.ID > 5) {
				fail("Should throw exception when Map > 5");
			}
		} catch (final Exception e) {
			assertEquals("Map out of range", e.getMessage());
		}
	}
}
