package j08_Loops.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Gadın anam ele  biseyler gir : ");
        String kelime = input.next();
        String tersKelime = "";// kelimeden gelen herbir characteri tersden atanacagı boş bir sTring variable tanımlandır


        for (int i = kelime.length() - 1; i >= 0; i--) {// kelimenin son char'dan ilk cha'a kadar loop tanımlandı
            tersKelime += kelime.charAt(i);//loop'dan gelen herbir kelime characteri tersKelime'ye concat edilerek atandı
        }

        System.out.println("kelime = " + kelime);
        System.out.println("tersKelime = " + tersKelime);


        if (kelime.equals(tersKelime)) {//tersKelime ve kelime eşitlik kontrolu
            System.out.println("girilen ifade PLINDROME :)");
        } else System.out.println("girilen ifade PLINDROME  değil : (");
    }



}
