package j11_Arrays.Tasks;
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

public class Task12 {
    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 5, 8, 9};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]*arr[i] + " ");
        }
    }
}
