public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(0);
        Ball c2 = new Ball("RED");

        System.out.println("원 :");
        c1.getRadius();
        c1.findArea();

        System.out.println("\n공 :");
        c2.getRadius();
        c2.findColor();
        c2.findArea();
        c2.findVolume();
    }
}