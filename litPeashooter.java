import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class litPeaflower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class litPeashooter extends Actor
{
    /**
     * Act - do whatever the litPeaflower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time=201;
    private int cooldown=200;
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world.getScore()<100){
            GreenfootImage i = new GreenfootImage("greyPeashooter.png");
            i.scale(55, 70);
            setImage(i);
        }
        if(Greenfoot.mouseClicked(this)&&world.getScore()>=100&&time>cooldown){
            
            world.addScore(-100);
            GreenfootImage img = new GreenfootImage("greyPeashooter.png");
            img.scale(55, 70);
            setImage(img);
            silhoutte_peashooter p = new silhoutte_peashooter();
            p.getImage().scale(58,58);
            getWorld().addObject(p,getX(),getY());
            world.setPeashooter(true);
            time=0;
        }
        
        
        if(time > cooldown && world.getScore()>=100){
                    GreenfootImage imag = new GreenfootImage("brightPeashooter.png");
                    imag.scale(55, 70);
                    setImage(imag);
                }
        time++;
    }
}
