public class typeCasting {
    public static void main(String args[]) {
        // Type Casting
        // Declare float var

        float a = 57.22f;

        // int b = a;  // This line will throw error

        int b = (int)a;  // this is Type Casting

        System.out.println("float a to int a = " + b);


        // string to num
        char ch = 'a'; // value of 'a' in java in numericals is 97.
        char ch2 = 'b'; // value of 'b' in java in numericals is 98.
        
        int num = ch;
        int num2 = ch2;

        System.out.println("a in int = " + num);
        System.out.println("b in int = " + num2);
    }
}
