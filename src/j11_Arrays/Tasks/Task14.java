package j11_Arrays.Tasks;

import java.util.Arrays;

/*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in the given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
public class Task14 {
    public static void main(String[] args) {
        String str = "ade1r4d3";
        String newStr=str.replaceAll("\\D","");
        String newArr[]=newStr.split("");
        int sum=0;
        for (int i = 0; i <newArr.length ; i++) {
            int digitValue = Integer.valueOf(newArr[i]);//int digitValue = Integer.parseInt(newArr[i]);
            sum += digitValue;
        }
        System.out.println(sum);
    }
    }

