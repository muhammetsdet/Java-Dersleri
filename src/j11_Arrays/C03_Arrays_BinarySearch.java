package j11_Arrays;

import java.util.Arrays;

public class C03_Arrays_BinarySearch {
    public static void main(String[] args) {
        // Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu

        int sayiArr[] ={23,44,2,11,55,60,32,34,59,22,9,64,43};

        int sayi1=44;
        int sayi2=20;
        System.out.println("   ***   amele code   ***   ");
        boolean flag=false;//bayrak aşağı

        for (int i = 0; i < sayiArr.length; i++) {

            if (sayiArr[i]==sayi2){
                flag=true;
                break;
            }

        }
        System.out.println(flag ? "aradağınız sayı arrayde var" : "aradığınız sayı arrayde yok");
        System.out.println("   ***   cincix code   ***   ");
        Arrays.sort(sayiArr);//sortingen-> ascending k->b sıralandı
        System.out.println("Array de 20 nin varlıgı = " + Arrays.binarySearch(sayiArr, sayi2));// -4
        System.out.println("Array de 44 nin varlıgı = " + Arrays.binarySearch(sayiArr, sayi1));// 8
        System.out.println("sayiArr[8] = " + sayiArr[8]);//44

    }
    }

