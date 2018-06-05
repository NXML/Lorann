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
	public void testSetWidth() {
		frame.setWidth(10);
		int expected = frame.getWidth();
		assertEquals(expected, this.width);
	}

	@Test
	public void testGetHeight() {
		final int expected = 5;
		assertEquals(expected, this.height);

	}

	@Test
	public void testRepaint() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyPressed() {
		//final KeyEvent keyEvent = null;
		//keyEvent.setKeyCode(5);
		//assertEquals(keyEvent.getKeyCode(), keyCode);
		fail("Not yet implemented");

	}

	@Test
	public void testKeyReleasedInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyTyped() {
		fail("Not yet implemented");
	}




	@Test
	public void testDisplayMessage() {
		final String expected = "Hello";
		assertEquals(expected, this.message);
	}

	@Test
	public void testKeyReleasedKeyEvent() {
		fail("Not yet implemented");
	}

}
