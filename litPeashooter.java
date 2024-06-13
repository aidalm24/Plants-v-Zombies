import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class litPeaShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class litPeashooter extends Actor
{
    /**
     * Act - do whatever the litPeaShooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time=1001;
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        if(Greenfoot.mouseClicked(this)){
            world.addScore(-100);
            GreenfootImage img = new GreenfootImage("greysun.png");
            img.scale(img.getWidth()/10, img.getHeight()/11);
            setImage(img);
            time=0;
            
            addNewShooter();
        }
        
        
        if(time > 1000 && world.getScore()>=100){
            GreenfootImage imag = new GreenfootImage("brightsun.png");
            imag.scale(imag.getWidth()/10, imag.getHeight()/11);
            setImage(imag);
        }
        time++;
    }
    
    public void addNewShooter() {
        peaShooter p = new peaShooter();
        p.getImage().scale(58, 58);
        getWorld().addObject(p, 35, 145);
    }
}
