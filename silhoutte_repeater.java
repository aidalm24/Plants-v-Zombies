import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class silhoutte_repeater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class silhoutte_repeater extends Actor
{
    /**
     * Act - do whatever the silhoutte_repeater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mseBtnDown;
    private int mseX, mseY;

    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mseBtnDown = Greenfoot.mouseClicked(null);
        if (mouse != null)
        {
            mseX = mouse.getX();
            mseY = mouse.getY();
        }
        // moving
        turnTowards(mseX, mseY);
        move(30);
        setRotation(0);
        if(mseBtnDown){
            getWorld().removeObject(this);
        }
    }
    
}
