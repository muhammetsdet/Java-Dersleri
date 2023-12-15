package j11_Arrays.Tasks;
// task-> asağıdaki sayi arr'deki en buyuk elemanı print eden code create ediniz...
public class Task17Good {
    public static void main(String[] args) {
        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
     int maxNum=arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                maxNum = Math.max(maxNum,arr[i][j]);
            }
        }
        System.out.println("Largest element is --> " + maxNum);
    }
}
/*

        int arr[][]={
                {3,5},//0. kat
                {2,14,1},//1. kat
                {6,1,2,22},//2. kat
        };
        int enb=0;
        for(int i=0; i<=2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > enb) {
                    enb = arr[i][j];
                }
            }
        }
        System.out.println("enbuyuk sayi = " + enb);
 */