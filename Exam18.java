import java.util.Scanner;

public class Exam18 {

    public static void main(String[] args) {
        // 직사각형의 넓이와 둘레 구하기
        Scanner scan = new Scanner(System.in);

        double wid = 0;
        double hei = 0;

        System.out.print("가로 길이: ");
        wid = scan.nextDouble();
        System.out.print("세로 길이: ");
        hei = scan.nextDouble();

        System.out.printf("사각형의 넓이는 %1.1f", wid * hei);
        System.out.printf("\n사각형의 넓이는 %1.1f", (wid + hei) * 2);
    }
}
