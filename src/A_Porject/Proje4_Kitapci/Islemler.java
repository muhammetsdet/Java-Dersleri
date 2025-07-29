package A_Porject.Proje4_Kitapci;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Islemler {
    static String c_RESET = "\u001B[0m";
    static String BOLD = "\033[0;1m";
    static String c_BLUE = "\u001B[34m";
    static String c_RED = "\u001B[31m";
    static String c_GREEN = "\u001B[32m";
    static String c_CYAN = "\u001B[36m";
    static String c_PURPLE = "\u001B[35m";
    static Scanner scan = new Scanner(System.in);
    static List<Kitap> kitapList=new ArrayList<>(); //--> Direk kitap clasındaki değerleri alıp gelecek
    static List<Integer> kitapNoList=new ArrayList<>();
    static int kitapNo = 999;

Menuler menu=new Menuler();
    public void bookAdding() throws InterruptedException {
kitapNo++;
        System.out.println("Eeklemek istediğiniz kitabın adını giriniz: ");
        String name=TryCatch.stringGiris();
        System.out.println("Eeklemek istediğiniz kitabın yazarını giriniz: ");
        String yazar=TryCatch.stringGiris();
        System.out.println("Eeklemek istediğiniz kitabın fiyatını giriniz: ");
        int fiyat=TryCatch.intGiris();
        Kitap kitap=new Kitap(name,yazar,fiyat);
        kitapList.add(kitap);
      kitapNoList.add(kitapNo);
        System.out.println(BOLD + c_CYAN + "Kitap basarıyla eklendi"+c_RESET);
        Thread.sleep(2000);
        menu.anaMenu();

    }

    public void bookSearching() throws InterruptedException {
        System.out.println("\nKitap no ile görüntülemek için 1'e ");
        System.out.println("Kitap adı ile görüntülemek için 2'e ");
        System.out.print("Seçiniz : ");
        int secim = TryCatch.intGiris();
        if (secim==1){
            System.out.println("\n Görüntülemek istediğiniz kitabın numarasını giriniz: ");
            int no=TryCatch.intGiris();
            if (kitapNoList.contains(no)){
                int index=kitapNoList.indexOf(no);
                System.out.printf(BOLD + c_BLUE + "%20s%20s%20s%20s", "Kitap No", "Kitap Adı", "Yazar", "Fiyat" + c_RESET);
                System.out.println();
                System.out.printf("%20s%20s%20s%16s\n", no, kitapList.get(index).getName(),
                        kitapList.get(index).getYazar(), kitapList.get(index).getFiyat());
            }else{
                System.out.println(BOLD + c_RED + "\n Bu numarada bir kitap kayıtlı değildir. ");
            bookSearching();
            }
            Thread.sleep(2000);
            menu.anaMenu();

        } else if (secim==2) {
            System.out.println("\n Görüntülemek istediğiniz kitabın ismini giriniz->");
            String isim =TryCatch.stringGiris();
            int count=0;
            for(Kitap val:kitapList){
                if(val.getName().equalsIgnoreCase(isim)){
    int index=kitapNoList.indexOf(val);
                    System.out.println();
                    System.out.printf(BOLD + c_BLUE + "%20s%20s%20s%20s", "Kitap No", "Kitap Adı", "Yazar", "Fiyat\n" + c_RESET);
                    System.out.printf("%20s%20s%20s%16s", kitapNoList.get(index), val.getName(),
                            val.getYazar(), val.getFiyat());
                    System.out.println("\n");
                    Thread.sleep(2000);
                    menu.anaMenu();

                }   else {
                count++;
                }

                }
            if(count==kitapList.size()){
                System.out.println(BOLD + c_RED + "\n Bu isimde bir kitap kayıtlı değildir.");
                bookSearching();
            }

        }else{
            System.out.println("\n Hatalı giriş tekrar deneyiniz ");
            bookSearching();
        }

        }


    public void bookDeleting() throws InterruptedException {
        System.out.println("\n Silmek istediğiniz kitabın numarasını giriniz");
        int no=TryCatch.intGiris();
        if(kitapNoList.contains(no)){
            int veri=kitapNoList.indexOf(no);
            Kitap kTp=kitapList.remove(veri);
            kitapNoList.remove(no);
            System.out.println(BOLD+c_CYAN+ kTp+"Bu kitap silindi "+c_RESET);
            Thread.sleep(1000);
            menu.anaMenu();
        }else{
            System.out.println(BOLD+c_RED+"\nMevcutta böyle bir kitap bulunmamaktadrı.");
          bookSearching();
        }
    }

    public void bookListing() throws InterruptedException {
if(!kitapNoList.isEmpty()){
    System.out.printf(BOLD + c_BLUE + "%20s%20s%20s%20s", "Kitap No", "Kitap Adı", "Yazar", "Fiyat" + c_RESET);
    System.out.println();
    for (Kitap val:kitapList){
        int index=kitapList.indexOf(val);
        int kitapNo=kitapNoList.get(index);
        String name=val.getName();
        String yazar=val.getYazar();
        int fiyat=val.getFiyat();
        System.out.printf(BOLD + c_BLUE + "%20s%20s%20s%20s", kitapNo, name, yazar, fiyat + c_RESET);

    }

}else
    System.out.println("GÖrüntülenecek kitap yoktur");
Thread.sleep(1000);
menu.anaMenu();


    }

    public void cikis() {
        System.out.println(BOLD + c_GREEN + "Çıkış yapıyorsunuz... \nYine bekleriz" + c_RESET);
    }
}
