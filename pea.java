import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pea extends Actor
{
    /**
     * Act - do whatever the pea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pea(){
        GreenfootImage img = new GreenfootImage("button-green.png");
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);
    }
    public void act()
    {
        setLocation(getX()+3, getY());
        if(getX()==594){
            getWorld().removeObject(this);
        }
    }
}
