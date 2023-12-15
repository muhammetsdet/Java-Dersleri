package j11_Arrays.Tasks;

import java.util.Arrays;

/*
Bu String'i oluşturun. "Removes white space from both ends of a string"
String'deki kelime sayısını yazdırınız.
 */
public class _15_Word_Count {
    public static void main(String[] args) {
        String str= "Removes white space from both ends of a string";
        String  newStr[]=str.split(" ");
        System.out.println(newStr.length);

    }
}
