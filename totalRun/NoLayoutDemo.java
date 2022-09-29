import javax.swing.*;

public class NoLayoutDemo extends JFrame {
    NoLayoutDemo() {
        setTitle("절대 위치로 배치 !");

        JPanel p = new JPanel();
        p.setLayout(null);

        JButton b1 = new JButton("X 1");
        b1.setBounds(10, 10, 60, 30);

        JButton b2 = new JButton("X 2");
        b2.setBounds(50, 20, 80, 30);

        JButton b3 = new JButton("Y 1");
        b3.setBounds(80, 50, 110, 40);

        JButton b4 = new JButton("Y 2");
        b4.setBounds(110, 110, 160, 70);

        JButton b5 = new JButton("Z 1");
        b5.setBounds(150, 30, 100, 30);

        JButton b6 = new JButton("Z 2");
        b6.setBounds(80, 90, 130, 20);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NoLayoutDemo();
    }

}
