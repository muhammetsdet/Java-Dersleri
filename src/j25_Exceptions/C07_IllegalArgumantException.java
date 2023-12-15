package j25_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumantException {public static void main(String[] args) {
           /*
        ahan da TRİCK kosesinde bugun :)

        "throw" - throws" farkları
        1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
           "throw" -> method body içinde tanımlanır.
        2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
           "throw" -> keywordden sonra sadece bir tane exception tanımlanır
        3- "throws" -> keywordden sonra sadece exception class name yazılır
            "throw" ->  keywordden sonra exception obj tanımlanır
        4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
            "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
         */


    // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
    // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girilen değer için excp fırlatması için kullanılır..

    Scanner input = new Scanner(System.in);
    System.out.println("Agam yasını giresen : ");
    int yas = input.nextInt();
    try {
        if (yas < 18) {
            //throw new IllegalArgumentException("Agam bu " + yas + " yasda NAHsıl ehliyet alacan ALLLAN fasillesi  :(");
            hata();//throw excp meth call edildi
            //throw keyword ile data tpye'da Exc. obj tanımlanıp hata fırlatması yazıldı
            //Bu sekilde sartımıza uymayan bir case gelişirse (yas<18) javaya catch blokda hata handle edilmesi sağlandı
        } else System.out.println("Agam ehliyet hayırlı olsun bi tur verirsin gari :)");

        System.out.println("Agam  TRY blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage() + (18 - yas) + " yas daha buyumen lazım ");
        System.out.println("Agam nişleding bu yasda ehliyet mi alınır...");
        System.out.println("Agam  CATCH blok'dan selamkeee  try excp fırlattı ama handle edildi...  ");
    }
    System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

}//main sonu
    private  static void hata(){
        throw new IllegalArgumentException("Agam bu  yasda NAHsıl ehliyet alacan ALLLAN fasillesi  :(");
    }
}
