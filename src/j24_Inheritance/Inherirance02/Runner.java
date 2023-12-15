package j24_Inheritance.Inherirance02;

public class Runner {

    public static void main(String[] args) {
        // DataType obj = new Constructor();
        Kedicik k1 = new Kedicik();//Kedicik Class data type obj create edilid
        System.out.println("k1.a = " + k1.a);// 0
        System.out.println("k1.c = " + k1.c);// 2
        System.out.println("k1.d = " + k1.d);// 7
        System.out.println("k1.m = " + k1.m);// 1

        System.out.println("   ***   ");

        Mammal k2 = new Kedicik("zuzu");//Mammal data type obj create edildi
        System.out.println("k2.a = " + k2.a);// 0
        System.out.println("k2.c = " + k2.c);// 4
        // System.out.println("k2.d = " + k2.d);//CTE -> dataType Mammal Class'da d variable tanımlı değil
        System.out.println("k2.m = " + k2.m);// 1

        System.out.println("   ***   ");
        Hayvancik k3 = new Kedicik("pambik");//Hayvancık data type obj create edildi
        System.out.println("k3.a = " + k3.a);// 0
        System.out.println("k3.m = " + k3.m);// 3
        // System.out.println("k3.c = " + k3.c);//CTE -> dataType Hayvancık Class'da c variable tanımlı değil
        // System.out.println("k3.d = " + k3.d);//CTE -> dataType Hayvancık Class'da d variable tanımlı değil

     /*
 Ahan da trick köşesinde böğün->inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
 Variable araştırmaya data type Class'dan başlanıp parentlere gidilir.
 */

        System.out.println("   ***   ");

        k1.mA(); //mA -> HAYVANCIK Class meth. call edildi :)
        k1.mC(); //mC -> KEDİCİK Class meth. call edildi :)
        k1.mM(); //mM -> MAMMAL Class meth. call edildi :)

        System.out.println("   ***   ");

        k2.mA(); //mA -> HAYVANCIK Class meth. call edildi :)
        k2.mC(); //mC -> KEDİCİK Class meth. call edildi :)
        k2.mM(); //mM -> MAMMAL Class meth. call edildi :)
        System.out.println("   ***   ");
        k3.mA(); //mA -> HAYVANCIK Class meth. call edildi :)
        k3.mM(); //mM -> MAMMAL Class meth. call edildi :)

/*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj methodları  cons. göre call edilir
 method araştırmaya cons. Class'dan başlanıp parentlere gidilir
 */

    }
}
