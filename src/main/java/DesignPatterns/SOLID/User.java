package DesignPatterns.SOLID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//S – Single Responsibility Principle (SRP)
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

}

class UserRepository
{
    public void saveData(User u)
    {

        System.out.println("User saved : "+u.getName()+", "+u.getEmail());
    }
}

class Print
{
    public static void main(String[] args) {
        User u = new User("shameer", "Kingexpt@gmail.com");
        UserRepository r = new UserRepository();
        r.saveData(u);

    }
}
