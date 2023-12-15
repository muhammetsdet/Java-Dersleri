package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("liste atamak içn sayı giriniz\nAgam yeter diyirsen 'q' gir ");

        String listSayılari = "";

        double toplam = 0;//list karelerini toplamı için boş kutu

        while (!listSayılari.equalsIgnoreCase("q")) {//while döngü girilen sayı q değilse action alır
            System.out.println(" Agam sayı giresen : ");
            listSayılari = input.nextLine();
            list.add(listSayılari);


        }
        System.out.println("agam girdiğin sayı listi : " + list);
        list.remove(list.size() - 1);//liste girilen son q elelmanı silinir
        System.out.println("q silinmiş kare toplamı almaya hazır hale gelen list :" + list);


        for (int i = 0; i < list.size(); i++) {
            //   toplam += Integer.parseInt(list.get(i)) * Integer.parseInt(list.get(i));
            toplam += Math.pow(Double.parseDouble(list.get(i)), 2);
        }
        //  for ( String w:list ) {
        //      toplam += Integer.parseInt(w) * Integer.parseInt(w);
        //  }


        System.out.println("agam girdigin sayılar toplamı : " + toplam);
    }
}
