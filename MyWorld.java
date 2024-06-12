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
        addObject(p1, 35, 245);
        
        // Cards
        litSunflower sc = new litSunflower();
        sc.getImage().scale(55, 70);
        addObject(sc, 100, 27);
        litPeashooter pc = new litPeashooter();
        pc.getImage().scale(55, 70);
        addObject(pc, 160, 27);
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(500) < 4)
        {
            int row = (int)Greenfoot.getRandomNumber(3);
            zombie z = new zombie();
            z.getImage().scale(60, 80);
        
            if (row == 0) {
                addObject(z, 580, 145);
            }
            if (row == 1) {
                addObject(z, 580, 245);
            }
            if (row == 2) {
                addObject(z, 580, 345);
            }
        }
        
        if (Greenfoot.getRandomNumber(300) < 1){
            sun s = new sun();
            s.getImage().scale(60, 60);
            addObject(s, Greenfoot.getRandomNumber(600), 20);
        }
    }
    
    public void addScore(int points){
        score = score + points;
        showScore();
    }
    public int getScore(){
        return score;
    }
    private void showScore(){
        showText("" + score, 30, 55);
    }
    
    private void showWave(){
        showText("Wave: " + wave, 500, 25);
    }
}
