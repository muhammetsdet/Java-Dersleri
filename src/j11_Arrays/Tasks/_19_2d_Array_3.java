package j11_Arrays.Tasks;

import java.util.Arrays;

/*
Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
[{"new jersey","atlanta","ohio"} ,
{"Pittsburgh" ,"ohio","new york","ohio"} ,
{"ohio","new york"}]
Bütün ohio'ları Florida'yla değiştiriniz.
Array'i yazdırınız.
 */
public class _19_2d_Array_3 {
    public static void main(String[] args) {
        String arr2D[][]= {{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};
        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                if (arr2D[i][j]=="ohio"){
                    arr2D[i][j]="Florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(arr2D));
    }
}
