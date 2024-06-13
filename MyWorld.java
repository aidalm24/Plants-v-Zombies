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
    private boolean putSunflower=false;
    private boolean putPeashooter = false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        score = 0;
        wave = 0;
        showScore();
        showWave();
        
        // Cards
        litSunflower sc = new litSunflower();
        sc.getImage().scale(55, 70);
        addObject(sc, 100, 27);
        
        litPeashooter pc = new litPeashooter();
        pc.getImage().scale(55, 70);
        addObject(pc, 180, 27);
    
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.getRandomNumber(800) < 1)
        {
            zombie z = new zombie();
            z.getImage().scale(60, 80);
        
            addObject(z, 580, Greenfoot.getRandomNumber(4)*80+100);
        }
        
        if (Greenfoot.getRandomNumber(1000) < 1){
            sun s = new sun();
            s.getImage().scale(60, 60);
            addObject(s, Greenfoot.getRandomNumber(600), 20);
        }
        
        if(putPeashooter&&mouse!=null){
            if(Greenfoot.mouseClicked(null)){
                int newX = (mouse.getX()-50)/70;
                int newY = (mouse.getY()-60)/80;
                
                peaShooter p = new peaShooter();
                p.getImage().scale(58,58);
                addObject(p,80+newX*70,95+newY*83);
                putPeashooter=false;
            }
        }
        if(putSunflower){
            if(Greenfoot.mouseClicked(null)){
                int newX = (mouse.getX()-50)/70;
                int newY = (mouse.getY()-60)/80;
                
                sunFlower s = new sunFlower();
                s.getImage().scale(50,50);
                addObject(s,80+newX*70,95+newY*83);
                putSunflower=false;
            }
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
    public void setSunflower(boolean x){
        putSunflower = x;
    }
    public void setPeashooter(boolean x){
        putPeashooter = x;
    }
}
