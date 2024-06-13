import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class litPeaflower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class litRepeater extends Actor
{
    /**
     * Act - do whatever the litPeaflower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time=301;
    private int cooldown=300;
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world.getScore()<200){
            GreenfootImage i = new GreenfootImage("greyRepeater.png");
            i.scale(55, 70);
            setImage(i);
        }
        if(Greenfoot.mouseClicked(this)&&world.getScore()>=200&&time>cooldown){
            
            world.addScore(-200);
            GreenfootImage img = new GreenfootImage("greyRepeater.png");
            img.scale(55, 70);
            setImage(img);
            silhoutte_repeater r = new silhoutte_repeater();
            r.getImage().scale(58,58);
            getWorld().addObject(r,getX(),getY());
            world.setRepeater(true);
            time=0;
        }
        
        
        if(time > cooldown && world.getScore()>=200){
                    GreenfootImage imag = new GreenfootImage("brightRepeater.png");
                    imag.scale(55, 70);
                    setImage(imag);
                }
        time++;
    }
}
