import java.util.*;

public class practiseProblems {
    public static void addition(int a, int b) {
        // Taking user input and then adding them.
        Scanner sc = new Scanner(System.in);

        // declaring varaibles
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = a + b;
        System.out.println( "a + b = " + sum);
    }

    public static void multiplication(int a, int b) {
        // Taking user input and then adding them.
        Scanner sc = new Scanner(System.in);

        // declaring varaibles
        a = sc.nextInt();
        b = sc.nextInt();

        int mul = a * b;
        System.out.println( "a * b = " + mul);
    }

    public static void aoc(float rad) {
        // Taking user input and then adding them.
        Scanner sc = new Scanner(System.in);

        // declaring varaibles
        rad = sc.nextFloat();

        float area = 3.14f * rad * rad;
        System.out.println("Area of circle = " + area);
    }
    public static void main(String args[]) {
        addition(5, 25);
        multiplication(8, 4);
        aoc(5);
    }
}
