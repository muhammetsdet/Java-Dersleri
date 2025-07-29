package A_Porject.Proje3_FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Filmler {
    /*

        Film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
        filmin index nosuna göre sectiriniz
        seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
        sağlayan method create ediniz...
        Ahanda TRICK...
        kullanıcının sectiği filmin harf sayısını  console yazdırınız.
        kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
        kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
        kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
        kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

        --> Bu proje için 2 giriş olsun
        1) Admin girişi
        2) Kullanıcı girişi

        --> ADMİN YETKILERI;
        1. filmler listesini düzenleyebilmeli ekleme çıkartma yapabilmeli.
        2. Kullanıcı silebilmeli  ****

        --> KULLANICI
        1) Kayıtlı değilse kayıt olmalı
        2) kayıtlı ise oyuna başlayabilmeli
        */

    String c_RED    = "\u001B[31m";
    String BOLD     = "\033[0;1m";
    String c_RESET  = "\u001B[0m";
    String c_BLUE   = "\u001B[34m";
    String c_PURPLE = "\u001B[35m";
    String c_GREEN  = "\u001B[32m";

    private static String adminUser = "admin";
    private static String adminPass = "admin01";
    private String userName;
    private String userPass;

    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> filmListe = new ArrayList<>(
            Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "GODFATHER","MATRIX", "BRAVEHEART",
                    "LEON", "GODFATHER", "JURASSICPARK", "TITANIC","HOBBITS","MISSIONIMPOSSIBLE","KINGKONG"));

    static ArrayList<String> userList = new ArrayList<>(Arrays.asList("user1","user2","user3","user4"));
    static ArrayList<String> passwordList = new ArrayList<>(Arrays.asList("user01","user02","user03","user04"));

    public void mainmenu() {
        System.out.println(BOLD+c_PURPLE+"\n*****ANA MENU*****"+c_RESET);
        try {
            System.out.println("Admin girişi için - 1");
            System.out.println("Kullanıcı girişi için - 2");
            System.out.println("Kayıt olamak için - 3");
            System.out.println("Çıkış için - 4");
            System.out.print("Seçiniz : ");
            int secim=scan.nextInt();
            scan.nextLine();
            if (secim==1){
                System.out.println("Kullanici adiniz girniz");
                String admin=scan.nextLine();
                System.out.println("Sifrenizi giriniz");
                String sifre=scan.next();
                if (admin.equals(adminUser)&&sifre.equals(adminPass)){
                    System.out.println("Admin menuye yonlendiriliyorsunuz");
                    Thread.sleep(2000);
                    adminMenu();
                }else {
                    System.out.println("Kullanici adi veya sifre hatali");
                    mainmenu();
                }
            } else if (secim==2){
                System.out.println("Kullanici adiniz girniz");
                String user=scan.nextLine();
                System.out.println("Sifrenizi giriniz");
                String sifre=scan.next();
                if (userList.contains(user)&&passwordList.contains(sifre)){
                    System.out.println("Kullanici menusune yonlendiriliyorsunuz");
                    Thread.sleep(2000);
                    userMenu();
                }else {
                    System.out.println("Kullanici adi veya sifre hatali");
                    mainmenu();
                }
            } else if (secim==3){
                System.out.println("Kullanici adinizi giriniz");
                String kullanici=scan.nextLine();
                System.out.println("Sifrenizi giriniz");
                String sifre=scan.next();
                userList.add(kullanici);
                passwordList.add(sifre);
                System.out.println("Kaydiniz basariyla olusturuldu\nMenuye yonlendiriliyorsunuz");
                Thread.sleep(2000);
                mainmenu();
            } else if (secim==4) {
                System.out.println("Cikis yapiyorsunuz... Yine bekleriz");
            }else {
                System.out.println(BOLD+c_GREEN+"Hatali giris ana menuye yönlendiriliyorsunuz"+c_RESET);
                mainmenu();
            }
        }catch (Exception e){ //NASIL YAKALAYACAK ???
            System.out.println(BOLD+c_GREEN+"Hatali giris"+c_RESET);
            scan.nextLine();
            mainmenu();
        }
    }

    private void userMenu() {
        System.out.println(BOLD+c_BLUE+"\n *** KULLANICI MENÜSÜ ***\n"+c_RESET);
        try {
            System.out.println("Oyuna geçmek için - 1");
            System.out.println("Ana menüye geçmek için - 2");
            System.out.println("Çıkış için - 3");
            System.out.print("Seçiniz : ");
            int secim=scan.nextInt();
            if (secim==1)filmTahminEtme();
            else if (secim==2) {
                mainmenu();
            } else if (secim==3) {
                System.out.println("Cikis yapiyorsunuz...Yine bekleriz");
            }else {
                System.out.println(BOLD+c_GREEN+"Hatali giris. Tekrar dene."+c_RESET);
                userMenu();
            }
        }catch (Exception e){
            System.out.println(BOLD+c_GREEN+"Hatali giris"+c_RESET);
            scan.nextLine();
            mainmenu();
        }
    }

    private void adminMenu() {
        System.out.println(BOLD+c_BLUE+"\n *** ADMİN MENÜSÜ ***\n"+c_RESET);
        try {
            System.out.println("Oyuna geçmek için - 1");
            System.out.println("Film eklemek için - 2");
            System.out.println("Film silmek için - 3");
            System.out.println("Filmleri görüntülemek için - 4");
            System.out.println("Kullanıcıları görüntülemek için - 5");
            System.out.println("Ana menüye dönmek icin - 6");
            System.out.println("Çıkış için - 7");
            System.out.print("Seçiniz : ");
            int secim=scan.nextInt();
            if (secim==1)filmTahminEtme();
            else if (secim==2) {
                filmEkle();
            } else if (secim==3) {
                filmSilme();
            } else if (secim==4) {
                filmGoruntule();
            } else if (secim==5) {
                kullaniciGoruntule();
            } else if (secim==6) {
                mainmenu();
            } else if (secim==7) {
                System.out.println(BOLD+"Cikis yapiyorsunuz");
            }else {
                System.out.println(BOLD+c_RED+"Hatali giris"+c_RESET);
                adminMenu();
            }
        }catch (Exception e){
            System.out.println(BOLD+c_GREEN+"Hatali giris"+c_RESET);
            scan.nextLine();
            adminMenu();;
        }
    }

    private void filmTahminEtme() {
        System.out.println(BOLD+c_GREEN+"FILM TAHMIN OYUNUNA HOSGELDINIZ"+c_RESET);
        try {
            System.out.println("Listemizde bulunan "+filmListe.size()+" filmden birini secmek icin: ");
            System.out.println("1 ile "+filmListe.size()+" arasinda bir sayi giriniz");
            int filmIndex=scan.nextInt();
            scan.nextLine();
            String tahminEdilecekFilm=filmListe.get(filmIndex-1);
            int tahminHakki=tahminEdilecekFilm.length()*2;
            System.out.println(BOLD+c_RED+tahminHakki+" defa tahmin hakkiniz var"+c_RESET);
            String ipucu=tahminEdilecekFilm.substring(0,2)+tahminEdilecekFilm.substring(2).replaceAll("\\D","*");
            System.out.println("Filmi tahmin etmen icin sana bir ipucu --> "+ipucu);
            int count=0;
            while (tahminHakki>0){
                count++;
                System.out.println(count+".Tahmin hakkini gir");
                String tahmin=scan.nextLine().toUpperCase().replaceAll(" ","");
                if (tahmin.equals(tahminEdilecekFilm)){
                    System.out.println("Tebrikler "+count+".tahmin hakkinizda filmi bildiniz");
                    break;
                }else {
                    System.out.println("MALESEFFF bilemediniz "+(tahminHakki-count)+" tahmin hakkiniz kaldi");
                    tahminHakki--;
                }
                if (tahminHakki==0){
                    System.out.println(count+" Defa tahmin yaptin maleesef kaybettin ");
                    mainmenu();
                }
            }
        }catch (Exception e){
            System.out.println(BOLD+c_GREEN+"Hatali giris"+c_RESET);
            scan.nextLine();
            adminMenu();;
        }
    }

    private void kullaniciGoruntule() {
        System.out.println("Kullanici listesi asgidadir");
        try {
            for (String each:userList) {
                System.out.println(each);
            }
            Thread.sleep(2000);
            adminMenu();
        }catch (Exception e){
            System.out.println(BOLD+c_GREEN+"Hatali giris"+c_RESET);
            scan.nextLine();
            adminMenu();;
        }
    }

    private void filmGoruntule() {
        System.out.println("Film listesi asgidadir");
        try {
            for (String each:filmListe) {
                System.out.println(each);
            }
            Thread.sleep(2000);
            adminMenu();
        }catch (Exception e){
            System.out.println(BOLD+c_GREEN+"Hatali giris"+c_RESET);
            scan.nextLine();
            adminMenu();;
        }

    }

    private void filmSilme() {
        scan.nextLine();
        try {
            System.out.println("Silmek istediginiz filmi giriniz");
            String ad=scan.nextLine();
            ad=ad.toUpperCase().replaceAll(" ","");
            if (filmListe.contains(ad)){
                System.out.println(ad+" filmi listeden silindi.\nAdmin menuye yonlendiriliyorsunuz");
                filmListe.remove(ad);
                Thread.sleep(2000);
                adminMenu();
            }else {
                System.out.println(ad+" filmi kayitli degil");
                adminMenu();
            }
        }catch (Exception e){
            System.out.println(BOLD+c_GREEN+"Hatali giris"+c_RESET);
            scan.nextLine();
            adminMenu();;
        }
    }

    private void filmEkle() {
        System.out.println();
        scan.nextLine();
        try {
            System.out.println("Eklemek istediginiz filmi giriniz");
            String ad=scan.nextLine();
            ad=ad.toUpperCase().replaceAll(" ","");
            filmListe.add(ad);
            System.out.println(ad+" filmi listeye eklendi.\nAdmin menuye yonlendiriliyorsunuz");
            Thread.sleep(2000);
            adminMenu();
        }catch (Exception e){
            System.out.println(BOLD+c_GREEN+"Hatali giris"+c_RESET);
            scan.nextLine();
            adminMenu();;
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public static String getAdminUser() {
        return adminUser;
    }

    public static String getAdminPass() {
        return adminPass;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public Filmler() {
    }

    public Filmler(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }
}
