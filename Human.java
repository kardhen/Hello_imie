import greenfoot.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Human extends Actor
{
    public void act() 
    {
      zapytaj();
      Greenfoot.stop();
    }   
    
    public String zapytaj() {
        
       String ANSWER = JOptionPane.showInputDialog("Jak masz na imię");
       String HELLOIMIE = "Cześć " + ANSWER;
       setImage(new GreenfootImage(HELLOIMIE, 50, Color.RED, Color.BLACK));
       
       return ANSWER;
       
    }
    
    
}    