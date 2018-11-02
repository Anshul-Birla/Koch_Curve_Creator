
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
        KochCurve curvypen = new KochCurve();
        curvypen.up();
        curvypen.move(-150,0);
        curvypen.setDirection(0);
        curvypen.down();
        curvypen.DrawKochCurve(6,300);
        
        
        
    }
}
