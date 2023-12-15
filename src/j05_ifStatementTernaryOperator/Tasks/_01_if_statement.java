package j05_ifStatementTernaryOperator.Tasks;
    /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

import org.w3c.dom.ls.LSOutput;
//Kodu aşağıya yazınız.
public class _01_if_statement {
    public static void main(String[] args) {
        int num1 = 35;
        int num2 = 23;
        if (num1 > num2) {
            System.out.println(num1 + " grader than " + num2);
        } else if (num1<num2){

                    System.out.println(num1 + " smaller than " + num2);
        }

        }
    }

