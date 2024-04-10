public class numPyramid {
    public static void numPattern(int n) {

        // Outer Loop
        for(int i=1; i<=n; i++) {
            // Space loop
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            
            // Number loop
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }

            // go to next line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        numPattern(6);
    }
}