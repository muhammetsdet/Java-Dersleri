package j03_ScannerClass_TypeCastring;
//Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
//Scanner Class'i Java nin util kutuphanesindedir.

// kullanıcıdan veri almak içinn şu adım takip edilir
//1. adım-> Scanner class'dan obj create edilir.

//  Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

//  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
//  System.out.print("adınızı giriniz :");

//  // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many cups of tea do you drink?");
        int cupsTotal=input.nextInt();
        System.out.print("How much sugar do you want for one cup?");
        int sugarTotal=input.nextInt();
        System.out.println("annual sugar consumption :" + ((sugarTotal*cupsTotal*1.7*365)/1000) + "kg");






    }
}
