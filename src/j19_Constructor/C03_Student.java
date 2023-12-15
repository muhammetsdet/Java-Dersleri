package j19_Constructor;

public class C03_Student {
String ad;
String soyAd;
int sinif=9;
double ortalama;
int okulNo;
boolean takdirBelgesi;


    public C03_Student(String ad, String soyAd, int sinif, double ortalama, int okulNo, boolean takdirBelgesi) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.sinif = sinif;
        this.ortalama = ortalama;
        this.okulNo = okulNo;
        this.takdirBelgesi = takdirBelgesi;
    }

    public C03_Student() {

    }

    public static void main(String[] args) {
C03_Student s1=new C03_Student();
C03_Student s2=new C03_Student("JavaNur", "JavaSU",11,19.3,571,false);
s1.ad="Bahtiyar";
s1.soyAd="JavaHan";
s1.okulNo=1453;
s1.ortalama=99;
s1.sinif=12;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.mezuniyet(s1.ortalama));
        System.out.println(s2.mezuniyet(s2.ortalama));
        s1.sosyalFaaliyet();
        s2.sosyalFaaliyet();
    }
    public String mezuniyet(double ortl){
       return ortl>50? " Mezun oldunuz ": "Mortingen strousse";
    }
    public void sosyalFaaliyet(){
        System.out.println("Agam sizi sadece mangal başında sosyal görüyoruz");
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi;
    }
}
