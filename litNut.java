import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class litPeaflower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class litNut extends Actor
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
        if(Greenfoot.mouseClicked(this)&&world.getScore()>=50&&time>cooldown){
            
            world.addScore(-50);
            GreenfootImage img = new GreenfootImage("greyNut.png");
            img.scale(55, 70);
            setImage(img);
            silhoutte_nut n = new silhoutte_nut();
            n.getImage().scale(70,75);
            getWorld().addObject(n,getX(),getY());
            world.setNut(true);
            time=0;
        }
        
        
        if(time > cooldown && world.getScore()>=50){
                    GreenfootImage imag = new GreenfootImage("brightNut.png");
                    imag.scale(55, 70);
                    setImage(imag);
                }
        time++;
    }
}
