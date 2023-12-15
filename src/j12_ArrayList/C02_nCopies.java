package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C02_nCopies {
    public static void main(String[] args) {
        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
        ArrayList<String> ulkeList = new ArrayList<String>(Arrays.asList("Alamanya", "Güba", "Polkonyak", "Ameringonya", "Dingiltere"));
        ArrayList<String> isimList = new ArrayList<String>(Arrays.asList("Sennur", "Ferhat", "Merve", "Mustafa", "Sebnem"));

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7, "javaCAN"));// 7 javaCAN elemanlı list tanımlandı
        System.out.println("yeniList = " + yeniList);//[javaCAN, javaCAN, javaCAN, javaCAN, javaCAN, javaCAN, javaCAN]

        //addAll(list);-> girilen liste istene liste ekler..
        System.out.println("ulkeList ilk hali = " + ulkeList);// [Alamanya, Güba, Polkonyak, Ameringonya, Dingiltere]
        System.out.println("isimList ilk hali = " + isimList);// [Sennur, Ferhat, Merve, Mustafa, Sebnem]
        ulkeList.addAll(isimList);//ulkeListine isimList'i eklendi
        System.out.println("ulkeList'e isimList eklenmiş hali  = " + ulkeList);//[Alamanya, Güba, Polkonyak, Ameringonya, Dingiltere, Sennur, Ferhat, Merve, Mustafa, Sebnem]

        isimList.addAll(3, yeniList);
        System.out.println("isimList = " + isimList);//[Sennur, Ferhat, Merve, javaCAN, javaCAN, javaCAN, javaCAN, javaCAN, javaCAN, javaCAN, Mustafa, Sebnem]

    }
}
