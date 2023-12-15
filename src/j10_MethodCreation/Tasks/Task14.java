package j10_MethodCreation.Tasks;

import java.util.Scanner;

/* task->
  Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz
  Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
  fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.
  Örnek :
  saatlik çalışma ücreti : 40.0
 iş başı saati : 9.0
  paydos saati : 20.0
  fazla mesaiyi saat ücreti çarpanı: 1.8
  ucretHesapla(9.0,20.0,40.0,1.8);
  9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
  17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216
  toplam = 536.0
  */
public class Task14 {
     static Scanner scn = new Scanner(System.in);

     public static void main(String[] args) {
   feeCalculation();

     }
     private static int feeCalculation() {
          System.out.println("How many hours do you work per day? ");
           int workHours = scn.nextInt();
          System.out.println("How much do you charge per hour? ");
          int perHour = scn.nextInt();
          System.out.println("How much is your overtime pay? ");
          int overtime = scn.nextInt();
          System.out.println("How many hours did you work today? ");
          int today = scn.nextInt();
          System.out.println(today > workHours ? (workHours * perHour) + (today - workHours) * overtime : (workHours * perHour));
     return workHours;
     }
}
/*

        Scanner sc = new Scanner(System.in);
        System.out.println("mesai başalama saatini yazınız : ");
        double start=sc.nextDouble();

       System.out.println("mesai bitis saatini yazınız : ");
       double finish=sc.nextDouble();

        System.out.println("mesai  saat ücretinizi yazınız : ");
        double saatUcret=sc.nextDouble();

        System.out.println("fazla mesai ucret katsaysını yazınız : ");
        double ucretKatsayı=sc.nextDouble();

        System.out.println(ucretHesapla(9.0, 20.0, 40.0, 1.8));
        System.out.println(ucretHesapla(11,24,45,1));
        System.out.println(ucretHesapla(start, finish, saatUcret, ucretKatsayı));//dynamic

    }//main sonu

    private static double ucretHesapla(double baslama, double bitis, double saatUcreti, double ucretKatsayısı) {
        double yevmiye1= (17-baslama)*saatUcreti;
        double yevmiye2=(bitis-17)*saatUcreti*ucretKatsayısı;
        return yevmiye1+yevmiye2;

    }
}//class sonu
 */
