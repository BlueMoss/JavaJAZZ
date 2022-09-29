package jazz;

public class Xbox implements Controllable {

    @Override
    public void turnOn() {
        System.out.println("Xbox를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Xbox를 끈다.");
    }
}