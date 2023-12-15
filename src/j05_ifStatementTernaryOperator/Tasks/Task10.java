package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class Task10 {
    /* Task->
 Kullanicidan 100 uzerinden notunu isteyin.
 Not’u harf sistemine cevirip yazdirin.
 50’den kucukse “D”,->1,2,3..49
 =50  <60 arasi “C”,->50,51,52,..59
 =60  <80 arasi “B”,->60,61,62,63..79
 =80’nin uzerinde ise “A”->80,81..100
 */
    public static void main(String[] args) {
Scanner scn =new Scanner(System.in);
        System.out.println("Please enter your grade between 0 and 100");
        int yourGrade = scn.nextInt();
        if (yourGrade < 50) {
            System.out.println("Your grade is D");
        } else if (yourGrade < 60  && yourGrade >= 50) {
            System.out.println("Your grade is C");
        } else if (yourGrade < 80 && yourGrade >= 60) {
            System.out.println("Your grade is B");
        } else if (yourGrade >= 80) {
            System.out.println("Your grade is A");
        }
    }

}
