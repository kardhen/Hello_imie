import greenfoot.*;
public class Pole extends World
{
    public Pole()
    {    
        super(600, 400, 1); 
        Human human = new Human();
        addObject(human, 200, 200);
        
    }
}
