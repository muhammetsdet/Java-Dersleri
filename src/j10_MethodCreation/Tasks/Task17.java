package j10_MethodCreation.Tasks;

import java.util.Scanner;
/*
      Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
      input:1453
      output:3541i
      üsey:rhp
       */
public class Task17 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(opposite());
    }
    private static int opposite() {
        System.out.println("Enter a number:");
       int  reverse = 0;
        int num = input.nextInt();
        while (num>0){
            int newNum = num%10;
           reverse= reverse*10 + newNum;
           num/=10;
        }
        return reverse;
    }
}
