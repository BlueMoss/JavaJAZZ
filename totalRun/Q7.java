
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Q7 extends JFrame {
    public Q7() {
        setTitle("카드 레이아웃");

        JPanel p1 = new JPanel(new GridLayout(0, 4, 10, 0));
        p1.add(new JButton("<<"));
        p1.add(new JButton("<"));
        p1.add(new JButton(">"));
        p1.add(new JButton(">>"));
        add("North", p1);

        JPanel p2 = new JPanel(new CardLayout());
        for (int i = 1; i <= 5; i++) {
            p2.add(new JButton("카드 번호 " + i + "!"));
        }
        add("Center", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q7();
    }
}