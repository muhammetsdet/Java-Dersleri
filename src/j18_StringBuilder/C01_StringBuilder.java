package j18_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    /*
 String = > daha yavas ,Immutable==> degismez,
 String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.
  1) Java pass-by-value kullanir. -> makyaj dublor
  2) String Class'i immutable Class'dir. meth datayı değişmez
  StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
  StringBuffer synchronized,thread safe.
 StringBuilders = mutable==>degisebilir ,
 not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )
 1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
    StringBuilder isimli bir class uretmistir.
 2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
    "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
    "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
    "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
 3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
    Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
               */
    public static void main(String[] args) {

        String str="";
        StringBuilder sb=new StringBuilder();
        System.out.println(" *** str loop ***");
        LocalTime strStart=LocalTime.now();

        for (int i = 0; i <3333 ; i++) {
            str+=i;

        }

        LocalTime strFinish=LocalTime.now();

        System.out.println("Str run süresi " + (strFinish.getNano()-strStart.getNano()));

        System.out.println(" *** sb loop ***");
        LocalTime sbStart=LocalTime.now();

        for (int i = 0; i <3333 ; i++) {
            sb.append(i);
        }

        LocalTime sbFinish=LocalTime.now();
        System.out.println("Str run süresi " + (sbFinish.getNano()-sbStart.getNano()));
    }

}
