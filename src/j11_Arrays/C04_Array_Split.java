package j11_Arrays;
import java.util.Arrays;
public class C04_Array_Split {
    public static void main(String[] args) {
        // String data type dataları Arrays'e elaman olarak cevirmek için split() meth kullanılır.

        String  str="javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";
        // task-> str'nin kelime ve harf sayısını print eden code create ediniz.

        String  kelimeArr[]=str.split(" ");// str " " gore parçalanıp herbir parça strArr'ye eleman olarak atandı
        System.out.println("str = " + str);
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(kelimeArr));
        System.out.println("str'nin kelime sayısı : " + kelimeArr.length);// 11

        String harfArr[]=str.replaceAll(" ","").split("");
        System.out.println("harfArr.length = " + harfArr.length);//83

    }
}
