package j11_Arrays;

import java.util.Arrays;

public class C02_ArrayPractice {
    public static void main(String[] args) {
        String[] isimArr = {"Muhammed", "Sebnem", "Musa", "Ayse", "Sennur", "Recep"};
        int sayiArr[] = {20, 32, 7, 58, 63, 59, 35, 17, 16, 21};
        //Task01-> sayıArr cift index elemanlarını print eden code create ediniz...
        System.out.println("   ***   task02   ***   ");


        // for (int i = 0; i < sayiArr.length; i++) {
        //     if (i%2 ==0 ) {
        //         System.out.print(i+". index eleman : "+sayiArr[i]+", ");
        //     }

        // }
        for (int i = 0; i < sayiArr.length; i += 2) {
            System.out.print(i + ". index eleman : " + sayiArr[i] + ", ");
        }
        System.out.println();
        System.out.println("   ***   task02   ***   ");
        //Task02-> isimArray de 5 karakterden fazla olan elemanları print eden code create ediniz...

        for (int i = 0; i < isimArr.length; i++) {// array eleman saysı kadar tekrar tanımlandı
            if (isimArr[i].length() > 5) {// tekrardan gelen herbr array elemanı karakter sayısı 5 den buyuk olma sartı tanımlandı
                System.out.print(isimArr[i] + " ");
            }
        }
        System.out.println();

        //Task03-> isimArray de 6 karakterden az olan elemanı depolayan(store eden) arrayı print eden code create ediniz..
        System.out.println("   ***   task03   ***   ");
        // String[] isimArr = {"Muhammed", "Sebnem", "Musa", "Ayse", "Sennur", "Recep"};
        int yeniArrElemanSayisi = 0;// yeniArr için eleman sayısı tanımlandı

        // String yeniArr[] = new String[isimArr.length];//isimArr elaman sayısı: 6 kadar boş arr tanımlandı


        for (int i = 0; i < isimArr.length; i++) {// isimArr elemanı kadar loop tanımlandı
            if (isimArr[i].length() < 6) {//loopdan gelen herbir isimArr elemanı karakter sayısı 6 dan az olma sartı
                yeniArrElemanSayisi++;
            }
        }
        System.out.println("yeniArrElemanSayisi = " + yeniArrElemanSayisi);//3
        //String yeniArr[] = new String[isimArr.length];//isimArr elaman sayısı: 6 kadar boş arr tanımlandı

        String yeniArr[] = new String[yeniArrElemanSayisi];//isimArr elaman sayısı: 6 kadar boş arr tanımlandı
        int yeniArindex = 0;

        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length() < 6) {//loopdan gelen herbir isimArr elemanı karakter sayısı 6 dan az olma sartı
                yeniArr[yeniArindex] = isimArr[i];// 6 karakterden az olan isimArr elamanı yeniArr'e atandı
                yeniArindex++;
            }
        }
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));//[Musa, Ayse, Recep]
    }

    }
