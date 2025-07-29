package j25_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {//Class level

    public static void main(String[] args) {//main level
        //  ArithmeticException -> matematksel(Arithmetic) işlemlerde olusan Run Time Exception type'dir.

        Scanner input = new Scanner(System.in);
        System.out.print("Agam  1. sayısı giresen : ");
        int sayi1 = input.nextInt();
        System.out.print("Agam  2. sayısı giresen : ");
        int sayi2 = input.nextInt();
        // int bolum = sayi1 / sayi2;
        // System.out.println("bolum = " + bolum);// RTE->ArithmeticException

        try {//dene-> hatanın(exception:istisna) olam ihitmali olan action blok->benzin depo kontrolu->bi bakıve gari blok
            System.out.println("try blok run edildi...");
            System.out.println(sayi1 / sayi2);//emin olunmayan denenmesi bibakıverilmesi gereken action komut
            System.out.println("try blok'dan selamkeee");
             /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz. catch block try block exception yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynı anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE

             */

            // } catch (Exception ebikGabık) {//parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
        } catch (
                ArithmeticException ebikGabık) {//yakala->try blok denen istyisnai durum gerçekleşirse yapılması gereken handling-> action
            System.out.println("1.catch blok run edildi...");
            System.out.println("Agam nişledingg sıfır hiç böler mi? " + ebikGabık.getMessage());//exc mesajı print eder
            ebikGabık.printStackTrace();//exc. tum cıktıyı print eder->gılgamış
            System.out.println("1.catch blok'dan selamkeee");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2.catch blok run edildi...");
            System.out.println("2.catch blok'dan selamkeee");
        } catch (Exception e) {//Exception-> tun Excp turlarin parent Clss'ı:Hz.Adem

            // Exception -> olusan istisna data type
            // ebikGabık-> java'nın olusan Exc. atanacak obj name: best practice->e
            System.out.println("Hz.Adem catch blok run edildi...");
            System.out.println("Hz.Adem catch blok'dan selamkeee");
        }
        finally {//ne yaparsan sonunda bunu yap blok -> catch bloklardan sonra mutlaka çalışması istenen action için tanımlanır.kontagı kapat action
            System.out.println("agam finally  blok'dan selamkeee");
     /*
            try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
            hata alınır ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hata olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
             */
        }
        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur.
    }// main sonu
}//Class sonu