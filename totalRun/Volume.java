import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("원기둥의 반지름 : ");
        int n = scanner.nextInt();

        System.out.print("원기둥의 높이 : ");
        int h = scanner.nextInt();

        double a = n * n * 3.14;
        double b = a * h;
        System.out.println(b);
    }
}