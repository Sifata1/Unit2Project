import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EquationRunner {
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("0.00"); // This is used to round to 2 decimal place values.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first x-y coordinate point:"); // User is asked for two coordinate points.
        String firstPair = s.nextLine();
        System.out.println("Enter the second x-y coordinate point:");
        String secondPair = s.nextLine();

        int index1 = firstPair.indexOf(","); // The "integers" are being set to variables.
        int index2 = firstPair.indexOf(")");
        int indexX = secondPair.indexOf(",");
        int indexY = secondPair.indexOf(")");

        int x = index1 + 1;
        int y = indexX + 1;


        int substring1x = Integer.parseInt(firstPair.substring(1,index1)); // The "integers" are being parsed.
        int substring1y = Integer.parseInt(firstPair.substring(x,index2));
        int substring2x = Integer.parseInt(secondPair.substring(1,indexX));
        int substring2y = Integer.parseInt(secondPair.substring(y,indexY));

        LinearEquation equation = new LinearEquation(substring1x, substring1y, substring2x, substring2y); // A object is being made.
        System.out.println(equation.toString());

        System.out.println("Enter an x-value:"); // User is asked to enter a new x value to calculate coordinates based on previous equation.
        double x1 = s.nextDouble();
        double result = equation.solveEquation(x1);
        System.out.println("Solved coordinate point is: (" + df.format((double) x1) + ", " + df.format(Math.round(result*100.00)/100.00) + ")");



    }
}
