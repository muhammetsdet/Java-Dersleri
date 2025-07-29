package j23_Encapsulation.Task.Task09;

import java.util.Scanner;
public class Account {
    /*
      1- fieldları accountNumber(her müşteriye özel numara olmalı) ve balance (bakiye) olan bir Account class'ı create ediniz  .
         2- Account class'TcKontrol deposit (ParaEkle) metodu ekleyiniz.
         3- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
         4- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verilsin
         5- Banka class'da main metodunda  account oluşturarak ihtimalleri deneyiniz.
     */
    private int accountNum;
    private int blance = 10000;
    Scanner input = new Scanner(System.in);


    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getBlance() {
        return blance;
    }

    public void setBlance(int blance) {
        this.blance = blance;
    }



    public void TcKontrol() {

    }

    public void Account() throws InterruptedException {
        System.out.println(blance);
        System.out.println("Ana menuye yönkendiriliyorsunuz");
        Thread.sleep(3000);
        menu();
    }

    public void ParaEkle() throws InterruptedException {
int yatırılan=input.nextInt();
        System.out.println("Hesabınısa yatan para =" + yatırılan + "Hesabınızdaki toplam tutar = " + (blance + yatırılan));
        System.out.println("Ana menuye yönkendiriliyorsunuz");
        Thread.sleep(3000);
        menu();
    }

    public void ParaÇıkar() throws InterruptedException {
        System.out.println("çekmek istediğiniz tutarı giriniz");
        int çekilen=input.nextInt();
    if (çekilen>5000){
        System.out.println("Günlük parar çekme limitinizden fazla para çekemezsiniz");
        ParaÇıkar();
    }else{
        System.out.println("Hesabınızda kalan para miktarı-->" + (blance - çekilen));
        System.out.println("Ana menuye yönkendiriliyorsunuz");
        Thread.sleep(3000);
        menu();
    }
    }

    public void menu() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Account hesap = new Account();
        System.out.println("SEÇİMİNİZİ YAPINIZ-->");
        System.out.println("Para çekmek için 1-->");
        System.out.println("Para yatırmak için 2-->");
        System.out.println("Para miktarının öğrenmek için 3-->");
        System.out.println("Çıkış için 0-->");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                hesap.ParaÇıkar();
                break;
            case 2:
                System.out.println("Yatırmak istediğiniz miktarı giriniz");
                hesap.ParaEkle();
                break;
            case 3:
                System.out.println("Hesap bakiyenbiz-->");
                hesap.Account();
                break;
            case 4:
                System.out.println("Bizi seçtiğiniz için teşekkür ederiz");
                break;
            case 0:
                System.out.println("Tekrar görüşünceye kadar sağlıklı günler dileriz");
                System.exit(0);
            default:
                System.out.println("LÜtfen yapmak istediğiniz seçimi belirtilen sayılarla gerçekleştirin");
                System.out.println("Ana menuye yönkendiriliyorsunuz");
                Thread.sleep(3000);
                menu();
        }

    }
}
