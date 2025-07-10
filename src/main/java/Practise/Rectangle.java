package Practise;

public class Rectangle {
    Point topLeft;
    int height;
    int width;

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return 2*( height * width);
    }

     Point bottomRight () {
        Point p = new Point();

        p.x = this.topLeft.x+this.width;
        p.y = this.topLeft.y-this.height;
        return p;
    }
}
