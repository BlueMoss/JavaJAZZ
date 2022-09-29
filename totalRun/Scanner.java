import java.util.Scanner;

class Rect {// 직사각형 클래스 설계

    // 데이터 ( 속성, 상태) → 변수
    int w, h; // 가로 세로

    // 기능 (동작, 행위) →메소드
    void input() { // 가로세로입력()
                   // 사용자로 부터 가로,세로를 입력 받기 때문에 매개변수 필요없음
                   // 반환값이 없으면 void 사용, 없을 때 아무것도 안쓰는 문법은 이미 생성자가 가지고 갔따.

        Scanner sc = new Scanner(System.in);

        System.out.print("가로 입력:");
        w = sc.nextInt();

        System.out.print("세로 입력:");
        h = sc.nextInt();

    }

    int calArea() { // 넓이계산()//모두 멤버이기 때문에
                    // 넓이에 대한 변수가 없으니깐 return 값으로 int 로 곱해서 준다.//객체도 반환해줄수 있음
        int result;
        result = w * h;
        return result; // return 뒤에 적어 봤자 아무 의미 없음

    }

    int calLength() { // 둘레 계산()

        int result;
        result = (w + h) * 2;
        return result;

    }

    void print(int a, int l) {// 결과 출력()//매개변수 이름은 상관없다

        System.out.println("가로 : " + w); // 가로 : 10
        System.out.println("세로 : " + h); // 세로 : 20
        System.out.println("넓이 : " + a); // 넓이 : xxx
        System.out.println("둘레 : " + l); // 둘레 : xxx
    }
}

public class Scanner {

    public static void main(String[] args) {

        // Rect 인스턴스 생성 -- Rect를 사용하려면 객체를 생성해야한다./이제 붕어빵
        Rect ob = new Rect();

        // 입력 메소드 호출
        ob.input();

        // 넓이 연산 메소드 호출
        int area = ob.calArea(); // ob.calArea();호출되면 55라고 값을 두고가서 그걸 담을 변수가 필요

        // 둘레 연산 메소드 호출
        int length = ob.calLength();

        // 결과 메소드 호출
        ob.print(area, length);

    }
}
