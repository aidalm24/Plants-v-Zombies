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
    private int initialCooldown=1000;
    private int time=0;
    private boolean putSunflower=false;
    private boolean putPeashooter = false;
    private boolean putNut = false;
    private boolean putRepeater = false;
    private int zombieCount;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        score = 50;
        wave = 0;
        showScore();
        showWave();
        zombieCount=0;
        
        
        
        
        // Cards
        litSunflower sc = new litSunflower();
        sc.getImage().scale(55, 70);
        addObject(sc, 100, 27);
        
        litPeashooter pc = new litPeashooter();
        pc.getImage().scale(55, 70);
        addObject(pc, 180, 27);
        
        litNut nc = new litNut();
        nc.getImage().scale(55, 70);
        addObject(nc, 260, 27);
        
        litRepeater rc = new litRepeater();
        rc.getImage().scale(55, 70);
        addObject(rc, 340, 27);
    
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        time++;
        showWave();
        if (time>initialCooldown&&Greenfoot.getRandomNumber(150-40*wave) < 1)
        {
            zombie z = new zombie();
            z.getImage().scale(60, 80);
        
            addObject(z, 580, Greenfoot.getRandomNumber(4)*80+100);
            zombieCount++;
        }
        if (wave>0&&Greenfoot.getRandomNumber(200-40*wave) < 1)
        {
            coneZombie cz = new coneZombie();
            cz.getImage().scale(60, 80);
        
            addObject(cz, 580, Greenfoot.getRandomNumber(4)*80+100);
            zombieCount++;
        }
        if (wave>0&&Greenfoot.getRandomNumber(200) < 1)
        {
            footballZombie fz = new footballZombie();
            fz.getImage().scale(90, 90);
        
            addObject(fz, 580, Greenfoot.getRandomNumber(4)*80+100);
            zombieCount++;
        }
        
        if (wave>1&&Greenfoot.getRandomNumber(200) < 1){
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
        if(putSunflower&&mouse!=null){
            if(Greenfoot.mouseClicked(null)){
                int newX = (mouse.getX()-50)/70;
                int newY = (mouse.getY()-60)/80;
                
                sunFlower s = new sunFlower();
                s.getImage().scale(50,50);
                addObject(s,80+newX*70,95+newY*83);
                putSunflower=false;
            }
        }
        if(putNut&&mouse!=null){
            if(Greenfoot.mouseClicked(null)){
                int newX = (mouse.getX()-50)/70;
                int newY = (mouse.getY()-60)/80;
                
                nut n = new nut();
                n.getImage().scale(65,70);
                addObject(n,80+newX*70,95+newY*83);
                putNut=false;
            }
        }
        if(putRepeater&&mouse!=null){
            if(Greenfoot.mouseClicked(null)){
                int newX = (mouse.getX()-50)/70;
                int newY = (mouse.getY()-60)/80;
                
                repeater r = new repeater();
                r.getImage().scale(58,58);
                addObject(r,80+newX*70,95+newY*83);
                putRepeater=false;
            }
        }
        if(zombieCount>=(wave+1)*10){
            wave++;
            zombieCount=0;
        }
        
        if(wave==3){
            showText("You survived! You win!",300,200);
        }
        
    }
    
    public void addScore(int points){
        score = score + points;
        showScore();
    }
    public int getScore(){
        return score;
    }
    public int getWave(){
        return wave;
    }
    private void showScore(){
        showText("" + score, 30, 55);
    }
    
    
    private void showWave(){
        showText("Wave: " + (wave+1), 500, 25);
    }
    public void setSunflower(boolean x){
        putSunflower = x;
    }
    public void setPeashooter(boolean x){
        putPeashooter = x;
    }
    public void setNut(boolean x){
        putNut = x;
    }
    public void setRepeater(boolean x){
        putRepeater = x;
    }
    
    }
