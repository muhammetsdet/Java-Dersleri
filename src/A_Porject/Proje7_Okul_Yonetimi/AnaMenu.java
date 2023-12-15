package A_Porject.Proje7_Okul_Yonetimi;

public class AnaMenu{
    static String c_RESET  = "\u001B[0m";
    static String BOLD     = "\033[0;1m";
    static String c_BLUE   = "\u001B[34m";
    static String c_RED    = "\u001B[31m";
    static String c_GREEN  = "\u001B[32m";

    public void girisEkrani() {
        System.out.println(BOLD+c_BLUE+"====================================");
        System.out.println(" ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println();
        System.out.println("1 - Öğretmen Işlemleri ");
        System.out.println("2 - Öğrenci Işlemleri ");
        System.out.println("3 - Çıkış ");
        System.out.print("Seçiniz : "+c_RESET);

        int secim = TryCatch.intGirisi(); // burda tryCatch ile kontrol yapıyorum


    }

}
