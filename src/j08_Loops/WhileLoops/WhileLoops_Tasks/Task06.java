package j08_Loops.WhileLoops.WhileLoops_Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06 {
    /*
1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
 */
    public static void main(String[] args) {
        Random rndm = new Random();
        int rndmNumber = rndm.nextInt(100);
        //System.out.println(rndmNumber);
        Scanner scn = new Scanner(System.in);
        System.out.println("Gues a number");
        int guess = scn.nextInt();
        int guessNum = 1;
        while (guess != rndmNumber) {
            if (guess < rndmNumber) {
                System.out.println("Your guess is wrong and less than");
            } else {
                System.out.println("Your guess is wrong and grather than");
            }
            guess = scn.nextInt();
            guessNum++;
        }
        System.out.println("You guessed it! " + guessNum + ". counting");
    }

    }
