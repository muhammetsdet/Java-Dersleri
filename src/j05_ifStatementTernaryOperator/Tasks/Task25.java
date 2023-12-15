package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task25 {
    /*
Proje Konusu
Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını print eden code create ediniz.
(Not : KDV tutarını 18% olarak alın)
Örnek Çıktı
Tutar Giriniz : 100
KDV Oranı : %18
KDV Tutarı : 18.00
KDV'li Tutar : 118.0
Bonus Geliştirme
Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %18 , tutar 500TL'den büyük ise KDV oranını %8 olarak KDV print eden code create eden
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How much you want to pay");
        double price = scn.nextInt();
        double VAT = price * 18 / 100;
        if (price > 0 && price <= 500) {
            System.out.println(price + VAT + "Price of  with VAT");
        } else if (price > 500) {
            VAT = price * 8 / 100;
            System.out.println(price + VAT + "Price of  with VAT");

        }
    }
}
