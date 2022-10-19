import java.util.Scanner;


public class EquationRunner {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first x-y coordinate point:");
        String firstPair = s.nextLine();
        System.out.println("Enter the second x-y coordinate point:");
        String secondPair = s.nextLine();

        int index1 = firstPair.indexOf(",");
        int index2 = firstPair.indexOf(")");
        int indexX = secondPair.indexOf(",");
        int indexY = secondPair.indexOf(")");

        int x = index1 + 1;
        int y = indexX + 1;


        int substring1x = Integer.parseInt(firstPair.substring(1,index1));
        int substring1y = Integer.parseInt(firstPair.substring(x,index2));
        int substring2x = Integer.parseInt(secondPair.substring(1,indexX));
        int substring2y = Integer.parseInt(secondPair.substring(y,indexY));

        LinearEquation equation = new LinearEquation(substring1x, substring1y, substring2x, substring2y);
        System.out.println(equation.toString());

        System.out.println("Enter an x-value:");
        double x1 = s.nextDouble();
        double result = equation.solveEquation(x1);
        System.out.println("Solved coordinate point is: (" + (double) x1 + ", " + Math.round(result*100.00)/100.00 + ")");



    }
}
