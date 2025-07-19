package DesignPatterns.Builder.BuilderExample;

public class Main {
    public static void main(String[] args) {
        User u = new User.Builder().setAge(29).setName("shameer").setEmail("shameershaik28@gmail.com").build();
        u.printUserDetails();

    }
}
