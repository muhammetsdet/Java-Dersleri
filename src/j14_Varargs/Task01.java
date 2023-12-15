package j14_Varargs;

public class Task01 {
    public static void main(String[] args) {
         /*
        Task -> verilen Stringleri birlestiren concat isimli METHOD create ediniz.

        input : "h", "a", "l", "u", "k";
        output : haluk

        input : "a", "l", "i";
        output : ali

         */
        String arr[]={"S", "e", "n", "n", "u", "r"};
        concat("h", "a", "l", "u", "k");
        concat("a", "l", "i");
        concat(arr);
        System.out.println("concatAyseStyle(arr) = " + concatAyseStyle("A", "Y", "S", "E", " :-)"));

    }// main sonu

    private static void concat(String...str) {
        String  yeniStr="";// boş kutu tanımlandı
        for (String  avuc:str) {
            //yeniStr+=avuc;
            yeniStr=yeniStr.concat(avuc);
        }
        System.out.println(yeniStr);
    }
    private static String  concatAyseStyle(String...str) {
        String  yeniStr="";// boş kutu tanımlandı
        for (String  avuc:str) {
            //yeniStr+=avuc;
            yeniStr=yeniStr.concat(avuc);
        }
        return yeniStr;
    }

}
