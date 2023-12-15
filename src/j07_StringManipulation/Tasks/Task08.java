package j07_StringManipulation.Tasks;

public class Task08 {
    /*  TASK :
Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
*/
    public static void main(String[] args) {
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("M=" + harfDepo.indexOf("M") + " U=" + harfDepo.indexOf("U") + " H="+ harfDepo.indexOf("H")
                + " A=" +harfDepo.indexOf("A") + " E="+ harfDepo.indexOf("E") +
                " T=" +harfDepo.indexOf("T"));
        System.out.println(""+harfDepo.charAt(12) + harfDepo.charAt(20) + harfDepo.charAt(7) + harfDepo.charAt(0) + harfDepo.charAt(12)
                + harfDepo.charAt(12) + harfDepo.charAt(4) + harfDepo.charAt(19));

        System.out.println(harfDepo.charAt(harfDepo.indexOf("M")));
        System.out.println(harfDepo.indexOf("M"));
        System.out.println(harfDepo.charAt(12));

    }
}
