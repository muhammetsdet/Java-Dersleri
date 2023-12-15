package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */
        Scanner input = new Scanner(System.in);
        System.out.print("cinsiyetinizi giriniz : ");
        char cnsyt = input.next().charAt(0);//kullanıcının girdiği string ifadenin 0. karakter=ilk karakteri cnsy'te atandı
        if (cnsyt == 'k') {// cinsyt k  kontrolu

            System.out.print("Hanım agam yasını giresen : ");
            int yas = input.nextInt();

            if (yas > 60) {// kadın olan kullanıcının yas >60 kontrolu tanımlandı
                System.out.print("Hanım agam prim gunu giresen : ");
                int pirimGun = input.nextInt();
                if (pirimGun > 6000) {// kadın ve 60 yasdan buyuk kullanıcını 6000 gun prim kontrolu
                    System.out.println("tebrikler hanımagam emeklilğiniz hayırlı olsun.  :)");
                } else
                    System.out.println("Hanım agam emekliliğine henuz daha  " + (6000 - pirimGun) + " prim gunu  lazım ");


            } else System.out.println("hanımagam emekliliğinize daha  " + (60 - yas) + " yıl var :( ");


        } else if (cnsyt == 'e') {// cnsyt e kntrolu

            System.out.print("Agam yasını giresen : ");
            int yas = input.nextInt();

            if (yas > 65) {// erkek olan kullanıcının yas >65 kontrolu tanımlandı

                System.out.print("Agam prim gunu giresen : ");
                int pirimGun = input.nextInt();
                if (pirimGun > 7000) {// erkek ve 65 yasdan buyuk kullanıcını 7000 gun prim kontrolu
                    System.out.println("tebrikler agam emeklilğiniz hayırlı olsun.  :)");
                } else
                    System.out.println("Agam emekliliğine henuz daha  " + (7000 - pirimGun) + " prim gunu  lazım ");


            } else System.out.println("Agam emekliliğinize daha  " + (65 - yas) + " yıl var :( ");
        } else System.out.println("hatalı giriş yaptınız ");
    }
}
