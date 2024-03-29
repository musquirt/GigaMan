package com.engine.core;

import java.awt.*;
import javax.swing.ImageIcon;

import com.engine.graphics.ScreenManager;

/**
    Simple abstract class. Subclasses must
    implement the draw() method.
*/
public abstract class GameCore {

    protected static final int FONT_SIZE = 24;

    private static final DisplayMode POSSIBLE_MODES[] = {
        new DisplayMode(800, 600, 32, 0),
        new DisplayMode(800, 600, 24, 0),
        new DisplayMode(800, 600, 16, 0),
        new DisplayMode(640, 480, 32, 0),
        new DisplayMode(640, 480, 24, 0),
        new DisplayMode(640, 480, 16, 0)
    };

    private boolean isRunning;
    protected ScreenManager screen;


    /**
        Signals the game loop that it's time to quit
    */
    public void stop() {
        isRunning = false;
    }


    /**
        Calls init() and gameLoop()
    */
    public void run() {
        try {
            init();
            gameLoop();
        } catch(Exception e) {
        	System.out.println("ERROR:: Unknown error");
        } finally {
            screen.restoreScreen();
        }
    }


    /**
        Sets full screen mode and initiates and objects.
    */
    public void init() {
        screen = new ScreenManager();
        DisplayMode displayMode =
            screen.findFirstCompatibleMode(POSSIBLE_MODES);
        screen.setFullScreen(displayMode);

        Window window = screen.getFullScreenWindow();
        window.setFont(new Font("Dialog", Font.PLAIN, FONT_SIZE));
        window.setBackground(Color.black);
        window.setForeground(Color.white);

        isRunning = true;
    }


    public Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }


    /**
        Runs through the game loop until stop() is called.
    */
    public void gameLoop() {
        long curTime = System.currentTimeMillis();

        while (isRunning) {
            long elapsedTime =
                System.currentTimeMillis() - curTime;
            curTime += elapsedTime;

            // update
            update(elapsedTime);

            // draw the screen
            Graphics2D g = screen.getGraphics();
            draw(g);
            g.dispose();
            screen.update();

            try {
                Thread.sleep(15);
            }
            catch (InterruptedException ex) { }
        }
    }


    /**
        Updates the state of the game/animation based on the
        amount of elapsed time that has passed.
    */
    public void update(long elapsedTime) {
        // do nothing
    }


    /**
        Draws to the screen. Subclasses must override this method
    */
    public abstract void draw(Graphics2D g);
}
