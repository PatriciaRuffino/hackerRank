package hackerrank;

import java.util.Scanner;

public class Multiplicação {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int N = 10;
         int x = sc.nextInt();


        for (int i =1 ; i <= N; i++){
            int resul = x*i;
            System.out.println(x +"x"+i+" "+"="+ resul);
        }
        sc.close();

    }
}
