import javax.swing.*;

public class JFrame0Queen extends JFrame {
    JFrame0Queen() {
        setTitle("개발자_오세빈_All In!");

        JPanel b = new JPanel();
        JLabel i = new JLabel("개발자_오세빈_All In!");
        JButton p = new JButton("Call!");
        b.add(i);
        b.add(p);
        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame0Queen();
    }

}
