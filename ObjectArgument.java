class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }

}

public class ObjectArgument {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(10.0);
        // Circle c3 = new Circle(15.0);

        zero(c1);
        System.out.println("원(c1)의 반지름 : " + c1.radius);

        zero(c2.radius);
        System.out.println("원(c2)의 반지름 : " + c2.radius);

        // zero(c3.radius);
        // System.out.println("원(c3)의 반지름 : " + c3.radius);

    }

    public static void zero(Circle c) {
        c.radius = 0.0;
    }

    public static void zero(double r) {
        r = 0.0;
    }

}