package j11_Arrays.Tasks;
//Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
// elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
public class Task19 {
    public static void main(String[] args) {
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0;j< arr1[i].length&&j< arr2[i].length; j++) {
                int sum = arr1[i][j] + arr2[i][j];
                System.out.println("Toplam[" + i + j + "][" + i + j + "]: " + sum);
            }
        }
    }
}




