package GettersAndSetters;

public class main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("shameer");
        p.setLastName("shaik");

        System.out.println("My name is : " + p.getName());
        System.out.println("My last name is : " + p.getLastName());

        lambok l = new lambok();
        l.setAge(29);

        System.out.println("My age is : " + l.getAge());
    }
}
