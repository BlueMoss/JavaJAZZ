import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame {
    GridLayoutDemo() {
        setTitle("Grid Layout!");
        setLayout(new GridLayout(0, 3));

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
        new GridLayoutDemo();
    }

}