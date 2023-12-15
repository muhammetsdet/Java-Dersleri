package j11_Arrays.Tasks;
/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
public class Task21 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};
        boolean flag = false;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]!=arr[arr.length-1-i]){
                flag = true;
                break;
            }
        }
        String isSame= flag ? "Verilen Array ayna Array degildir...":"Verilen Array ayna Arraydir...";
        System.out.println(isSame);
    }
}
