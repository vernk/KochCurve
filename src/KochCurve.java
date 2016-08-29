import java.awt.Color;
import apcslib.*;
/**
* This will draw a recursive KochCurve
* @author Veeran Kerai
* @version 15.3
*
*/
public class KochCurve extends DrawingTool
{
    /**
    * default Constructor for KochCurve
    */
    public KochCurve()
    {
        //call super to create sketchpad
        super(new SketchPad(450, 450));
        up();
        move(-150, -50);
        down();
        setDirection(0);
        setWidth(1);
    }
    /**
    * This will draw the curve
    * @param depth
    * @param length
    */
    //Pseudocode from the lab
    public void drawCurve(int depth, double length)
    {
        if (depth <= 1)
        {
            move(length);
        }
        else
        {
            drawCurve(depth - 1, length / 3);
            turnLeft(60);
            drawCurve(depth - 1, length / 3);
            turnRight(120);
            drawCurve(depth - 1, length / 3);
            turnLeft(60);
            drawCurve(depth - 1, length / 3);
        }
    }
    /**
    * This will draw the entire snowflake
    * @param depth
    * @param lenght
    */
    //function to draw the entire snowflake as the lab requests, it will do it three times
    public void drawSnowflake(int depth, double lenght, Color color)
    {
        setColor(color);
        drawCurve(depth, lenght);
        turnRight(120);
        drawCurve(depth, lenght);
        turnRight(120);
        drawCurve(depth, lenght);
    }
}