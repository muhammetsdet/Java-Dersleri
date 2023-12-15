package j25_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    /*
             Dosya okuma/yazma işlemi bu işlemlerde hata ihtimali yüksek olduğu için  hata kontrolü zorunlu tutuluyor.
             bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surunlara karşılk gelen hatalara Checked Exception denir
             Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


            Bir code create edilirken olasi exception'lar ongorulup exception olustugunda Java'nin ne yapmasini istedigimiz
            belirtilmelidir.


                     1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                 kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                     2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                 FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                 FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                 Class'inin parent class Hz.Adem
         */
    // public static void main(String[] args) throws FileNotFoundException {//main meth signature level exception(throws) zorunlu tanımlandı
    public static void main(String[] args) throws IOException {//main meth signature level exception(throws) zorunlu tanımlandı
        FileInputStream fis=new FileInputStream("src/j25_Exceptions/ebikGabik");
        //fis-> path(yolu:kaynagı) tanımlana file erişim saglayan obj create edildi
        // FileNotFoundException -> erişilmesi gereken filepath (dosya kaynagı) yanlışsa isitisnası:adres yanlışsa

        int k;
        while ((k=fis.read())!=-1){//fis obj ile read() meth erişilen dosyadaki her bir char ascii değeri -1 olayana kadar tekrar tanımlandı
            System.out.print((char)k);//k int  ascii olan file değeri char ici casting-> type dönüşümü
        }


        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
}
