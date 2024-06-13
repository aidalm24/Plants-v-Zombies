import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sun extends Actor
{
    /**
     * Act - do whatever the sun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+1);
        if(getY()==390){
            getWorld().removeObject(this);
        }
        if(Greenfoot.mouseClicked(this)){
            MyWorld world = (MyWorld)getWorld();
            world.addScore(25);
            getWorld().removeObject(this);
        }
    }
}
