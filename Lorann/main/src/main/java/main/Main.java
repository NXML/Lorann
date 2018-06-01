package main;

import java.io.IOException;

import ShowBoard.ShowboardDemo;
import controller.LorannController;
import model.Model;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
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
        final LorannController controller = new LorannController(new ViewFacade(), new Model());
        final ShowboardDemo pepsi = new ShowboardDemo();//
        controller.play();
        
    }

}

