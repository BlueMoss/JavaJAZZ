class Person {
    String name;
    int age;
    String home;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setHome(String home) {
        this.home = home;
        return this;
    }

    public void sayHello() {
        System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야.");
        System.out.println("나는 " + home + "에 살고있어.");
    }

    public void whoami() {
    }
}

public class MethodChain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("오세빈").setAge(25).setHome("서울").sayHello();
    }
}