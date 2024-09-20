import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * Food for the elephant
 * 
 * @author Henry Lee
 * @version Sep 20, 2024
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
        //Creates apple
        createApple();
    }
    
    /**
     * Creates a new apple at a random position at the top of the screen
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
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
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level++;
        }
    }
}
