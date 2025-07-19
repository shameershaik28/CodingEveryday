package DesignPatterns.SOLID.SRP;

public class PrintUserDetails {
    public void print(Student s)
    {
        System.out.println("Employee Details :");
        System.out.println("Name: "+s.getFullName());
        System.out.println("Age: "+s.getAge());
        System.out.println("Years of Experience: "+s.getYearsOfExperience());
        System.out.println("Email: "+s.getEmail());
        System.out.println("Current Company: "+s.getCurrentCompany());
    }
}
