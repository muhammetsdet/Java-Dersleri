package j25_Exceptions.Tasks.Task02;

import java.io.IOException;
import java.util.Scanner;

public class Task_02 {public static void main(String[] args) {
           /*
    Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
    edip mainde kontrol ediniz.

    Trick->
    sicaklikKontrol(int sıcaklık){
     throw new IOException("AGAM hava buz gibi dışarı çıkma");
            */
    Scanner input = new Scanner(System.in);
    System.out.println("Agam ıscaklık giresen : ");
    int sıcaklık = input.nextInt();

    try {
        sicaklikKontrol(sıcaklık);//meth call denecek throw çalışırsa catche gidecek
    } catch (IOException e) {

        System.out.println(e.getMessage() + " Agam hava coğğ soguk çıkma dedik simdi  buz kırıyon :( ");
        System.out.println("Agam bu cıktıyı okuduysan TRY excp fırlattı catch'de handle edildi");
    }
    System.out.println("Agam bu cıktıyı okuduysan app. gayet başarılı run edildi dewamkeee :) ");

}//main sonu

    public static void sicaklikKontrol(int sicaklik) throws IOException {
        if (sicaklik < 10) {
            throw new IOException("AGAM hava buz gibi dışarı çıkma");
        } else System.out.println("Agam hava gayet cıncıx  :) ");
    }
}
