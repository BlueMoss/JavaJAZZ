package jazz;

import jazz.Computer;
import jazz.Controllable;
import jazz.TV;
import jazz.Xbox;

public class ControllableDemo {
    public static void main(String[] args) {
        Controllable[] controllable = { new TV(), new Computer(), new Xbox() };

        for (Controllable c : controllable) {
            c.turnOn();
            c.turnOff();
            c.repair();
        }

        Controllable.reset();

    }
}