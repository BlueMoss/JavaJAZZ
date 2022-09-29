package Generic;

class Npc4 {
    public String toString() {
        return "This is a Npc4.";
    }
}

class Tank4 {
    public String toString() {
        return "This is a Tank4.";
    }
}

class Camp4 {
    private Object unit;

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return unit;
    }
}

public class Ex04_MyGame4 {
    public static void main(String[] args) {
        Camp4 human = new Camp4();
        Camp4 machine = new Camp4();

        human.set(new String("난 공룡!"));
        machine.set("난 우주인!");

        // Npc3 hUnit = (Npc3) human.get();
        // Tank3 mUnit = (Tank3) machine.get();

        System.out.println(human.get());
        System.out.println(machine.get());

    }
}