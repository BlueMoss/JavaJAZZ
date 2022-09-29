import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame {

    CardLayout layout;

    public void rotate() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
            layout.next(this.getContentPane());
        }
    }

    CardLayoutDemo() {
        setTitle("Card Layout!");
        layout = new CardLayout();
        setLayout(layout);

        add(new JButton("백호"));
        add(new JButton("청룡"));
        add(new JButton("주작"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemo().rotate();
    }

}