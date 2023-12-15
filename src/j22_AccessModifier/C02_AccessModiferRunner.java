package j22_AccessModifier;

public class C02_AccessModiferRunner {
    public static void main(String[] args) {
        C01_AccessModifer obj = new C01_AccessModifer(42, 49);//p'li public const call ile obj create edildi
        // C01_AccessModifer obj1 = new C01_AccessModifer();//p'siz private const call edilemez
        System.out.println("obj.publicYas = " + obj.publicYas);
        System.out.println("obj.protectedYas = " + obj.protectedYas);
        System.out.println("obj.defaultYas = " + obj.defaultYas);
        // System.out.println("obj.privateYas = " + obj.privateYas);//
        C01_AccessModifer.defaultMethod();
        // C01_AccessModifer.privateMethod();//

    }
}
