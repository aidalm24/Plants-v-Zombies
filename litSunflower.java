import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class litSunflower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class litSunflower extends Actor
{
    /**
     * Act - do whatever the litSunflower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time=101;
    private int cooldown=100;
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world.getScore()<50){
            GreenfootImage i = new GreenfootImage("greysun.png");
            i.scale(55, 70);
            setImage(i);
        }
        if(Greenfoot.mouseClicked(this)&&world.getScore()>=50&&time>cooldown){
            
            world.addScore(-50);
            GreenfootImage img = new GreenfootImage("greysun.png");
            img.scale(img.getWidth()/10, img.getHeight()/11);
            setImage(img);
            silhoutte_sunflower s = new silhoutte_sunflower();
            s.getImage().scale(50,50);
            getWorld().addObject(s,getX(),getY());
            world.setSunflower(true);
            time=0;
        }
        
        if(world.getScore()<50){
            GreenfootImage i = new GreenfootImage("greySunflower.png");
            i.scale(55, 70);
            setImage(i);
        }
        if(time > cooldown && world.getScore()>=50){
                    GreenfootImage imag = new GreenfootImage("brightsun.png");
                    imag.scale(imag.getWidth()/10, imag.getHeight()/11);
                    setImage(imag);
                }
        time++;
    }
}
