package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task25 {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Enter a number:");
        // int num=input.nextInt();
        // System.out.println(factorial(num));
        factorial();
        //
        //vate static int factorial(int num) {
        // if (num>=1){
        //     return num*factorial(num-1);
        // }else
        //     return 1;
        //
    }

 //  Code Kozmetiği
 //  Önemli mi?


    private static void factorial() {
        System.out.println("Enter a number:");
        int num = input.nextInt();
        System.out.print(num + "!=");
        int fact = 1;
        for (int i = num; i > 1; i--) {
            System.out.print(i + "*");
            fact *= i;
        }
        System.out.println("1-->" + fact);
    }
}



