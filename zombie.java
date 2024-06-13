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
    MyWorld world = (MyWorld)getWorld();
    private int health=5;
    public void act()
    {
        if(!(isTouching(sunFlower.class)||isTouching(peaShooter.class)||isTouching(nut.class)||isTouching(repeater.class))){
            setLocation(getX()-1, getY());
        }
        if(isTouching(pea.class)){
            removeTouching(pea.class);
            health--;
        }
        
        if(getX()<10){
            getWorld().showText("You lost!",300,190);
            getWorld().showText("You died at wave "+(world.getWave()+1)+"!",300,210);
            Greenfoot.stop();
        }
        
        if(health==0){
            
            getWorld().removeObject(this);
        }
        
    }
    
    
}
