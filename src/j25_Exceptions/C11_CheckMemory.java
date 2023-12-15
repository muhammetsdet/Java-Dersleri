package j25_Exceptions;

import java.util.Date;

public class C11_CheckMemory {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory() = " + rt.totalMemory());//
        System.out.println("Loop oncesi Free Memory = " + rt.freeMemory());//


        Date d = null;
        for (int i = 0; i < 10000; i++) {//obj cretae eden lopp tanımlandı->memory yukelemsi yapıldı
            d = new Date(i);//cılgınlar gibi 10000 tene obj create edildi
            // d = null;
        }
        System.out.println("Loop sonrası Free Memory = " + rt.freeMemory());//
        rt.gc();//rt obj ile garbage collector  JVM de silmesi içim gc() meth call edildi

        System.out.println("gc(silinme ) sonrası Free Memory = " + rt.freeMemory());//
        // GC tum olusturalan objeleri silmeyi garanti etmedigi icin After GC Free Memory farkliliklar gosterebilir.
    }
}
