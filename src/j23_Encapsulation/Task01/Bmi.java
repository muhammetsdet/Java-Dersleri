package j23_Encapsulation.Task01;

public class Bmi {//pojo Class
    // fields -> name, age, weight,height: encapsulated
    private String name;
    private int age;
    private double weight;
    private double height;

    //const.
    public Bmi(String name, int age, double weight, double height) {//full p'l cons.
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // task methods...
    public double getBMI() {
        return weight / (height * height);

    }

    public String getStatus() {
        if (getBMI()<18.5) {
            return "zayıf";
        } else if (getBMI()<25) {
            return "normal";
        } else if (getBMI()<30) {
            return "kilolu";
        }else return "obez";

    }    // getter-setter


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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //toString..


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age +
                        ", weight=" + weight +
                        ", height=" + height+" "+getStatus()+" "+getBMI();
    }
}
