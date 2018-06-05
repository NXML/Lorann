package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IModel;

public class FrameTest {
	
	private int width;
	private int height;
	private int keyCode;
	private String message;
	private Frame frame;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.width = 10;
		this.height = 5;
		this.keyCode = 5;
		this.message = "Hello";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetWidth() {
		final int expected = 10;
		assertEquals(expected, this.width);
	}
	
	

	@Test
	public void testGetHeight() {
		final int expected = 5;
		assertEquals(expected, this.height);

	}






	@Test
	public void testDisplayMessage() {
		final String expected = "Hello";
		assertEquals(expected, this.message);
	}



}
