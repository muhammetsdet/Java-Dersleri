package j23_Encapsulation.Task.Task03;

import java.time.LocalDate;
import java.time.Period;

public class Employees {
    /*  Task->
      Runner ve  Employees, class cerate ediniz
              Employees(Çalışanlar) class'ında;
      encapsulated variable'ları oluşturunuz;
      String name,
      int salary,
      String dob (date of birth) (Doğum tarihi)


      Runner class'ın içinde;
      obj ile
      Name is Fernando
      dob is 11/23/2000
      Salary is 80000

      Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. print ediniz.
      Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. print ediniz.
      Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have j12_Arrays.PassingArraysToMethods 80000 salary print ediniz..

      trick: ageCalculator isminde bir method için  Şuanki tarih - doğum yılı = employee age

     */
    private String name;
    private int salary;
    private LocalDate dateOfBirth;

    public Employees() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", salary=" + salary +
                        ", dateOfBirth='" + dateOfBirth;
    }

    public void ageCalculator() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2000, 11, 23);
        Period period = Period.between(birthDate, today);
        int age = period.getYears();
        if (age > 18) {
            System.out.println("Welcome to our company "+getName()+ " your salary is 80000");

        } else if (age < 18) {
            System.out.println("come back when you are 18 years old");

        } else {
            System.out.println("we can have inter with you after that you can have "+getSalary()+" salary");
        }

    }

}

