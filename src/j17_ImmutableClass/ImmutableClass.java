package j17_ImmutableClass;

import java.util.ArrayList;

public class ImmutableClass {
    public static void main(String[] args) {
           /*
		  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
		  BigDecimal, BigInteger java’da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class’lardır.
		 */
        String name = "Seckin";

        System.out.println("   ***   immutable Class   ***   ");

        System.out.println("meth call oncesi name : "+name);//  Seckin
        name.concat(" askın olayım :-) ");
        System.out.println("meth call sonrası name : "+name);//  Seckin

        System.out.println("   ***   mutable Class   ***   ");

        ArrayList<String > isimList = new ArrayList<String>();
        System.out.println("meth call oncesi isimList : "+isimList); // []
        isimList.add("Can");
        isimList.add("Icardi");
        isimList.add("Muslera");
        System.out.println("meth call sonrası isimList : "+isimList); // [Can, Icardi, Muslera]



    }
}
