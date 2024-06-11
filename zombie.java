import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombie extends Actor
{
    /**
     * Act - do whatever the zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int health=5;
    public void act()
    {
        setLocation(getX()-1, getY());
        if(isTouching(pea.class)){
            removeTouching(pea.class);
            health--;
        }
        if(health==0){
            getWorld().removeObject(this);
        }
    }
    
    
}
