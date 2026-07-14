import java.util.*;

class Calculator {
    static int count = 0;

    static double add(double a, double b) {
        count++;
        return a + b;
    }

    static double add(double a, double b, double c) {
        count++;
        return a + b + c;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = in.nextDouble();

        System.out.print("Enter second number : ");
        double b = in.nextDouble();

        System.out.print("Enter third number : ");
        double c = in.nextDouble();

        System.out.println("\nSum of two : " + Calculator.add(a, b));
        System.out.println("Sum of three : " + Calculator.add(a, b, c));

        System.out.println("Number of calculations : " + Calculator.count);

        in.close();
    }
}
