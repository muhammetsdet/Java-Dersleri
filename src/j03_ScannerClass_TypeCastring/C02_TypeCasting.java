package j03_ScannerClass_TypeCastring;
/*
        Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                      byte < short < int < long < float < double
        Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
 */
public class C02_TypeCasting {
    public static void main(String[] args) {
        boolean success = true;
        System.out.println("Is he success :" + success);
        String successFull = String.valueOf(success);
        System.out.println("He is successfull :" + successFull);

        double number1 = 33.45;
        int number2 = 25;
        int number3 = 13;

        System.out.println("number2/number3 : " + number2/number3);

        int number10 = 7;
        number10*=3;
        System.out.println(number10);

        int x=10;
        System.out.println(++x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x++);


    }

}
