//연습이 필요합니다...

package chap15;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest extends JFrame {
    JLabelTest() {
        setTitle("도장 이미지 출력하기");

        ImageIcon icon = new ImageIcon(this.getClass().getResource("오세빈_도장_02.jpg"));
        JLabel label = new JLabel("오세빈_도장_02.jpg", icon, JLabel.CENTER);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelTest();
    }
}