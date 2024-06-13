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
    private int reloadTime=80;
    private int reloadDelay;
    private int health=5;
    private int zombieTime=51;
    private int zombieCooldown=50;
    public void act()
    {
        reloadDelay++;
        weapon();
        zombieTime++;
        if(isTouching(zombie.class)&&zombieTime>zombieCooldown){
            health--;
            zombieTime=0;
        }
        if(health==0){
            getWorld().removeObject(this);
        }
    }
    public void weapon(){
        if(reloadDelay>=reloadTime){
                getWorld().addObject(new pea(),getX(),getY());
                reloadDelay = 0;
            }
    }
}
