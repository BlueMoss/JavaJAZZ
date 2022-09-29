
import java.util.*;
import java.io.*;

public class Game01 {
    public static void main(String args[]) throws IOException {

        while (true) {

            // 0 ~ 2 사이의 난수를 발생.
            Random r = new Random();
            int AI = Math.abs(r.nextInt() % 3);

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            String user;
            System.out.print("AI 가위, 바위, 보 게임. (가위=a, 바위=b, 보=c) 입력: ");
            user = in.readLine();

            if (user.equals("a")) {
                if (AI == 0)
                    System.out.println("무승부 (AI :가위, 사람:가위)");
                if (AI == 1)
                    System.out.println("AI  승! (AI :바위, 사람:가위)");
                if (AI == 2)
                    System.out.println("사람 승! (AI :보, 사람:가위)");
            } else if (user.equals("b")) {
                if (AI == 0)
                    System.out.println("사람 승! (AI :가위, 사람:바위)");
                if (AI == 1)
                    System.out.println("무승부 (AI :바위, 사람:바위)");
                if (AI == 2)
                    System.out.println("AI  승! (AI :보, 사람:바위)");
            } else if (user.equals("c")) {
                if (AI == 0)
                    System.out.println("AI  승! (AI :가위, 사람:보)");
                if (AI == 1)
                    System.out.println("사람 승! (AI :바위, 사람:보)");
                if (AI == 2)
                    System.out.println("무승부 (AI :보, 사람:보)");
            }

        }
    }
}