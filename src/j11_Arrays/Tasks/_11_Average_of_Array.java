package j11_Arrays.Tasks;

/*
int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
Array'in ortalamasını alınız.
 */
public class _11_Average_of_Array {
    public static void main(String[] args) {
int arr[]= {12, 14 , 21 ,23 , 10 ,4};
      int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum / arr.length);
    }

}
