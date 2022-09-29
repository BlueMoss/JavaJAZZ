import javax.swing.*;

public class Scroll extends JFrame {
    Scroll() {
        setTitle("스크롤바");

        JLabel label = new JLabel("", JLabel.CENTER);

        JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL);
        bar.setValues(0, 5, 0, 105);
        bar.addAdjustmentListener(e -> {
            int v = e.getValue();
            label.setText("위치 : " + v);
        });

        add("Center", label);
        add("North", bar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Scroll();
    }
}