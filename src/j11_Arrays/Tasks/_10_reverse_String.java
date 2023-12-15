package j11_Arrays.Tasks;

import java.util.Arrays;

/*
Bir String oluşturun : "Hello World"
Stringi tersten yazdırın ve print edin.
Cevap böyle olmalı :  "dlroW olleH"
Trick-> String split ile arraya atanmalı
 */
public class _10_reverse_String {
    public static void main(String[] args) {
        String hi= "Hello World";
        String hello[]= hi.split("");
        for (int i = hello.length-1; i >=0 ; i--) {
            System.out.print(hello[i]);
        }

    }
}
