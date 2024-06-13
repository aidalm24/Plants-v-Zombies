import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nut extends Actor
{
    /**
     * Act - do whatever the nut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world = (MyWorld)getWorld();
    private int health=15;
    private int zombieTime=21;
    private int zombieCooldown=20;
    public void act()
    {
        if(isTouching(zombie.class)&&zombieTime>zombieCooldown){
            health--;
            zombieTime=0;
        }
        if(health==0){
            getWorld().removeObject(this);
        }
    }
}
