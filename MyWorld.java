import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private int score;
    private int wave;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        score = 0;
        wave = 0;
        showScore();
        showWave();
        
        peaShooter p1 = new peaShooter();
        p1.getImage().scale(58, 58);
        addObject(p1, 90, 340);
        
        
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(500) < 1)
        {
            zombie z = new zombie();
            z.getImage().scale(60, 80);
        
            addObject(z, 580, Greenfoot.getRandomNumber(4)*80+100);
        }
    }
    
    public void addScore(int points){
        score = score + points;
        showScore();
    }
    
    private void showScore(){
        showText("" + score, 30, 55);
    }
    
    private void showWave(){
        showText("Wave: " + wave, 500, 25);
    }
}
