package snail;

public class snail {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        int input = 5;
        int i, j;
        int k = 1;
        int right = 0;
        int bottom = -1;
        int top = 1;

        for (i = input; i >= 0; i--) {

            for (j = 0; j < input; j++) {
                bottom = bottom + top;
                arr[right][bottom] = k;
                k++;
            }

            input--;

            for (j = 0; j < input; j++) {
                right += right + top;
                arr[right][bottom] = k;
                k++;
            }

            top = top * (-1);
        }

        // 출력
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}