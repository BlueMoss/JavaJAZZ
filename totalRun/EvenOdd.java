public class EvenOdd {
    public static void main(String[] args) {
        checkEvenOdd(1);
        checkEvenOdd(2);
        checkEvenOdd(3);
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}