package Proje4_Kitapci;

public class Menuler {
    static String c_RESET  = "\u001B[0m";
    static String BOLD     = "\033[0;1m";
    static String c_BLUE   = "\u001B[34m";
    static String c_RED    = "\u001B[31m";
    static String c_GREEN  = "\u001B[32m";

    public void anaMenu() {
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


    }
}
