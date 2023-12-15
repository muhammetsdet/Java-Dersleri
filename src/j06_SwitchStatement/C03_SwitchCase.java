package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {

        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
        public static void main(String[] args) {
            // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
            Scanner input = new Scanner(System.in);
            System.out.print("Gakkom ele bi AY numarası gir : ");
            int ayNo = input.nextInt();


            switch (ayNo) {//switch blok
                default://switch hiç bir case için çalışmazsa default çalışır
                    // defaılt -> case içinde herhangi bir yere yazılabilir run sırası yazım sırasına bakmaz
                    System.out.println("canını yiyim adam gibin bişey gir hele");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Girilen AY 31 gun içeriri ");
                    break;
                case 11:
                case 9:
                case 6:
                case 4:
                    System.out.println("Girilen AY 30 gun içeriri ");
                    break;
                case 2:
                    System.out.print("yılınızı giriniz : ");
                    int yıl = input.nextInt();
                    if (yıl % 4 == 0) {// 4 yılda bir 29 olma şartı
                        System.out.println("Girilen AY 29 gun içeriri ");
                    } else System.out.println("Girilen AY 28 gun içeriri ");
                    break;
            }
            System.out.println("Gakkom code cincix DEWAMKEEE :)");
        }
}
