import javax.swing.JFrame;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Hello, Swing");
        setSize(500, 500);
        setVisible(true);
    }
}

public class JFrame1Demo {
    public static void main(String[] args) {
        new MyFrame();
    }
}