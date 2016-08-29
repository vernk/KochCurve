import java.awt.Color;

/**
* This is a simple driver for the KochCurve class, it will use the
* drawSnowflake method to create the snowflake.
* @version 15.3
* @author Veeran Kerai
*
*/
public class Driver
{
    
    public static void main(String[] args)
    {
        //initialize the class
        KochCurve curve = new KochCurve();
        
        //positioning
        curve.up();
        curve.move(-150, 100);
        curve.setDirection(0);
        curve.down();
        
        //draw our delicious snowflake
        curve.drawSnowflake(6, 300, Color.BLUE);
        
    }
}