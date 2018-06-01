package controller;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IHero;
import model.IModel;
import view.IView;

public class LorannControllerTest {
	private LorannController lorannController;
	private IView view;
	private IModel model;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lorannController = new LorannController(view, model);
		
	}
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@After
	public void restoreStreams() {
		System.setOut(System.out);
		
	}

	@Test
	public void testPlayGameOver() throws InterruptedException {
		this.model.getMap().getHero().setAlive(false);
		this.lorannController.play();
		assertEquals("Game Over", outContent.toString());
		
	}
	
	@Test
	public void testLaunchFireball() {
		fail("Not yet implemented");
		
	}

}
