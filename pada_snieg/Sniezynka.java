import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sniezynka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
public class Sniezynka extends Actor
{
    public Sniezynka() {
        super();
        getImage().scale(50, 50);
    }
    
    /**
     * Act - do whatever the Sniezynka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        y++;
        setLocation(x, y);
        int h = getWorld().getHeight();
        if( y > h - 5) getWorld().removeObject( this );
    }    
}
