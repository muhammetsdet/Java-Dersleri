package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;

/* TASK :
 * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
 * 8. elemaninin yerlerini degistirin.
 *
 * ORNEK:
 *
 * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
 * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
 */
public class Task07 {
    public static void main(String[] args) {
        ArrayList<String > isimlist=new ArrayList<String>(Arrays.asList("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println(isimlist);//[Haluk, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]
        String str8=isimlist.get(2);// Kemal temp atandı
        isimlist.set(2,isimlist.get(7));// 3. eleman Kemal  Furkan olarak update edildi
        isimlist.set(7,str8);// 8. eleman furkan iken kemal oldu

        System.out.println(isimlist);//[Haluk, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]
    }
    }

