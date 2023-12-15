package j11_Arrays.Tasks;

import java.util.Arrays;

/*
Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
Bütün 2'leri 6'yla değiştirin.
Array'i yazdırınız.
 */
public class _17_2d_Array {
    public static void main(String[] args) {
        int arr2D[][]={{2,3,2} , {4,1,5} , {7,2,5}};
        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                if (arr2D[i][j] == 2){
                  arr2D[i][j] =6;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr2D));
    }
}
