package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class _19_schoolGrade {
    /*  Task->
    Bir öğrencinin notunu belirleyen bir Java programı yazın.
Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
    Eğer ortalama not >=90% =>not=A
    Eğer ortalama not >= 70% ve<90% => not=B
    Eğer ortalama not >=50% ve <70% =>not=C
    Eğer ortalama not <50% =>note=F

    Aşağıdaki örnek çıktıya bakın:
    int Quiz_score: 80
    int mid_term_score: 68
    int Final_score: 90
    print (Your grade is B)
              (Notunuz B'dir) */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your first grate");
        int firstGrade = scn.nextInt();
        System.out.println("Write your first grate");
        int secondGrade = scn.nextInt();
        System.out.println("Write your first grate");
        int finalGrade = scn.nextInt();
        if ((firstGrade + secondGrade + finalGrade) / 3 >= 90) {
            System.out.println("Your grade is A");

        } else if ((firstGrade + secondGrade + finalGrade) / 3 < 90 && (firstGrade + secondGrade + finalGrade) / 3 >= 70) {
            System.out.println("Your grade is B");
        } else if ((firstGrade + secondGrade + finalGrade) / 3 < 70 && (firstGrade + secondGrade + finalGrade) / 3 >= 50) {
            System.out.println("Your grade is C");
        } else if ((firstGrade + secondGrade + finalGrade) / 3 < 50) {
            System.out.println("Your grade is F");
        }
    }
}

