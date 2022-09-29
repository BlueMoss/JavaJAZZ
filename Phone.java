//개발자_오세빈_자바//

class Telephone {
    String model;
    int value;

    void print() {
        System.out.println(value + "만 원짜리 " + model + " 스마트폰 ");

    }
}

// model과 value라는 필드와 print() 메서드를 가진 클래스 생성//

public class Phone {
    public static void main(String[] args) {
        Telephone myPhone = new Telephone();
        // Telephone 타입의 객체를 생성한 후 myPhone이라는 참조 변수에 대입//
        myPhone.model = "갤럭시 S8";
        myPhone.value = 100;
        // 객체의 필드에 값을 대입//
        myPhone.print();
        // 객체의 메서드를 호출//

        Telephone yourPhone = new Telephone();
        // yourPhone이라는 참조 변수에 대입//
        yourPhone.model = "G6";
        yourPhone.value = 85;
        // 객체의 필드에 값을 대입//
        yourPhone.print();
        // 객체의 메서드를 호출//

    }
}