public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private String firstPairInfo;
    private String secondPairInfo;
    private String slopeInfo;
    private String linearEquation;
    private int rise;
    private int run;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int rise() {
        return y2 - y1;
    }

    public int run() {
        return x2 - x1;
    }

    private double slope() {
        slope = this.rise() / this.run();
        return slope;
    }

    private void yint() {
        double slope = slope();
        double yint = (y2) - (slope) * x2;
    }

    public String toString()
    {
        firstPairInfo = "First Pair: (" + x1 + "," + y1 + ")";
        secondPairInfo = "Second Pair: (" + x2 + "," + y2 + ")";
        slopeInfo = "Slope: " + slope;
        rise = this.rise();
        run = this.run();
        linearEquation = String.valueOf(rise/run);
        return firstPairInfo + "\n" + secondPairInfo + "\n" + slopeInfo;

    }
}
