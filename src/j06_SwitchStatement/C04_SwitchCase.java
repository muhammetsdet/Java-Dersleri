package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {

        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
        public static void main(String[] args) {
            // Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...
            Scanner input = new Scanner(System.in);
            System.out.print("Gakkom ele bi AY numarası gir : ");
            int ayNo = input.nextInt();

            switch (ayNo) {//switch blok
                default://switch hiç bir case için çalışmazsa default çalışır
                    // defaılt -> case içinde herhangi bir yere yazılabilir run sırası yazım sırasına bakmaz
                    System.out.println("canını yiyim adam gibin bişey gir hele");
                    break;
                case 1,2,12:
                    // case 1,2,12:-> best practice
                    System.out.println("Girilen ay KIŞ mevsimine ait ");
                    break;
                case 3,4,5:
                    System.out.println("Girilen ay İLKBAHAR mevsimine ait ");
                    break;
                case 6,7,8:
                    System.out.println("Girilen ay YAZ mevsimine ait ");
                    break;
                case 9,10,11:

                    System.out.println("Girilen ay SONBAHAR mevsimine ait ");
            }
            System.out.println("Gakkom code cincix DEWAMKEEE :)");
        }
}
