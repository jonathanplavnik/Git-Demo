import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ban here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ban extends Actor
{
    /**
     * Act - do whatever the Ban wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if(isAtEdge()){
            turn(7);
        }
    }
}
