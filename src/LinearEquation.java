import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double x;


    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int rise()
    {
        return y2 - y1;
    }

    public int run()
    {
        return x2 - x1;
    }

    public double slope()
    {
        int rise = this.rise();
        int run = this.run();
        double slope = rise/run;
        return slope;
    }

    public int intercept()
    {
        int intercept = (int) (y2 - (this.slope() * x2));
        return intercept;
    }

    public String equation()
    {
        String linearEquation = "Slope Intercept Form: y = " + this.rise() + "/" + this.run() + "x + " + this.intercept();
        return linearEquation;
    }

    public double distance()
    {
        double x = x2-x1;
        double y = y2-y1;
        double distance = sqrt(pow(x,2) + pow(y,2));
        return distance;
    }

    public double solveEquation(double x)
    {
        this.x = x;
        double solve = (this.slope())*(x) + this.intercept();
        return solve;
    }

    public String toString()
    {
        String firstPairInfo = "First Pair: (" + x1 + "," + y1 + ")";
        String secondPairInfo = "Second Pair: (" + x2 + "," + y2 + ")";
        String slopeInfo = "Slope of Line: " + this.slope();
        String intercept = "Y-Intercept: " + this.intercept();
        String linearEquation = "Slope Intercept Form: " + this.equation();
        String distance = "Distance Between Points: " + this.distance();
        return firstPairInfo + "\n" + secondPairInfo + "\n" + slopeInfo + "\n" + intercept  + "\n" + linearEquation + "\n" + distance;


    }
}
