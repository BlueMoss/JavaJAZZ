//클래스
class Triangle {
    private double side; // 밑변
    private double height; // 높이

    // 생성자
    public Triangle(double height, double side) {
        this.height = height;
        this.side = side;
    }

    // 접근자
    public double getSide() {
        return side;
    }

    // 접근자
    public double getHeight() {
        return height;
    }

    // 문제에서 주어진 함수(findArea())
    public double findArea() {
        return side * height * 0.5;
    }

    // 추가된 메서드
    public boolean isSameArea(Triangle k) {
        if (k.findArea() == findArea())
            return true;
        else
            return false;
    }
}

public class TriangleTest_Modify {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));

    }
}