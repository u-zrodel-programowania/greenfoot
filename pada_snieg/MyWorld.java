import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);  // kaczka
    }

    public void act() {
        int los = Greenfoot.getRandomNumber( 100 ); // 0..99
        if( los < 3 ) {
            Sniezynka s = new Sniezynka();
            int w = getWidth();
            int x = Greenfoot.getRandomNumber( w );
            addObject(s, x, 0);
        }
    }
}
