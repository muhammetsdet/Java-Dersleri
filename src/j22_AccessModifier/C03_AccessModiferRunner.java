package j22_AccessModifier;

public class C03_AccessModiferRunner {
    private String privateName = "Feride javaNAZ";
    protected String protectedName = "Sahin javaHAN";
    String defaultName = "Merve javvaNUR";
    public String publicName = "sefil Haluk";

    public static void main(String[] args) {//main level
        // C01_AccessModifer obj1 = new C01_AccessModifer();//p'siz private const call edilemez

        C01_AccessModifer obj1 = new C01_AccessModifer(33, 40);//p'li public const call ile obj create edildi
        System.out.println("obj1.publicYas = " + obj1.publicYas);//farklı package public variable call edildi
        //obj1.protectedYas -> farklı packageden public olmayan parent-chil olmayan protected variable call edilemez:CTE
        //obj1.defaultYas-> farklı packageden public olmayan deafult variable call edilemez:CTE
        //obj1.privateYas-> farklı packageden public olmayan private variable call edilemez:CTE

        C03_AccessModiferRunner obj2 = new C03_AccessModiferRunner();

        System.out.println("obj2.privateName = " + obj2.privateName);//kendi Class'ından obj tum member'lara erişilebilir
        System.out.println("obj2.defaultName = " + obj2.defaultName);//kendi Class'ından obj tum member'lara erişilebilir
        System.out.println("obj2.protectedName = " + obj2.protectedName);//kendi Class'ından obj tum member'lara erişilebilir;//
        System.out.println("obj2.publicName = " + obj2.publicName);//kendi Class'ından obj tum member'lara erişilebilir
        // C01_AccessModifer.privateMethod();// static ama Class name ile call edilemeyen private meth
        // C01_AccessModifer.defaultMethod()// farklı package'den cals name işle static meth call edilemez
    }//main sonu
}
