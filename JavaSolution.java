//s

import java.util.Scanner;

public class Solution {

    static int dr[] = { 1, 0, -1, 0 };
    static int dc[] = { 0, 1, 0, -1 };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("#" + (i + 1));
            int n = sc.nextInt();
            int num = 1;
            int arr[][] = new int[n][n];

            int x = 0;
            int y = 0;
            arr[y][x] = num++;
            int cur = 0; // 진행 방향 0, 1, 2, 3, ... 증가

            while (true) {
                if (num > n * n)
                    break;
                int dy = y + dc[cur % 4];
                int dx = x + dr[cur % 4];

                if (dy < 0 || dy >= n || dx < 0 || dx >= n || arr[dy][dx] != 0) {
                    cur += 1;
                    continue;
                }
                arr[dy][dx] = num++;
                y = dy;
                x = dx;
            }

            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    System.out.print(arr[j][j2] + " ");
                }
                System.out.println();
            }

        }
        sc.close();
    }

}
