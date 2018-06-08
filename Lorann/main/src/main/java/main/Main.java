package main;

import java.io.IOException;


import controller.LorannController;
import model.IModel;
import model.Model;

import view.Frame;
import view.IView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author XForce Exia Strasbourg
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *          the arguments
     * @throws InterruptedException
     * 			Signals that an interrupted exception has occurred
     */
    public static void main(final String[] args) throws InterruptedException, IOException {
    	final IModel model = new Model();
    	final IView view = new Frame(model);
        final LorannController controller = new LorannController(view, model);
        view.setOrderPerformer(controller.getOrderPerformer());
        
        controller.play();
        
    }

}

