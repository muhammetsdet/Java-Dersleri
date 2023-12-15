package j05_ifStatementTernaryOperator.Tasks;

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */



//Kodu aşağıya yazınız. BU SATIRDAN ÖNCE YAZILANLARI DEĞİŞTİRMEYİNİZ.
import java.util.Objects;
import java.util.Scanner;
public class _03_if_else_if_statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write str1");
        String str1 = scan.nextLine();
        System.out.println("Write str2");
        String str2 = scan.nextLine();
        if (Objects.equals(str1, str2)) {
            System.out.println("String 1 is equal to String 2");
        } else {
            System.out.println("String 1 is NOT equal to String 2");
        }
    }
}