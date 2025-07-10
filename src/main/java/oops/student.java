package oops;

 public class student {
    static String schoolName = "ABC";

    String name;

    public student(String name) {
        this.name = name;
    }

    static void nameChange(String newName)
    {
        schoolName = newName;
    }


    public void print()
    {
        System.out.println("Name : "+ name + ",  School : "+ schoolName);
    }

}




