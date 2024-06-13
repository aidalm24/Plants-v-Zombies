import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sunFlower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sunFlower extends Actor
{
    /**
     * Act - do whatever the sunFlower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world = (MyWorld)getWorld();
    private int health=5;
    private int zombieTime=21;
    private int zombieCooldown=20;
    public void act()
    {
        zombieTime++;
        if(Greenfoot.getRandomNumber(200)<1){
            sun s = new sun();
            s.getImage().scale(60, 60);
            getWorld().addObject(s, getX(), getY());
            zombieTime++;
        }
        
        if(isTouching(zombie.class)&&zombieTime>zombieCooldown){
            health--;
            zombieTime=0;
        }
        if(health==0){
            getWorld().removeObject(this);
        }
    }
}
