import java.awt.event.*;
import javax.swing.*;

public class OhEvent extends JFrame {
    OhEvent() {
        setTitle("OhEvent!");

        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You Click me!");
            }
        };

        JButton b = new JButton("Click");
        b.addActionListener(l);

        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OhEvent();
    }
}