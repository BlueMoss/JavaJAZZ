// p.682 도전과제 03

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterTest02 extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JButton b1;
    Thread thread;

    CounterTest02() {
        setTitle("카운터");

        JPanel p1 = new JPanel();
        label = new JLabel("개수 = 0");
        p1.add(label);
        add("Center", p1);

        JPanel p2 = new JPanel();
        b1 = new JButton("시작");
        b1.addActionListener(this);
        p2.add(b1);
        add("South", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (thread == null || thread.isAlive() == false) {
            b1.setText("중지");
            thread = new Thread(new Counter());
            thread.setDaemon(true);
            thread.start();
        } else {
            b1.setText("계속");
            thread.interrupt();
        }
    }

    public static void main(String[] args) {
        new CounterTest02();
    }

    class Counter implements Runnable {
        public void run() {
            while (true) {
                count++;
                label.setText("개수 = " + count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    return;
                }
            }
        }
    }
}