package j11_Arrays.Tasks;

import java.util.Arrays;

// Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
public class Task06 {
    public static void main(String[] args) {
        arrangement();
    }
    private static void arrangement() {
        int num[]={4,85,3,2,98,15};
        Arrays.sort(num);
        for (int i = num.length-1; i >=0 ; i--) {
            System.out.print(num[i]+" ");
        }
    }
}
