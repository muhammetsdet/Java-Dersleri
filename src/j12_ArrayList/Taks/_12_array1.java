package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;

/*
  dupicate() isminde bir method oluşturun.
  Parametresi int Array olmalı
  Return tipi boolean
  Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
  Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.

  Örnek1:
  Input: [1,2,3,1]
  Output: true

  Örnek 2:
  Input: [1,2,3,4]
  Output: false
       */
public class _12_array1 {
    public static void main(String[] args) {
        ArrayList<Integer> dublicateNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(dublicateNumbers);
//        System.out.println(dupicate(dublicateNumbers));
//    }
//    private static boolean dupicate(ArrayList<Integer> num) {
//        boolean duplicate=true;
//        for (int i = 0; i <num.size() ; i++) {
//            for (int j = 1; j <num.size() ; j++) {
//                if (i==){
//                    return  duplicate;
//                }
//            }
//        }
//        return false;
//    }
    }
}
