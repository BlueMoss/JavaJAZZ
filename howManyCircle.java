class ManyCircle {
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public ManyCircle(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }

}

public class howManyCircle {
    public static void main(String[] args) {
        ManyCircle myCircle = new ManyCircle(10.0);
        ManyCircle yourCircle = new ManyCircle(5.0);

        System.out.println("원의 갯수 : " + ManyCircle.numOfCircles);
        System.out.println("원의 갯수 : " + yourCircle.numCircles);

    }

    void print() {
        System.out.println("인스턴스 메서드입니다.");

    }
}
