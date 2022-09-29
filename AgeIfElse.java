import java.util.Scanner;

public class AgeIfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int num = in.nextInt();

        if (num >= 19)
            System.out.println("성년!");
        else
            System.out.println("미성년!");

        System.out.println("종료");
    }
}