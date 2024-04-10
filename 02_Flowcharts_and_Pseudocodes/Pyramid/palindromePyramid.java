public class palindromePyramid {
    public static void palindromePattern(int n) {
        // outer loop
        for(int i=1; i<=n; i++) {
            // space loop
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // descending loop
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            // ascending loop
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            // go to next line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        palindromePattern(5);
    }
}
