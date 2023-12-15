package j10_MethodCreation.Tasks;

import java.util.Scanner;

/*task->
            INTERVIEW SORUSU !!!
           1'den 100'e kadar hic rakam  kullanmadan sayilari print eden METHOD create ediniz
           */
public class Task19 {
    public static void main(String[] args) {
        withoutNumber();
        Scanner input = new Scanner(System.in);
    }
       private static void withoutNumber() {
           for (int i = 'd'; i >= 'B'-'A' ; i--) {
               System.out.print(i + " ");
           }
       }

   }
