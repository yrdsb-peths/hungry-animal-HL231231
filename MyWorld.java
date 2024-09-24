import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * Food for the elephant
 * 
 * @author Henry Lee
 * @version September 24, 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    int level = 1;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        //Create the Elephant
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        //Create Label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        //Create food
        spawnFood();
    }
    
    /**
     * spawns an apple of cherry
     */
    public void spawnFood()
    {
        int rand = Greenfoot.getRandomNumber(10);
        Food food;
        if(rand < 9)
        {
            food = new Apple();
        }
        else
        {
            food = new Cherry();
        }
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * increase score
     */
    public void increaseScore(int value)
    {
        score+= value;
        scoreLabel.setValue(score);
        level = score/5 + 1;
        Food foodPlaceholder = new Apple();
        foodPlaceholder.setSpeed(level);
    }
}
