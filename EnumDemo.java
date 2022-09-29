public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        if (gender == Gender.MALE)
            System.out.println(Gender.MALE + "은 병역의 의무가 있다.");
        else if (gender == Gender.X)
            System.out.println(Gender.X + "는 병역 기피자이다?");
        else
            System.out.println(Gender.FEMALE + "은 병역의 의무가 없다.");

        for (Gender g : Gender.values())
            System.out.println(g.name());

        System.out.println(Gender.valueOf("MALE"));
        System.out.println(Gender.valueOf("X"));
    }
}

enum Gender {
    MALE("남성"), FEMALE("여성"), X("성전환자");

    private String s;

    Gender(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}