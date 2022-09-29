public class OddEven {
    public String oddEvenMethod(int value) { // 메소드를 사용한 경우
        String oddEven = "";
        if (value % 2 != 0) { // 홀수
            oddEven = "홀수";
        } else if (value % 2 == 0) { // 짝수
            oddEven = "짝수";
        } else {
            // 홀수 짝수 아님
        }
        return oddEven; // 반환
    }

    public static void main(String[] args) {
        System.out.println("홀수 예제 : " + 1 % 2);
        System.out.println("짝수 예제 : " + 2 % 2);

        OddEven oee = new OddEven(); // 객체화
        System.out.println(oee.oddEvenMethod(3)); // 홀수
        System.out.println(oee.oddEvenMethod(4)); // 짝수
    }
}