package jazz;

class Circle0 {
    int radius;

    Circle0(int radius) {
        this.radius = radius;
    }

    void show() {
        System.out.println("반지름이 " + radius + "인 원이다.");
    }
}

class ColoredCircle extends Circle0 {
    String color;

    ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    void show() {
        System.out.println("반지름이 " + radius + "인 " + color + "원이다.");
    }
}

public class jazz01 {
    public static void main(String[] args) {
        Circle0 c1 = new Circle0(5);
        ColoredCircle c2 = new ColoredCircle(10, "빨간색");

        c1.show();
        c2.show();
    }
}