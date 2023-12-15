package j08_Loops.WhileLoops.WhileLoops_Tasks;

import java.util.Scanner;

public class Task03 {
    //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
    //input: 8-> output :8x1=8, 8x2=16... 8x10=80
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Which number multiplication table do you want?");
        int num = scn.nextInt();
        int multiplication = 1;
        while (multiplication<=10) {
            System.out.print("" + num +"*" + multiplication + "=" + (num*multiplication + " "));
            multiplication++;
        }


        }
    }

