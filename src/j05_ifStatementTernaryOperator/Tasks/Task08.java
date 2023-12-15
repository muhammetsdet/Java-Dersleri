package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class Task08 {
    /* Task->
 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
 */
    public static void main(String[] args) {
        System.out.println("Write your password");
        Scanner scn = new Scanner(System.in);
        int password = scn.nextInt();
        if (password % 5 == 0 && password % 10 == 0) {
            System.out.println("even number divisible by five");
        }else if (password % 5 == 0 && password % 10 != 0) {
                System.out.println("odd number divisible by five");
            } else {
                System.out.println("Try again");
            }

        }
    }
