package j05_ifStatementTernaryOperator.Tasks;

        /*İki tane int oluşturun. Birinci (1.) int 26. İkinci (2.) int 35.
          Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
          Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın. */

//Kodu aşağıya yazınız.
public class _02_if_statement2 {
    public static void main(String[] args) {
        int num1 = 26;
        int num2 = 35;
        if (num1 > num2) {
            System.out.println(num1 + " grader than " + num2);
        } else if (num1<num2){

            System.out.println(num1 + " smaller than " + num2);
        }

    }
}
