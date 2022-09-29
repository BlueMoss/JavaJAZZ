public class OneToThousand {
    static int sumOneToThousand;

    static {
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
            sum += i;
        sumOneToThousand = sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOneToThousand);
    }
}