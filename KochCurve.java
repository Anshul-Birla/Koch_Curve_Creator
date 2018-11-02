import apcslib.*;
/**
 * Write a description of class KochCurve here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KochCurve extends DrawingTool
{

    
    public KochCurve()
    {
      
    }
    
    public void DrawKochCurve(int level, double length)
    {
        if(level <1)
        {
            forward(length);
        }
        else 
        {
            
            DrawKochCurve(level-1, length/3);
            turnLeft(60);
            DrawKochCurve(level-1, length/3);
            turnRight(120);
            DrawKochCurve(level-1,length/3);
            turnLeft(60);
            DrawKochCurve(level-1,length/3);
            
    }
}
}
