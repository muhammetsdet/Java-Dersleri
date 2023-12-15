package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;

/*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */
public class _10_arraylist12 {
    public static void main(String[] args) {
        ArrayList<Integer> betweenNum=new ArrayList<>(Arrays.asList(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        System.out.println("CountOfNumbers= "+rangeBtw(betweenNum, 20, 30));
    }
    private static int rangeBtw(ArrayList<Integer> betweenNum,int num1,int num2) {
        ArrayList<Integer> newNum=new ArrayList<>();
        int count=0;
        for (int i = 0; i <betweenNum.size() ; i++) {
            if (betweenNum.get(i)>=num1 && betweenNum.get(i)<=num2){
                newNum.add(betweenNum.get(i));
                count++;
            }
        }
        System.out.println(newNum);
        return count;

    }
}
