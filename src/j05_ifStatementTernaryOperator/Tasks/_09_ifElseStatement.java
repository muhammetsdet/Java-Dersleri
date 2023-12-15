package j05_ifStatementTernaryOperator.Tasks;
import java.util.Objects;
import java.util.Scanner;
public class _09_ifElseStatement {
      /* str bir String'dir.
        Eğer String Orange'ye eşit ise ve uzunluğu 6'ya eşit ise "Orange has six letters" yazdırınız.
        Eğer String Apple'ye eşit ise ve uzunluğu 5'ya eşit ise "Apple has five letters" yazdırınız.
        Eğer String Orange'yi kapsıyorsa ve uzunluğu 10'dan fazla ise
        "String contain orange and length is more then 10" yazdırınız.
        Not: Uzunluk derken ingilizcedeki "length" yani karakter sayısından bahsediliyor.  */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the configuration");
        String str = scan.nextLine();
        String vegetable = "Apple";
        String vegatable2 = "Orange";
        if (Objects.equals(str, vegatable2)){
        if (str.length() == 6) {
            System.out.println("Orange has six letters");
        }

        } else if (Objects.equals(str, vegetable)) {
            if (str.length() == 5) {
                System.out.println("Apple has five letters");
            }

        } else if (str.contains("Orange")) {
            if (str.length() > 10) {
                System.out.println("String contain orange and length is more then 10");
            }
        }

    }
}
