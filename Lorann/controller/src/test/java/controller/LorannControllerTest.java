package controller;

import static org.junit.Assert.*;

import org.junit.Before;
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
	
	/** The view. */
	private IView view;
	
	/** The model. */
	private IModel model;

	/**
	 * Set up the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		controllerToTest = new LorannController(view, model);
	}

	/**
	 * The test of the method getModel().
	 */
	@Test
	public void testGetModel() {
		IModel expected = model;
		assertEquals(expected, this.controllerToTest.getModel());
		
	}

}
