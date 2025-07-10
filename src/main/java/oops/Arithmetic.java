package oops;

public class Arithmetic {
    int a;
    int b;
    int c;

    public Arithmetic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int print() {
        return a * b * c;
    }
}

 class question2
 {
     public static void main(String[] args) {
         Arithmetic a = new Arithmetic(1,4,6);
         int result = a.print();
         System.out.println(result);


     }
 }
