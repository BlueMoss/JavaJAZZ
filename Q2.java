import java.awt.*;
import javax.swing.*;

public class Q2 extends JFrame {
    Q2() {
        setTitle("섭씨->화씨 변환");

        setLayout(new BorderLayout(10, 10));
        showCenter();
        showSouth();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    void showCenter() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(1, 0));

        JLabel l1 = new JLabel("섭씨");
        JLabel l2 = new JLabel("화씨");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton con = new JButton("변환");

        panel.add(con);

        add(panel, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new Q2();
    }

}
