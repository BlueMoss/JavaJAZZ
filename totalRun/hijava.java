
import java.util.Scanner;

public class hijava {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double a;

        double b;

        System.out.printf("너비를 입력하시오: ");

        a = s.nextDouble();

        System.out.printf("높이를 입력하시오: ");

        b = s.nextDouble();

        double n = a * b;

        double m = (a + b) * 2;

        System.out.println("직사각형 넓이: " + n);

        System.out.println("직사각형 둘레길이: " + m);

    }

}