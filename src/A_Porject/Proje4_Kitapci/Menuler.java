package A_Porject.Proje4_Kitapci;

public class Menuler {
    static String c_RESET  = "\u001B[0m";
    static String BOLD     = "\033[0;1m";
    static String c_BLUE   = "\u001B[34m";
    static String c_RED    = "\u001B[31m";
    static String c_GREEN  = "\u001B[32m";

    public void anaMenu() throws InterruptedException {
        System.out.println();
        System.out.println(BOLD+c_BLUE+"\t========================");
        System.out.println("\t  KITAP YÖNETİM PANELİ ");
        System.out.println("\t========================");
        System.out.println();
        System.out.println("1 - Kitap Ekleme ");
        System.out.println("2 - Kitap Görüntüleme ");
        System.out.println("3 - Kitap Silme ");
        System.out.println("4 - Kitapları Listeleme ");
        System.out.println("5 - Çıkış ");
        System.out.print("Seçiniz : "+c_RESET);

int secim=TryCatch.intGiris();
Islemler islem =new Islemler();
switch (secim) {
    case 1:
        System.out.println(BOLD + c_GREEN + " Kitap ekleme bölümüne yönlendiriliyorsunuz..." + c_RESET);
        Thread.sleep(2000);
        islem.bookAdding();
        break;
    case 2:
        System.out.println(BOLD + c_GREEN + " Kitap görüntüleme bölümüne yönlendiriliyorsunuz..." + c_RESET);
        Thread.sleep(2000);
        islem.bookSearching();
        break;
    case 3:
        System.out.println(BOLD + c_GREEN + " Kitap silme bölümüne yönlendiriliyorsunuz..." + c_RESET);
        Thread.sleep(2000);
        islem.bookDeleting();
        break;
    case 4:
        System.out.println(BOLD + c_GREEN + " Kitap listeleme bölümüne yönlendiriliyorsunuz..." + c_RESET);
        Thread.sleep(2000);
        islem.bookListing();
        break;
    case 5:
        islem.cikis();
        break;
    default:
        System.out.println(BOLD + c_RED + "***Hatalı giriş***" + c_RESET);
        anaMenu();
        break;

}

    }
}
