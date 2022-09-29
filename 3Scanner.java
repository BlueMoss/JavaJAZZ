import java.util.Scanner;

public class 3Scanner {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println(num + " (은) " + (num % 2 == 0 ? "짝수입니다." : "홀수입니다."));
    }
}