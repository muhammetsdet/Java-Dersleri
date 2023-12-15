package j11_Arrays.Tasks;
/*
TASK :
$ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
*/

public class Task11 {
    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        int toplam$ =0;
        int toplam£ =0;
        String para[]= str.split(" ");
        for (int i = 0; i <para.length ; i++) {
            if (para[i].contains("$")){
               toplam$ += Integer.parseInt(para[i].replace("$", ""));
            }else {
                toplam£ += Integer.parseInt(para[i].replace("£", ""));
            }
        }
        System.out.println("toplam$ --> " +toplam$);
        System.out.println("toplam£ --> "+ toplam£);
    }
}
