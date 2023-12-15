package j08_Loops.WhileLoops;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //int start = 1;
        //while (start<=7){
        //    System.out.println("javaCAN");
        //    start++;
        //}
        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num= scn.nextInt();
        int count = (num*(num+1))/2;
        while (num>0){
            
            num--;

        }
        System.out.println(count);
    }
}
