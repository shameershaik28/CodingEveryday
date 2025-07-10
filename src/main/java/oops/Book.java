package oops;

public class Book {
    int id;
    String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void print2()
    {
        System.out.println("Book " + this.id + " " + this.title);
    }

}


