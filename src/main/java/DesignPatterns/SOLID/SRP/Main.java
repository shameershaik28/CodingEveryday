package DesignPatterns.SOLID.SRP;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(29, "Shaik Shameer", "Concentrix", 3, "Shameershaik28@gmail.com"); // this calls the constructor and save these details in to our variables
        PrintUserDetails p = new PrintUserDetails();
        p.print(s);
    }
}
