import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionAdapter extends JFrame {
    public MouseMotionAdapter() {
        setTitle("MouseMotionAdapter");

        JLabel label = new JLabel("MovingTable");
        label.setForeground(Color.RED);
        add(label);

        addMouseMotionListener(new MyMouseMotionAdapter(label));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMotionAdapter();
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter {
    JLabel label;

    public MyMouseMotionAdapter(JLabel label) {
        this.label = label;
    }

    public void mouseMoved(MouseEvent e) {
        label.setLocation(e.getX(), e.getY() - 50);
    }
}