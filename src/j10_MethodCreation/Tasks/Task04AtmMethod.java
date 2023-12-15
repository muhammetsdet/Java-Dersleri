package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04AtmMethod {



        static int bakıye = 1000;// herkeşler erişsin diye gökteki güneş yapıldı
        static Scanner input = new Scanner(System.in);// herkeşler erişsin diye gökteki güneş yapıldı

        public static void anaMenu() {

            System.out.print("işleminizi seçiniz : ");
            int islemTercih = input.nextInt();
            switch (islemTercih) {

                case 1://Bakıye sorgu
                    bakıyeSorgula();
                    anaMenu();// özyineli kendi body'sine call edilen recursive meth.

                    break;
                case 2://Para çekme
                    paraCek();
                    break;
                case 3://Para yatırma
                    paraYatır();
                    break;
                case 0://çıkış işlemi
                    cıkıs();
                    break;
                default:
                    System.out.println("Agam daha işlem seçemirsen bi de para istrisen :(");
                    anaMenu();
            }

        }

        private static void paraYatır() {
            System.out.print("Agam ne kadar yatirisen : ");
            int miktar=input.nextInt();
            bakıye+=miktar;
            System.out.println("para yatırma işleminiz başarı ile yapılmıştır\nAnaMenuye yonlendiriliyorsunuz... ");

            anaMenu();
        }

        private static void paraCek() {
            System.out.print("Agam ne kadar cekeceksen : ");
            int miktar = input.nextInt();
            if (miktar > bakıye) {
                System.out.println("Agam nişlirsen olmayan paranı istirsen");
                bakıyeSorgula();
                paraCek();
            } else {
                bakıye -= miktar;
                System.out.println("para çekme işleminiz başarı ile yapılmıştır\nAnaMenuye yonlendiriliyorsunuz... ");
            }

            anaMenu();

        }

        private static void bakıyeSorgula() {
            System.out.println("Agam bakıyen : " + bakıye + " ₺ ...");
            //  anaMenu();
        }

        private static void cıkıs() {
            System.out.println("ATM çıkışınız başarı ile yapılmıştır\nyine bekleriz selametleee :)");
        }

        public static void girisEkran() {
            System.out.println("   ***  javaBANK'a hoşgeldiniz   ***   \n" +
                    "İŞLEM MENUSU : \n" +
                    "Bakıye sorgu -> 1\nPara çekme -> 2\nPara yatırma ->3\nÇıkış -> 0");
            anaMenu();
        }
}
