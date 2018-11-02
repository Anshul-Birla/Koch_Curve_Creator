
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
        curvypen.move(-150,150);
        curvypen.setDirection(0);
        curvypen.down();
        curvypen.DrawKochCurve(6,300);
        curvypen.setDirection(240);
        curvypen.DrawKochCurve(6,300);
        curvypen.setDirection(120);
        curvypen.DrawKochCurve(6,300);
        
        
    }
}
