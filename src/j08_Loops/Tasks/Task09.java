package j08_Loops.Tasks;

import java.util.Scanner;

public class Task09 {
    /*
task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
Örnek Ekran çıktısı
*
* *
* * *
* * * *

*/
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num =scn.nextInt();
        for (int i =1; i<= num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print( " * ");
            }
            System.out.println("");
        }



    }
}
