package j11_Arrays.Tasks;

import java.util.Arrays;

/*
Bu String'i oluşturunuz.  "Hello World"
"o" harfleri yerine "K" yerleştiriniz.
Sonuç bu şekilde olmalıdır:
HellK WKrld
 */
public class _14_String_method_replace {

    public static void main(String[] args) {
        String hi[]={"Hello World"};
        System.out.println(Arrays.toString(hi).replace('o', 'K'));

    }
}
