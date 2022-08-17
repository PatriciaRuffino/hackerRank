package hackerrank;

public class SumArrays {
    public static void main(String[] args) {
        int[] list ={1, 2, 3,5};
        int soma =0;
        for(int i=0; i < list.length; i++) {
            soma += list[i];

        }
        System.out.println(soma);
    }
}
