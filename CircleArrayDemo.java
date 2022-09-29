//순서 2

class Circle {

    // 최종 추가
    double radius;

    // 순서 2-1_ 에러 내용 : Exception in thread "main" java.lang.Error: Unresolved
    // compilation problems: radius cannot be resolved or is not a field The method
    // findArea() is undefined for the type Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // 순서 2-3_ 에러 내용 : Exception in thread "main" java.lang.Error: Unresolved
    // compilation problem: radius cannot be resolved or is not a field
    public double getRadius() {
        return radius;
    }

    // 순서 2-2_ 에러 내용 : Exception in thread "main" java.lang.Error: Unresolved
    // compilation problem: The method findArea() is undefined for the type Circle
    double findArea() {
        return 3.14 * radius * radius;
    }

}

// 순서 1_ 에러 내용 : Exception in thread "main" java.lang.Error: Unresolved
// compilation problem: The constructor Circle(double) is undefined

public class CircleArrayDemo {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1.0);
            System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n",
                    circles[i].radius, circles[i].findArea());
        }
    }
}