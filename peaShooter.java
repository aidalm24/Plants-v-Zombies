import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peaShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peaShooter extends Actor
{
    /**
     * Act - do whatever the peaShooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int reloadTime=35;
    private int reloadDelay;
    public void act()
    {
        reloadDelay++;
        weapon();
    }
    public void weapon(){
        if(reloadDelay>=reloadTime){
                getWorld().addObject(new pea(),getX(),getY());
                reloadDelay = 0;
            }
    }
}
