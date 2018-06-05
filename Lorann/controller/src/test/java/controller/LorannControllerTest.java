package controller;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IModel;
import view.IView;

/**
 * <h1>The Class LorannControllerTest.</h1>
 * 
 * @author Loïc
 * @version 1.0
 * @see LorannController
 */
public class LorannControllerTest {
	
	/** The Lorann controller to test. */
	private LorannController controllerToTest;
	
	/** The view to test. */ 
	private IView viewToTest;
	
	/** The model to test. */
	private IModel modelToTest;
	
	/** The user order to test. */
	private UserOrder userOrderToTest;
	
	Method m = LorannController.class.getDeclaredMethod("getUserOrder");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		controllerToTest = new LorannController(viewToTest, modelToTest);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlay() {
		fail("Not yet implemented");
	}

	@Test
	public void testOrderPerform() {
		UserOrder expected = this.userOrderToTest.MAGIC;
		this.controllerToTest.orderPerform(UserOrder.MAGIC);
		assertEquals(expected, this.controllerToTest.getOrderPerformer());
		
	}

}
