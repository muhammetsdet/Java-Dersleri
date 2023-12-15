package A_Porject.Proje01;

import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kullaniciPuani = 0;

        int bilgisayarPuani = 0;

        String dewamMi = "EVET";

        int kullanıcıSecim = 0;

        int count = 1;

        while (dewamMi.equalsIgnoreCase("EVET")){
            if (count==1){
                System.out.println("\t\t    _______\r\n"
                        + "\t\t---'   ____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)\r\n"
                        + "\t\t\r\n"
                        + "    _______\r\n"
                        + "---'   ____)____\r\n"
                        + "          ______)\r\n"
                        + "          _______)\r\n"
                        + "         _______)\r\n"
                        + "---.__________)\r\n"
                        + "\r\n"
                        + "\t\t    _______\r\n"
                        + "\t\t---'   ____)____\r\n"
                        + "\t\t          ______)\r\n"
                        + "\t\t       __________)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)");
                System.out.println("=================");
                System.out.println("Tas kagit makas oyununa HOSGELDINIZ");
                System.out.println("=================");
                System.out.println("1-Tas 2-Kagit 3-Makas");
                System.out.println("=================");
            }
            System.out.println("Seciminiz: ");
            count=0;
            kullanıcıSecim=scan.nextInt();
            int bilgisayarSecimi= (int) (Math.random()*3);
            if (kullanıcıSecim==1){
                if (bilgisayarSecimi==1){
                    System.out.println("Bilgisayarin secimi= Tas ===> sonuc: Berabere");
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                } else if (bilgisayarSecimi==2) {
                    System.out.println("Bilgisayarin secimi= Kagit ===> sonuc: Kaybettiniz");
                    bilgisayarPuani++;
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                }else {
                    System.out.println("Bilgisayarin secimi= Makas ===> sonuc: Kazandiniz");
                    kullaniciPuani++;
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                }
            } else if (kullanıcıSecim==2) {
                if (bilgisayarSecimi==1){
                    System.out.println("Bilgisayarin secimi= Tas ===> sonuc: Kazandiniz");
                    kullaniciPuani++;
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                } else if (bilgisayarSecimi==2) {
                    System.out.println("Bilgisayarin secimi= Kagit ===> sonuc: Berabere");
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                }else {
                    System.out.println("Bilgisayarin secimi= Makas ===> sonuc: Kaybettiniz");
                    bilgisayarPuani++;
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                }
            }else if (kullanıcıSecim==3) {
                if (bilgisayarSecimi==1){
                    System.out.println("Bilgisayarin secimi= Tas ===> sonuc: Kaybettiniz");
                    bilgisayarPuani++;
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                } else if (bilgisayarSecimi==2) {
                    System.out.println("Bilgisayarin secimi= Kagit ===> sonuc: Kazandiniz");
                    kullaniciPuani++;
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                }else {
                    System.out.println("Bilgisayarin secimi= Makas ===> sonuc: Berabere");
                    System.out.println("Puaniniz: "+kullaniciPuani+" Bilgisayar Puani: "+bilgisayarPuani);
                }
            }else {
                System.out.println("Hatali deger sectiniz");
                continue;
            }
            if (kullaniciPuani==3){
                System.out.println("Oyunu "+kullaniciPuani+" "+bilgisayarPuani+" kazandiniz");
                System.out.println("==============================");
                System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████\r\n"
                        + "░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███\r\n"
                        + "░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███\r\n"
                        + "░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███\r\n"
                        + "░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\r\n"
                        + "░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\r\n"
                        + "██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\r\n"
                        + "█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\r\n"
                        + "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\r\n"
                        + "░░████████████░░░█████████████████");

                System.out.println("==============================================================");
                System.out.println("Oyun bitti yeniden oynamak ister misiniz? (EVET/HAYIR)");
                System.out.println("==============================================================");
                dewamMi= scan.next();
                if (dewamMi.equalsIgnoreCase("EVET")){
                    kullaniciPuani=0;
                    bilgisayarPuani=0;
                    count=1;
                }else {
                    System.out.println("Yine bekleriz. Cikis yapiyorsunuz");
                    break;
                }
            } else if (bilgisayarPuani==3) {
                System.out.println("Oyunu "+ bilgisayarPuani+" "+kullaniciPuani+" Kaybettiniz");
                System.out.println("==============================================================");
                System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\r\n"
                        + "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\r\n"
                        + "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                        + "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "\r\n"
                        + "");

                System.out.println("==============================================================");
                System.out.println("Oyun bitti yeniden oynamak ister misiniz? (EVET/HAYIR)");
                System.out.println("==============================================================");
                dewamMi= scan.next();
                if (dewamMi.equalsIgnoreCase("EVET")){
                    kullaniciPuani=0;
                    bilgisayarPuani=0;
                    count=1;
                }else {
                    System.out.println("Yine bekleriz. Cikis yapiyorsunuz");
                    break;
                }
            }
        }
    }
    /*
    if (randomScm.equals(oyuncuSecim)) {
    System.out.println("Berabere !!!");
} else if ((randomScm.equals("tas")  && oyuncuSecim .equals("makas"))
        ||( randomScm.equals("makas")  && oyuncuSecim.equals("kagit"))
        || (randomScm.equals("kagit")  && oyuncuSecim.equals("tas"))) {
    bilgisayarPuan++;
} else {
    oyuncuPuan++;
}
     */
}
