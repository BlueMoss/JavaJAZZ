
import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutTest_Q6 extends JFrame {
    public BoxLayoutTest_Q6() {
        setTitle("박스 레이아웃");

        JPanel p = new JPanel();
        BoxLayout boxLayout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(boxLayout);
        for (int i = 1; i <= 5; i++) {
            p.add(new JButton("버튼  " + i));
        }

        add(p, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest_Q6();
    }
}