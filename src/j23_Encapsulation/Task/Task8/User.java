package j23_Encapsulation.Task.Task8;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    /*
     1- filedları id, username, password, active (boolean), signedIn (boolean)
        olan User isimli bir pojo class create ediniz.
     4- UserMain isminde main için bir class cteate ediniz.
     5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
        active ve signedIn default olarak true, false atayabilirsiniz.
        id yi sistem otomatik versin.,
     6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
        6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.
     */
int id;
String username;
static String password;
boolean active=true;
boolean signed =true;


    public User() {
        id = (int) (Math.random() + 1) * 1000;
    }


    public User(int id, String username, String password, boolean active, boolean signed) {
        this.id = id;
        this.username = username;
        setPassword(password);
        this.active = active;
        this.signed = signed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
            this.password = password;

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }
public static void userEkle(){
    Scanner input =new Scanner(System.in);

    ArrayList<User> list = new ArrayList<>();

    for (int i = 1; i < 3; i++) {
        User user=new User();
        System.out.println("Write your " + i + ". username -> ");
        user.setUsername(input.nextLine());
        while (true){
            try{System.out.println("Write your " + i + ". usernamePasword -> ");
            user.setPassword(input.nextLine());
            if(password.length()<6){
                throw new IllegalArgumentException();
            }else{break;}}
                catch (IllegalArgumentException e) {
            System.out.println("password 6 haneden az olamaz");}
    }

        list.add(user);
    }

    for (User user : list) {
        System.out.println(user);
    }
}

    @Override
    public String toString() {
        return
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", active=" + active +
                ", signed=" + signed ;
    }
}
