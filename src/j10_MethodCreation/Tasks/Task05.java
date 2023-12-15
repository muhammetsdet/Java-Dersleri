package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task05 {
    // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("2. sayı giriniz : ");
        int sayi2 = input.nextInt();
        System.out.println("Agam işlemini giresen : ");
        char islem = input.next().charAt(0);

        dortIslem(islem, sayi1, sayi2);

    }//main sonu

    private static void dortIslem(char islem, int sayi1, int sayi2) {
        switch (islem) {
            case '+':
                toplam(sayi1,sayi2);    // System.out.println(sayi1+" + "+sayi2+" = "+(sayi1+sayi2));

                break;
            case '-':
                subtract(sayi1,sayi2);
                //System.out.println(sayi1+" - "+sayi2+" = "+(sayi1-sayi2));

                break;
            case 'x':
                multiply(sayi1,sayi2);
//                System.out.println(sayi1+" x "+sayi2+" = "+(sayi1*sayi2));

                break;
            case '/':
                divide(sayi1,sayi2);
               // System.out.println(sayi1+" / "+sayi2+" = "+(sayi1/sayi2));
                break;

            default:
                System.out.println("hatalı işlem seçtiniz");

        }

    }

    private static void divide(int sayi1, int sayi2) {
        System.out.println(sayi1+" / "+sayi2+" = "+(sayi1/sayi2));
    }

    private static void multiply(int sayi1, int sayi2) {
        System.out.println(sayi1+" x "+sayi2+" = "+(sayi1*sayi2));
    }

    private static void subtract(int sayi1, int sayi2) {
        System.out.println(sayi1+" - "+sayi2+" = "+(sayi1-sayi2));
    }

    private static void toplam(int sayi1, int sayi2) {

        System.out.println(sayi1+" + "+sayi2+" = "+(sayi1+sayi2));
    }
}
