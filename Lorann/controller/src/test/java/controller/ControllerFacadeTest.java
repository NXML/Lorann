package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IModel;
import view.IView;

public class ControllerFacadeTest {
	private ControllerFacade controllerFacade;
	private IView view;
	private IModel model;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		controllerFacade = new ControllerFacade(view, model);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetView() {
		final IView expected = view;
		assertEquals(expected, this.controllerFacade.getView());
		
	}

	@Test
	public void testGetModel() {
		final IModel expected = model;
		assertEquals(expected, this.controllerFacade.getModel());
		
	}
	
	@Test
	public void testGetOrderPerformer() {
		final IOrderPerformer expected = null;
		assertEquals(expected, this.controllerFacade.getOrderPerformer());
		
	}

}
