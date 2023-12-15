package j07_StringManipulation;

public class C12_replace_replaceAll {
    public static void main(String[] args) {
        /*replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */
        String str = "madem geldin dünyaya otur çalış JAVA'ya :)";// madem geldin dünyaya otur çalış JAVA'ya :)
        System.out.println("str = " + str);// madem geldin dünyaya otur çalış JAVA'ya :)
        System.out.println("str.replace(\"a\",\"*\") = " + str.replace("a", "*"));// m*dem geldin düny*y* otur ç*lış JAVA'y* :)
        System.out.println("str = " + str);// madem geldin dünyaya otur çalış JAVA'ya :)
        System.out.println("str.replace(\"yaya\",\"$\") = " + str.replace("yaya", "$"));// madem geldin dün$ otur çalış JAVA'ya :)
        System.out.println("str.replace('ü','U') = " + str.replace('ü', 'U'));//madem geldin dUnyaya otur çalış JAVA'ya :)
        System.out.println("str eski " + str);// madem geldin dünyaya otur çalış JAVA'ya :)
        str = str.replace(":)", "");
        System.out.println("str yeni  " + str);// madem geldin dünyaya otur çalış JAVA'ya

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
        //(Regular Expressions)
        //   \\s bosluk
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler
        str= "javaCAN'lara selam bolcana 123456780232 § $ # £ offer :) ";
        System.out.println("str = " + str);// javaCAN'lara selam bolcana 123456780232 § $ # £ offer :)
        System.out.println("str.replaceAll(\"\\\\s\",\"*\") = " + str.replaceAll("\\s", "*"));// javaCAN'lara*selam*bolcana*123456780232*§*$*#*£*offer*:)*
        System.out.println("str.replaceAll(\"\\\\S\",\"*\") = " + str.replaceAll("\\S", "*"));// ************ ***** ******* ************ * * * * ***** **
        System.out.println("str.replaceAll(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));// *******'**** ***** ******* ************ § $ # £ ***** :)
        System.out.println("str.replaceAll(\"\\\\d\",\"*\") = " + str.replaceAll("\\d", "*"));// javaCAN'lara selam bolcana ************ § $ # £ offer :)
        System.out.println("str.replaceAll(\"\\\\D\",\"*\") = " + str.replaceAll("\\D", "*"));// ***************************123456780232******************
    }
}
