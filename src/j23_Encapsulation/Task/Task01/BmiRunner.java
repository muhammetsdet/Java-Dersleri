package j23_Encapsulation.Task.Task01;

public class BmiRunner { public static void main(String[] args) {
    Bmi b1 = new Bmi("Merve", 30, 48, 165);
    // System.out.println("b1.getStatus() = " + b1.getStatus());//
    // System.out.println("b1.getBMI() = " + b1.getBMI());//
    System.out.println("b1 = " + b1);
    b1.setHeight(55);
    System.out.println("b1 = " + b1);

}


}
