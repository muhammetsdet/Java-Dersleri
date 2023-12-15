package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task04 {
    /*
Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.

ocak, Mart, Mayıs, Temmuz, Ağustos, Ekim ve Aralık ayları 31 gün çeker.
Nisan, Haziran, Eylül ve Kasım ayları ise 30 gün çeker.
 Şubat ayı ise her 4 yılda bir 29 gün çeker. Temmuz ayı da 31 gün çeken aylar içerisindedir.
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String Month = scn.next();
        switch (Month) {
            case "January","March","May","July","August","October","December":
                System.out.println("31");
                break;

            case "April","June","September","November":
                System.out.println("30");
                break;
            case "Fabruary":
                System.out.println("Write this year");
                int year = scn.nextInt();
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
                break;

            default:
                System.out.println("Write what want from yours");
        }
    }
}
