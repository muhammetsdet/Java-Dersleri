package j05_ifStatementTernaryOperator.Tasks;
import  java.util.Scanner;
public class Task18 {
    /* Koç Burcu : 21 Mart - 20 Nisan
   Boğa Burcu : 21 Nisan - 21 Mayıs
   İkizler Burcu : 22 Mayıs - 22 Haziran
   Yengeç Burcu : 23 Haziran - 22 Temmuz
   Aslan Burcu : 23 Temmuz - 22 Ağustos
   Başak Burcu : 23 Ağustos - 22 Eylül
   Terazi Burcu : 23 Eylül - 22 Ekim
   Akrep Burcu : 23 Ekim - 21 Kasım
   Yay Burcu : 22 Kasım - 21 Aralık
   Oğlak Burcu : 22 Aralık - 21 Ocak
   Kova Burcu : 22 Ocak - 19 Şubat
   Balık Burcu : 20 Şubat - 20 Mart

   switch-case kullanmadan yapınız. */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your birthdate day");
        int day = scn.nextInt();
        System.out.println("Write your birthdate month");
        int month = scn.nextInt();

        if (month == 12 && day >= 22 && month == 1 && day <= 21) {
            System.out.println("Capricorn");
        } else if (month == 1 && day >= 22 && month == 2 && day >= 19) {
            System.out.println("Aquarius");
        } else if (month == 2 && day >= 20 || month == 3 && day <= 20) {
            System.out.println("Pisces");
        } else if (month == 3 && day >= 21 || month == 4 && day <= 20) {
            System.out.println("Aries");
        } else if (month == 4 && day >= 21 || month == 5 && day <= 21) {
            System.out.println("Taurus");
        } else if (month == 5 && day >= 22 || month == 6 && day <= 22) {
            System.out.println("Gemini");
        } else if (month == 6 && day >= 23 || month == 7 && day <= 22) {
            System.out.println("Cancer");
        } else if (month == 7 && day >= 23 || month == 8 && day <= 22) {
            System.out.println("Leo");
        } else if (month == 8 && day >= 23 || month == 9 && day <= 22) {
            System.out.println("Virgo");
        } else if (month == 9 && day >= 23 || month == 10 && day <= 22) {
            System.out.println("Librau");
        } else if (month == 10 && day >= 23 || month == 11 && day <= 21) {
            System.out.println("Scorpio");
        } else if (month == 11 && day >= 22 || month == 12 && day <= 21) {
            System.out.println("Sagittarius");
        }
    }
}