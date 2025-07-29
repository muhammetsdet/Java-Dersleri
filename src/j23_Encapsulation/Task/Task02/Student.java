package j23_Encapsulation.Task.Task02;

public class Student {
       /* StudentRunner ve Student classları create ediniz
    Student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz

    StudentRunner classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 48'dir.
    name Haluk'tur.

    output
        "Student name is Haluk"
                "He is 48 years old"
    */
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Student name is " + name + "\n" +
                        "He is " + age + " years old";
    }
}
