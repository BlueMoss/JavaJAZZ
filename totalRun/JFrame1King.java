import javax.swing.*;

public class JFrame1King extends JFrame {
    JFrame1King() {
        setTitle("Hello, Swing");

        JButton b = new JButton("Click!");
        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame1King();
    }

}
