public class While01 {
    public static void main(String[] args) {
        int row = 2;
        while (row < 20) {
            int column = 1;
            while (column < 20) {
                System.out.printf("%4d", row * column);
                column++;
            }
            System.out.println();
            row++;
        }
    }
}