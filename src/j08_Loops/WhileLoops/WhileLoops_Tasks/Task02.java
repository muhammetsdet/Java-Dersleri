package j08_Loops.WhileLoops.WhileLoops_Tasks;

import java.util.Scanner;

public class Task02 {
    /*
task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
for loop & while lopp
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write first number");
        int firstNumber = scn.nextInt();
        System.out.println("Write second number");
        int secondNumber = scn.nextInt();

         for (int i = (firstNumber>secondNumber ? secondNumber+1 : firstNumber+1); i <(firstNumber>secondNumber ? firstNumber :secondNumber) ; i++) {
             System.out.print(i + " ");
         }
        System.out.print("<<<<<<ForLoop than While >>>>");


        int j = (firstNumber > secondNumber ? secondNumber + 1 : firstNumber + 1);
        while ( j < (firstNumber > secondNumber ? firstNumber : secondNumber)){
            System.out.print(j + " ");
            j++;

        }

    }
}
