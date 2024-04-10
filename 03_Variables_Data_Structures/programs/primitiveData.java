import java.util.*;

public class primitiveData {
    public static void main(String args[]) {
        // PRIMITIVE DATA TYPES USAGE EXAMPLES
        byte b = 8;
        System.out.println("byte datatype: " + b);
        
        char ch = 'a';
        System.out.println("char datatype: " + ch);
        
        boolean bol = true;
        System.out.println("boolean datatype: " + bol);
        
        float eraser = 3.66f;
        System.out.println("float datatype: " + eraser);
        
        double db = 12.03;
        System.out.println("double datatype: " + db);
        
        int num = 50;
        System.out.println("int datatype: " + num);
        
        short sh = 100;
        System.out.println("short datatype: " + sh);

        long lg = 500000000L;
        System.out.println("long datatype: " + lg);

        // Addition of Numbers
        int numA = 10;
        int numB = 50;
        int sum = numA + numB;
        System.out.println("Sum of nums: " + sum);


        // Taking String Input from User in Java
        Scanner sc = new Scanner(System.in);
        //note that this only takes input and not print output
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // // Taking Integer Input from User in Java
        // int numInt = sc.nextInt();
        // System.out.println(numInt);

        // // Taking Float Input from User in Java
        // float numFloat = sc.nextFloat();
        // System.out.println(numFloat);

        // // Taking Byte Input from User in Java
        // byte numByte = sc.nextByte();
        // System.out.println(numByte);

        // // Taking Double Input from User in Java
        // double numDouble = sc.nextDouble();
        // System.out.println(numDouble);

        // // Taking Boolean Input from User in Java
        // boolean numBoolean = sc.nextBoolean();
        // System.out.println(numBoolean);

        // // Taking Short Input from User in Java
        // short numShort = sc.nextShort();
        // System.out.println(numShort);

        // Taking Long Input from User in Java
        long numLong = sc.nextLong();
        System.out.println(numLong);
    }
}
