public class Pyramid {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int num = 6;

        for (i = 0; i < num; i++) {
            for (j = 1; j < num - i; j++) {
                System.out.print("");
            }
            for (k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}