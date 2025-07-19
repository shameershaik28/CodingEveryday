package DesignPatterns.SOLID.SRP;

import lombok.Getter;

@Getter
public class Student {
    //private for encapsulation
   private final int age;
   private final String fullName;
   private final String currentCompany;
   private final int YearsOfExperience;
   private final String email;



   Student(int age, String fullName,  String currentCompany, int YearsOfExperience, String email) {
       this.age = age;
       this.fullName = fullName;
       this.YearsOfExperience =   YearsOfExperience;
       this.currentCompany =  currentCompany;
       this.email = email;
   }
}
