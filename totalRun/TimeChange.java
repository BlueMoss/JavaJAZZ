import java.util.Scanner;

public class TimeChange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("초 단위 정수를 입력하세요 : ");
        int s = scanner.nextInt();

        int h = s / 3600;
        int m = s % 3600 / 60;
        int se = s % 3600 % 60;

        System.out.println(h + "시간" + m + "분" + se + "초");
    }
}