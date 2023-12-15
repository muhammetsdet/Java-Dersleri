package j10_MethodCreation.Tasks;

import java.util.Scanner;

/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
public class Task24 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        fibonacci();
    }

   private static void fibonacci() {
       System.out.print("Say any number... -->");
       int num = input.nextInt();
       int n1= 0;
       int n2=1;
       int sum;
       for (int i = 1; i <= num; i++) {
           System.out.print(n1 + " ");
           sum = n1+n2;
        n1=n2;
        n2=sum;
       }
   }
}