package j24_Inheritance.Task01;

public class Runner_A_B {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.fruit);//bad practice
        System.out.println(A.fruit);
        System.out.println(B.fruit);

        B b=new B();
        System.out.println(b.fruit);//bad practice
        System.out.println(B.fruit);
        System.out.println(A.fruit);
    }
}
