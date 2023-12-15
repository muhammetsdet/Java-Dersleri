package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Collections;

/*
Task-> Verilen  bir arrayin tum elemanlarini
bir sonraki konuma print eden code create ediniz
input:  [1,2, 3]
output [2, 3, 1]
*/
public class Task03 {
    public static void main(String[] args) {
        int num[]={1,2,3};
        int newNum[]=new int[num.length];
        for (int i = 0; i <num.length-1 ; i++) {
            newNum[i]=num[i+1];
        }
        newNum[num.length-1] = num[0];
        System.out.println(Arrays.toString(newNum));
    }
}
