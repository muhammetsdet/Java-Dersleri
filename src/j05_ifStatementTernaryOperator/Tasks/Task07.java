package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task07 {
    /* Task->
 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a letter");
        Character ch = scn.next().charAt(0);
        if (ch.isLetter(ch)) {
            if (ch.isLowerCase(ch)) {
                if (ch=='a')
                    System.out.println("This is first lowercase letter");
                else if (ch!='a')
                    System.out.println("This is not first lowercase letter");
            }else  if (ch.isUpperCase(ch)) {
                if (ch=='Z') {
                    System.out.println("This is last uppercase letter");

                } else if (ch!='Z') {
                    System.out.println("This is not last uppercase letter");
                }

            }
        }
    }

}
