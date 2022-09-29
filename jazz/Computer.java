package jazz;

public class Computer implements Controllable {

    @Override
    public void turnOn() {
        System.out.println("PC를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("PC를 끈다.");
    }
}