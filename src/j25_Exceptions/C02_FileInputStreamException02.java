package j25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {//outher try blok-> file erişim exception
            FileInputStream fis = new FileInputStream("src/j25_Exceptions/ebikGabik");
            int k;//erişilen file her bir cahar ascii değerinin atanacagı boş kutu tanımlandı
            try {//inner try->blok erişilen file daki data okuma exception
                while ((k = fis.read()) != -1) {
                    System.out.print((char) k);
                }
                System.out.println("Agam inner try blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

            } catch (IOException e) {//inner catch blok-> file erişir fakat okuyamazsa bu catch blok calısır
                System.out.println("Agam istediğin adrese erişildi ama dosya yok akuyu çalmışlar ");
                System.out.println("Agam inner CATCH blok'dan selamkeee  bu cıktıyı okuduysan  try excp yakaladı  ");

            }
            System.out.println("Agam outher try blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");
        } catch (FileNotFoundException e) {//outher catch blok-> file erişemezse bu catch blok calısır.
            System.out.println("Agam dosyaya erişelemiyor.");
            System.out.println("Agam outher CATCH blok'dan selamkeee  bu cıktıyı okuduysan  try excp yakaladı  ");
            // throw new RuntimeException(e);



        }
        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
}
