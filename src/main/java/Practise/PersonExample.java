package Practise;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonExample {
    private int id;
    private String name;


    PersonExample(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
//default and parameterized constructors and getters and setters for encapsulation.

class GetterSetterExample {
    public static void main(String[] args) {
        PersonExample pe = new PersonExample(1, "John");
        pe.setId(2);
        pe.setName("Jane");
        System.out.println(pe.getId());
        System.out.println(pe.getName());

    }
}
