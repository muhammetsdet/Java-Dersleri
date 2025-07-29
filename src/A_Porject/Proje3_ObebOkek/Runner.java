package A_Porject.Proje3_ObebOkek;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);
        System.out.println("Obeb ve Okek değerlerini bulmak istediğiniz \n1. sayiyi giriniz: ");
int sayi1=input.nextInt();
        System.out.println("2. Sayiyi giriniz: ");
        int sayi2=input.nextInt();
        PojoObebOkek obje=new PojoObebOkek();
        obje.setS1(sayi1);
        obje.setS2(sayi2);
Hesap hsp=new Hesap();
hsp.obeb(obje);
hsp.okek(obje);
    }
}
