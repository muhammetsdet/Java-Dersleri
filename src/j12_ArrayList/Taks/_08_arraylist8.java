package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */
public class _08_arraylist8 {
    public static void main(String[] args) {
        ArrayList<Integer> secondMaxNum=new ArrayList<>(Arrays.asList(5,3,4,6,7));
        System.out.println(secondMax(secondMaxNum));
    }
    private static int secondMax(ArrayList<Integer> secondMaxNum){
        int bigestNum =0;
        int secondBigestNum=0;
        for (int i = 0; i <secondMaxNum.size() ; i++) {
            if (secondMaxNum.get(i)>bigestNum) {
                bigestNum = secondMaxNum.get(i);
            }
        }
        for (int j = 0; j <secondMaxNum.size() ; j++) {
            if (secondMaxNum.get(j)<bigestNum&&secondMaxNum.get(j)>=secondBigestNum){
                secondBigestNum=secondMaxNum.get(j);
            }
        }

        return secondBigestNum;
    }

    private static int secondMaxNum1(ArrayList<Integer> secondMaxNum) {
        Collections.sort(secondMaxNum);
        int secondMax = secondMaxNum.get(secondMaxNum.size() - 2);
        return secondMax;
    }
}
