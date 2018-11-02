import apcslib.*;
/**
 * Write a description of class KochCurve here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KochCurve extends DrawingTool
{

    /**
     * Constructor for KochCurve class
     */
    public KochCurve()
    {
      //no variables so no initialization
    }
    
    /**
     * This draws the curve
     * @param level      Level for the curve
     * @param length     Length for the curve
     */
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
