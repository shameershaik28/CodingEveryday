package DesignPatterns.Builder;

public class Student {
    private int age;
    private String name;
    private String phone;

    private Student(Builder h) {
        this.age = h.age;
        this.name = h.name;
        this.phone = h.phone;
    }

    public void display() {
        System.out.println("Student Age : " + age + " Student name : " + name + " Student phone : " + phone);
    }

    public static class Builder {
        private int age;
        private String name;
        private String phone;

      public Builder age(int age)
      {
          this.age = age;
          return this;
      }

      public Builder name(String name)
      {
          this.name = name;
          return this;
      }

      public Builder phone(String phone)
      {
          this.phone = phone;
          return this;
      }

      private void validate() {
         if(this.age < 18 )
         {
             throw new InvalidAgeException("Age must be 18 or older");
         }
         if(this.name == null || this.name.isEmpty())
         {
             throw new InvalidNameException("Name cannot be empty");
         }
         if(this.phone == null || this.phone.isEmpty())
         {
             throw new InvalidPhoneException("Phone cannot be empty");
         }
      }

      public Student build()
      {
          validate();
          return new Student(this);
      }
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student.Builder().age(29).name("shameer").phone("9908474968").build();
        s.display();
    }
    }
