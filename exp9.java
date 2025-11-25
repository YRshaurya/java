abstract class Shape {
    int a, b; 

public abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }
    @Override
    public void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    @Override
    public void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        a = radius;
    }

    @Override
    public void printArea() {
        double area = Math.PI * a * a;
        System.out.println("Area of Circle: " + area);
    }
}

public class exp9 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(6, 8);
        Circle cir = new Circle(7);

        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}
