package jazz;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}

class Student extends Person {
    int class_num;

    Student(String name, int age, int class_num) {
        super(name, age);
        this.class_num = class_num;
    }

    int getClass_num() {
        return class_num;
    }

    void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + "]");
    }
}

class ForeignStudent extends Student {
    String country;

    ForeignStudent(String name, int age, int class_num, String country) {
        super(name, age, class_num);
        this.country = country;
    }

    String getCountry() {
        return country;
    }

    void setCountry(String country) {
        this.country = country;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + ", 국적 : " + country + "]");
    }
}

public class jazz02 {
    public static void main(String[] args) {
        Person[] p = { new Person("길동이", 22), new Student("황진이", 22, 100),
                new ForeignStudent("Amy", 30, 200, "U.S.A") };
        for (Person k : p) {
            System.out.println(k.show());
        }
    }
}