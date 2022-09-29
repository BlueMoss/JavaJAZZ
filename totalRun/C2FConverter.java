
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C2FConverter extends JFrame {
    public C2FConverter() {
        setTitle("섭씨->화씨 변환");

        JPanel p1 = new JPanel();
        JLabel cLabel = new JLabel("섭씨", JLabel.LEFT);
        JTextField cTemp = new JTextField(10);
        p1.add(cLabel);
        p1.add(cTemp);

        JPanel p2 = new JPanel();
        JLabel fLabel = new JLabel("화씨", JLabel.LEFT);
        JTextField fTemp = new JTextField(10);
        fTemp.setEditable(false);
        p2.add(fLabel);
        p2.add(fTemp);

        JPanel p3 = new JPanel();
        JButton b = new JButton("변환");
        p3.add(b);

        b.addActionListener(e -> {
            if (cTemp.getText().isEmpty())
                fTemp.setText("???????");
            else {
                String s = cTemp.getText();
                double c = Double.parseDouble(s);
                double f = c * 9.0 / 5.0 + 32;
                fTemp.setText("" + f);
            }
        });

        JPanel panel = new JPanel();

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 140);
        setVisible(true);
    }

    public static void main(String[] args) {
        new C2FConverter();
    }

}
