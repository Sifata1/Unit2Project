import java.util.Scanner;

import static java.lang.Integer.parseInt;

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

        int substring1x = Integer.parseInt(firstPair.substring(1,index1));
        int substring1y = Integer.parseInt(firstPair.substring(3,index2));
        int substring2x = Integer.parseInt(secondPair.substring(1,indexX));
        int substring2y = Integer.parseInt(secondPair.substring(3,indexY));

        LinearEquation equation = new LinearEquation(substring1x, substring1y, substring2x, substring2y);
        System.out.print(equation.run());
    }
}
