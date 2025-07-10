package Practise;

public class Student {
    int age;
    String name;

   public Student(int age, String name) {
       this.age = age;
       this.name = name;
   }


     void display()
    {
        System.out.println("My name is "+name + ". I am " + age+ " years old");
    }

     void sayHello(String Friend)
    {
        System.out.println(name + " says hello to "+ Friend);
    }
}
