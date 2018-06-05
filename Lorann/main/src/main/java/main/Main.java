package main;

import java.io.IOException;


import controller.LorannController;
import model.IModel;
import model.Model;

import view.Frame;

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
     *            the arguments
     * @throws InterruptedException 
     */
    public static void main(final String[] args) throws InterruptedException, IOException {
    	IModel model = new Model();
        final LorannController controller = new LorannController(new Frame(model), model);
        controller.play();
        
    }

}

