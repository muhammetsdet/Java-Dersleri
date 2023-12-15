package j07_StringManipulation;
import java.util.Scanner;
public class C04_Contains {

        public static void main(String[] args) {
    /*
        String içersinde istenen stringinin varlığını kontrol eder boolean değer return eder..
        char parametre -> CTE
         */
            String str1="Başarı gayrete aşıktır :)";
            System.out.println("str1 = " + str1);// Başarı gayrete aşıktır :)
            System.out.println("str1.contains(\"Başarı\") = " + str1.contains("Başarı"));// true
            // str1.contains('a') //char ->CTE
            System.out.println("str1.contains(\"a\") = " + str1.contains("a")); // true
            System.out.println("str1.contains(\"haluk\") = " + str1.contains("haluk")); // false
            // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz...
            Scanner input = new Scanner(System.in);
            System.out.println("bir metin giriniz : ");
            String  metin=input.nextLine();
            System.out.println("metin aradıgınız kelimeyi giriniz : ");
            String  kelime=input.next();
            System.out.println("metin.contains(kelime) = " + metin.contains(kelime));//
            //  System.out.println("kelime.contains(metin) = " + kelime.contains(metin));
            System.out.println(metin.contains(kelime) ? "girelen " + metin + "de aranan " + kelime + " mevcut" : "girelen " + metin + " de aranan " + kelime + " mevcut DEĞİL");
        }
    }

