package jazz;

interface Talkable {
    void talk();
}

class Korean implements Talkable {
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable {
    public void talk() {
        System.out.println("Hello!");
    }
}

class Franch implements Talkable {
    public void talk() {
        System.out.println("Bonjour!");
    }
}

public class TalkableTest {
    static void speak(Talkable t) {
        t.talk();
    };

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
        speak(new Franch());
    }
}
