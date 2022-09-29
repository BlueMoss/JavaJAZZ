import java.awt.*;
import javax.swing.*;

public class Q3 extends JFrame {
    Q3() {
        setTitle("색상 선택기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 220);
        setVisible(true);
    }

    void showNorth() {
        String[] color = { "빨간색", "초록색", "파란색" };

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JComboBox<String> cb = new JComboBox<>(color);

        panel.add(cb);

        add(panel, BorderLayout.NORTH);
    }

    void showCenter() {

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox b1 = new JCheckbox("배경색");
        JCheckBox b2 = new JCheckbox("전경색");

        c.add(b1);
        c.add(b2);

        add(c, BorderLayout.CENTER);
    }

    void showSouth() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton yes = new JButton("예");
        JButton no = new JButton("아니오");

        panel.add(yes);
        panel.add(no);

        add(panel, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new Q3();
    }

}
