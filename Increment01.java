public class Increment01 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Increment() 메서드를 호출하기 전의 x는 " + x);
        increment(x);
        System.out.println("Increment() 메서드를 호출한 후의 x는 " + x);
    }

    public static void increment(int n) {
        System.out.println("Increment() 메서드를 시작할 때의 n은 " + n);
        n++;
        System.out.println("Increment() 메서드가 끝날때의 n은 " + n);
    }
}