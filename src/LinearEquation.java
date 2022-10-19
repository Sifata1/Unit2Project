import static java.lang.Math.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
public class LinearEquation {
    private int x1; // This variable represents the x coordinate.
    private int y1; // This variable represents the y coordinate.
    private int x2; // This variable represents the x2 coordinate.
    private int y2; // This variable represents the y2 coordinate.
    private double x; // This variable represents the x coordinate the user will input once the code is ran.

    DecimalFormat df = new DecimalFormat("0.00");
    public LinearEquation(int x1, int y1, int x2, int y2) // This is a constructor to assign the coordinate values to the instance variables.
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int rise()
    {
        return y2 - y1;
    } //  This method will return y2-y1.

    public int run()
    {
        return x2 - x1;
    } // This method will return x2-x1.

    public double slope() // This method will calculate the slope. (rise/run)
    {
        double rise = this.rise();
        double run = this.run();
        double slope = (rise) / (run);
        return slope;
    }

    public double intercept() // This method will return the y intercept of the line.
    {
        double intercept = (double) (y2 - (this.slope() * x2));
        return intercept;
    }

    public String equation() // This method will return the linear equation of the two points.
    {
        String linearEquation = this.rise() + "/" + this.run() + "x + " + df.format(Math.round((this.intercept())*100.00)/(100.00));
        return linearEquation;
    }

    public double distance() // This method will display the distance between the two points, using the equation sqrt((x2-x1)^2 + (y2-y1)^2)
    {
        double x = x2-x1;
        double y = y2-y1;
        double distance = sqrt(pow(x,2) + pow(y,2));
        return distance;
    }

    public double solveEquation(double x) // This method will return the y coordinate of the linear equation when a specific x value is inputted.
    {
        this.x = x;
        double solve = ((double)this.slope())*(x) + this.intercept();
        return solve;
    }

    public String toString() // This method will display and calculate all information about this instance, including x and y coordinates, slope intercept form equation, etc.
    {
        String firstPairInfo = "First Pair: (" + x1 + "," + y1 + ")";
        String secondPairInfo = "Second Pair: (" + x2 + "," + y2 + ")";
        String slopeInfo = "Slope of Line: " + df.format(Math.round(this.slope()*100.00)/100.00);
        String intercept = "Y-Intercept: " + df.format(Math.round(this.intercept()*100.00)/100.00);
        String linearEquation = "Slope Intercept Form: " + this.equation();
        String distance = "Distance Between Points: " + df.format(Math.round(this.distance()*100.00)/100.00);
        return firstPairInfo + "\n" + secondPairInfo + "\n" + slopeInfo + "\n" + intercept  + "\n" + linearEquation + "\n" + distance;


    }
}
