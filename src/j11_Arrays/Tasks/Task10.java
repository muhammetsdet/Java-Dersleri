package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Collections;

/* TASK :
bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
input : 1,2,-3,4,-5,-6
output :-1,-2,3,-4,5,6

 */
public class Task10 {
    public static void main(String[] args) {
      int num[]={1,2,-3,4,-5,-6};
        for (int i = 0; i <num.length ; i++) {
            System.out.print(0-num[i] +" ");
        }

    }
}
