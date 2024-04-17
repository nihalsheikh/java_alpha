import java.util.Scanner;

public class arithmeticOperator {
    public static void binary(int a, int b) {
        // Arithmetic Operators
        Scanner sc = new Scanner(System.in);

        // addition
        int add = sc.nextInt(a + b)q;

        // subtraction
        int sub = a - b;

        // multiplication
        int mul = a * b;

        // division
        int div = a / b;

        // remainder
        int rem = a % b;

        // Output
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }

    public static void main(String args[]) {
        binary(40, 3);
    }
}
