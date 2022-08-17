package hackerrank;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // Write your code here.

        scan.useDelimiter("(^[\\r\\n]*|[\\r\\n]+)[\\s\\t]*[\\r\\n]+");
        int n = 0;
        double d = 0.0;
        String s = "";
        while (scan.hasNext()) {
            n= scan.nextInt();
            d = scan.nextDouble();
            s = scan.next();
        }
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n);
    }
}


