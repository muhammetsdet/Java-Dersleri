package j05_ifStatementTernaryOperator.Tasks;
import  java.util.Scanner;
public class Task01 {
    /*
 Task->
 Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
0 - 4 => bebek
5 - 12 => cocuk
13 - 20 => genc
21 - 30 => yetiskin
Tanimlanmamis evre
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How old are you");
        int age = scn.nextInt();
        if (age >= 0 && age <= 4) {
            System.out.println("You are a sweet baby");
        } else if (age >= 5 && age <= 12) {
            System.out.println("You ara a child");
        } else if (age >= 13 && age <= 20) {
            System.out.println("You are  young");
        } else if (age >= 21 && age <= 30) {
            System.out.println("You are an adult");
        } else {
            System.out.println("Undefined range");
        }
    }
}
