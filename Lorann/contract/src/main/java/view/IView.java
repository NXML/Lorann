package view;

import controller.UserOrder;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Nicolas
 * @author Riadjy
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    UserOrder getUserOrder();
}
