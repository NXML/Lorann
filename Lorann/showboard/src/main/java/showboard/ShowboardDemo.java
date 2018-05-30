package contrat.controller;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;


import javax.swing.SwingUtilities;






 
public class ShowboardDemo extends Observable implements Runnable, KeyListener {

    /** The Constant width of the board. */
    public static final int        width               = 21;

    /** The Constant height of the board. */
    public static final int        height              = 15;

    /** The road. */
    private IRoad            road;

    /** My vehicle. */
    private IMobile          myVehicle;
    
    /** The Constant timeLoop represents the time in millisecond for each loop. */
    private static final int       timeLoop            = 20;

    /** The Constant sizeFrameCloseView is the size of the view frames. */
    private static final int       sizeFrame           = 50;

    /** The Constant widthBetweenFrame. */
    private static final int       widthBetweenFrame   = 10;

    /** The Constant closeView is the cadre of the board displayed in the close view frame. */
    private static final Rectangle closeView           = new Rectangle(5, 5, width - 5, height - 5);

    /** The Constant closeView is the cadre of the board displayed in the close view frame. */
    private static final Rectangle fullView            = new Rectangle(0, 0, width, height);

    /** The Constant closeView is the cadre of the board displayed in the loop view frame. */
    private static final Rectangle loopView            = new Rectangle(3, 3, width, height);

    /** The Constant closeView is the cadre of the board displayed in the width loop view frame. */
    private static final Rectangle widthLoopView       = new Rectangle(3, 3, width, height);

    /** The Constant monstersNumber is the number of monsters instantiated on the board. */
    private static final int       monstersNumber      = 20;

    /**
     * The Constant imageMonstersNumber is the number of images used. All the images of monster have
     * to be named "Monster&lt;9&gt;.png"
     */
    private static final int       imageMonstersNumber = 4;

    private final List<Tile>   tile;
    
    /** The white tile. */
    private final Tile             whiteTile           = new Tile("lol.png");

    /** The black tile. */
    private final Tile             blackTile           = new Tile("pigeon.jpg");

    /** The light gray tile. */
    private final Tile             lightGrayTile       = new Tile("moi.jpg");

    /** The monsters. */
    
    //private final List<Monster>   monsters;

   
    
    
    
    public ShowboardDemo(final IRoad road, final IMobile myVehicle) throws IOException {
        super();
       final Random random = new Random();
      //  this.  whiteTile  .loadImage();
      //  this.  blackTile  .loadImage();
      // this.  lightGrayTile  .loadImage();
        this.tile = new ArrayList<Tile>();
      //   for (int i = 1; i <= monstersNumber; i++) {b
     //  	 final Monster monster = new Monster("Monster" + ((i % imageMonstersNumber) + 1) + ".png");
    //    	 monster.loadImage();
   //      	 monster.setPosition(random.nextInt(width), random.nextInt(height));
  //  	 	 this.monsters.add(monster);
 //      }

       SwingUtilities.invokeLater(this);
    }

    
    
    @Override
    public final void run() {
        final BoardFrame frameCloseView = new BoardFrame("Close view");
     // boardFrame.setDimension(new Dimension(this.getRoad().getWidth(), this.getRoad().getHeight()));
        frameCloseView.setDimension(new Dimension(width, height));
        frameCloseView.setDisplayFrame(closeView);
        frameCloseView.setSize(sizeFrame, sizeFrame);
        frameCloseView.addKeyListener(this);

        this.frameConfigure(frameCloseView);
    
    }

  
    
    
    public final void move() throws InterruptedException {
     //   for (;;) {
       //     for (final Monster monster : this.monsters) {
         //       monster.move();
          //  }
            this.setChanged();
            this.notifyObservers();

            Thread.sleep(timeLoop);
        }
   // }

  
    
    
    public final void frameConfigure(final BoardFrame frame) {
        for (int x = 0; x < width; x++) {
           for (int y = 0; y < height; y++) {
               // if ((x == 0) || (x == (width - 1)) || (y == 0) || (y == (height - 1))) { //Fait la bordure extérieure droite et bas
                //	frame.addSquare(this.whiteTile, x, y);
                //    frame.addSquare(this.lightGrayTile, x, y);
               
                // else if (((x + y) % 2) == 0) {                                 //fait damier pair
            //   frame.addSquare(this.lightGrayTile, x, y);
                	  
                	  frame.addSquare(this.whiteTile, x, y );
           }
      //  } else {                                                       //fait damier autre
                		//frame.addSquare(this.blackTile, x, y);
                  //  frame.addSquare(this.blackTile, x, y);
          //    }
                	 
         //  }
        

       // for (final Monster monster : this.monsters) {
         //   frame.addPawn(monster);
       // }
    	
        this.addObserver(frame.getObserver());

        frame.setVisible(true);
    
        }
    }
    
    private static UserOrder keyCodeToUserOrder(final int keyCode) {
        UserOrder userOrder;
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                userOrder = UserOrder.RIGHT;
                break;
            case KeyEvent.VK_LEFT:
                userOrder = UserOrder.LEFT;
                break;
            case KeyEvent.VK_DOWN:
            	userOrder = UserOrder.DOWN;
            	break;
            case KeyEvent.VK_UP:
            	userOrder = UserOrder.UP;
            	break;
            case KeyEvent.VK_SPACE:
            	userOrder = UserOrder.MAGIC;
            	break;
            
            default:
                userOrder = UserOrder.NOP;
                break;
                
        }
        return userOrder;
    }
    
    public void keyTyped(final KeyEvent keyEvent) {
    	   try {
               this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
           } catch (final IOException exception) {
               exception.printStackTrace();
           }
    }

    private void setRoad(final IRoad road) throws IOException {
        this.road = road;
        for (int x = 0; x < this.getRoad().getWidth(); x++) {
            for (int y = 0; y < this.getRoad().getHeight(); y++) {
                this.getRoad().getOnTheRoadXY(x, y).getSprite().loadImage();
            }
        }
    }

}

