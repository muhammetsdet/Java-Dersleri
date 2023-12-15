package j07_StringManipulation;
import java.util.Scanner;
public class C03_CharAt {
    public static void main(String[] args) {
           /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
         */

        String qa = "Muhammed Team Lead";
        System.out.println("qa = " + qa);//Muhammed Team Lead
        System.out.println("qa.charAt(5) = " + qa.charAt(5));//m
        char yedinciCharacter = qa.charAt(7);
        System.out.println("yedinciCharacter = " + yedinciCharacter);//d
        // task-> qa String son character print eden code create ediniz...

System.out.println("qa.charAt(qa.length()-1) = " + qa.charAt(qa.length() - 1));// d
        // Trick-> son karakter index=str.length()-1
        // System.out.println("qa.charAt(33) = " + qa.charAt(33));// RTE->StringIndexOutOfBoundsException:olmayan index elemanı alınamz
        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String  metin=input.nextLine();

        if (metin.length()%2 ==0) {//girilen metin cift sayılı karakter  sartı tanımlandı
            System.out.println("girlen metnin orta karakteri yoktur");
        }else    System.out.println("girilen metnin ortadaki karakteri : "+metin.charAt(metin.length() / 2));


    }
}
