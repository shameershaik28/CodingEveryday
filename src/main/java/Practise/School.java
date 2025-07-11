package Practise;

public class School {
    int id;
    String name;
    String Location;
    int ranking;


    public School() {
        this.id = 0;
        this.name = "";
        this.Location = "";
        this.ranking = 0;
    }
    public School(int id, String name, String location, int ranking) {
        this.id = id;
        this.name = name;
        Location = location;
        this.ranking = ranking;
    }

public void display()
{
    System.out.println(id + " " + name+ " " + Location + " " + ranking);
}
}

class ConstructorExample
{
    public static void main(String[] args) {
        School s = new School();
        s.display();

        School s1 = new School(2, "shameer", "Hyderabad", 3);
        s1.display();


    }
}
