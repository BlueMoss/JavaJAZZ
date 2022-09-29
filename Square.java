import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        while (true) {
            double prod = 1.0, r;
            int i, n;
            String again;
            Scanner input = new Scanner(System.in);
            System.out.print("실수 r : ");
            r = input.nextDouble();
            System.out.print("거듭제곱횟수 n : ");
            n = input.nextInt();
            for (i = 0; i < n; i++) {
                prod *= r;
            }
            System.out.println(prod);
            input.nextLine();
            while (true) {
                System.out.print("한번더??(Y/N)");
                again = input.nextLine();
                if (again.toLowerCase().equals("y") || again.toLowerCase().equals("n")) {
                    break;
                }
            }
            if (again.toLowerCase().equals("y"))
                continue;
            else
                break;
        }
    }
}