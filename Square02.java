import java.util.Scanner;

public class Square02 {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n * n;
        System.out.println(a);
    }
}