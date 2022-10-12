public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;


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

    public String toString()
    {
        String firstPairInfo = "First Pair: (" + x1 + "," + y1 + ")";
        String secondPairInfo = "Second Pair: (" + x2 + "," + y2 + ")";
        int rise = this.rise();
        int run = this.run();
        String linearEquation = String.valueOf(rise / run);
        return firstPairInfo + "\n" + secondPairInfo + "\n" + "Slope: " + this.rise() / this.run();

    }
}
