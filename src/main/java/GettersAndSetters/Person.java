package GettersAndSetters;

public class Person {
    private String firstName;
    private String lastName;

    public String getName(){
        return firstName;
    }

    public void setName(String l){
         this.firstName = l;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
