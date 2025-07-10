package oops;

public class animal
{
    int id;
    String name;

    public animal(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void print1()
    {
        System.out.println("animal " + this.id + " " + this.name);
    }
}