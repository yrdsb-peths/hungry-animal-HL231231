import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author Henry Lee
 * @version September 24, 2024
 */
public abstract class Food extends Actor
{
    int value;
    public static int speed = 1;
    public Food(int value) 
    {
        this.value = value;
    }
    
    public void act()
    {
        //moves object down
        int x;
        int y;
        if(value == 1)
        {
            x = getX();
            y = getY() + speed;
        }
        else
        {
            x = getX();
            y = getY() + speed + 2;
        }
        setLocation(x, y);
        
        //Remove food and draws game over when food gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
            setSpeed(1);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
