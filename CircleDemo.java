class Circle {
    double radius;
    // radius : 반지름값
    // 초기화하지 않았으므로 기본값은 0.0

    double findArea() {
        return 3.14 * radius * radius;
        // <radius> - 클래스의 멤버에 접근한다. radius 대신에 this.radius도 사용 가능
        // findArea() = 3.14 * 0 * 0

    }

    void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
        // x, y : argument
        // 반지름 = radius, 넓이 = findArea()
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        // 생성자를 호출하여 Circle 객체 생성
        // Circle -> myCircle

        myCircle.radius = 10.0;
        // myCircle 객체의 radius 필드를 의미함
        // 3.14 * 10.0 * 10.0

        myCircle.show(myCircle.radius, myCircle.findArea());
        // myCircle 객체의 show()와 findArea() 메서드를 의미함
    }
}