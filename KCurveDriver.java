
/**
 * Write a description of class KCurveDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KCurveDriver
{
    public static void main(String [] args)
    {
        //initialize 
        KochCurve curvypen = new KochCurve();
        
        //this gets DrawingTool into correct position
        curvypen.up();
        curvypen.move(-150,150);
        curvypen.setDirection(0);
        curvypen.down();
        
        //this draws the equilateral triangle 
        curvypen.DrawKochCurve(6,300);
        curvypen.setDirection(240);
        curvypen.DrawKochCurve(6,300);
        curvypen.setDirection(120);
        curvypen.DrawKochCurve(6,300);
        
        
    }
}
