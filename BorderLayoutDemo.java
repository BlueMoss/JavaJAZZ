import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {
    BorderLayoutDemo() {
        setTitle("Border Layout!");
        setLayout(new BorderLayout());

        add("East", new JButton("백호"));
        add("West", new JButton("청룡"));
        add("South", new JButton("주작"));
        add(new JButton("현무"), BorderLayout.NORTH);
        add(new JButton("오세빈"), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }

}