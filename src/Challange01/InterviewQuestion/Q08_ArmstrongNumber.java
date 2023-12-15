package Challange01.InterviewQuestion;

import java.util.Scanner;

public class Q08_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say number...");
        int num=scanner.nextInt();
        int numKup=0;
        int girlen=num;
        while (num>0) {
            numKup+=(int)Math.pow(num%10,3);
            num/=10;

        }
if (numKup==girlen) {
    System.out.println("Girilen: " + girlen + " sayisi armstron sayidir");
}else{
    System.out.println("Girilen: " + girlen + " sayisi armstron değildir");

}
    }
}
